/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.leonsdev.reserva.servlets;

import br.senac.tads3.pi3b.leonsdev.cliente.classes.Cliente;
import br.senac.tads3.pi3b.leonsdev.exceptions.DataExceptions;
import br.senac.tads3.pi3b.leonsdev.exceptions.PassageirosException;
import br.senac.tads3.pi3b.leonsdev.login.classes.SingletonLogin;
import br.senac.tads3.pi3b.leonsdev.passageiros.classes.Passageiros;
import br.senac.tads3.pi3b.leonsdev.passageiros.classes.PassageirosVoos;
import br.senac.tads3.pi3b.leonsdev.passageiros.classes.ValidadorPassageiros;
import br.senac.tads3.pi3b.leonsdev.reserva.classes.Reserva;
import br.senac.tads3.pi3b.leonsdev.servico.classes.Servico;
import br.senac.tads3.pi3b.leonsdev.usuario.classes.ServicoUsuario;
import br.senac.tads3.pi3b.leonsdev.usuario.classes.Usuario;
import br.senac.tads3.pi3b.leonsdev.voos.classes.ServicoVoos;
import br.senac.tads3.pi3b.leonsdev.voos.classes.Voos;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Nakamura-PC
 */
@WebServlet(name = "PassageirosReservaServlet", urlPatterns = {"/PassageirosReserva"})
public class PassageirosReservaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession sessao = request.getSession();
        Passageiros pass = new Passageiros();
        PassageirosVoos passVoos = new PassageirosVoos();

        SimpleDateFormat dataForm = new SimpleDateFormat("yyyy-MM-dd");
        int qntPass = (int) sessao.getAttribute("qtdpax");

        String nome = request.getParameter("nome-pass-selecionar");
        String sobreNome = request.getParameter("sobreNome-pass-selecionar");
        String cpf = request.getParameter("cpf-pass-selecionar");

        String dataNascString = request.getParameter("dtNasc-pass-selecionar");
        Date dataNasc = null;

        try {

            dataNasc = dataForm.parse(dataNascString);

        } catch (Exception e) {
            e.getMessage();
        }

        String email = request.getParameter("email-pass-selecionar");
        String assento = request.getParameter("assentosPassageiro");

        pass.setNome(nome);
        pass.setSobrenome(sobreNome);
        pass.setCpf(cpf);
        pass.setDataNascimento(dataNasc);
        pass.setEmail(email);

        passVoos.setAssento(assento);
        passVoos.setPassageiro(pass);

        try {

            ValidadorPassageiros.Validar(pass);

        } catch (PassageirosException e) {
            request.setAttribute("erroPassageiro", e.getMessage());

            RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaPassageiros.jsp");
            dispatcher.forward(request, response);

        }

        if (qntPass == 1) {
            sessao.setAttribute("Passageiro1", pass);
            sessao.setAttribute("PassageiroVoo1", passVoos);

        } else if (qntPass == 2) {
            sessao.setAttribute("Passageiro2", pass);
            sessao.setAttribute("PassageiroVoo2", passVoos);
            qntPass--;
            sessao.setAttribute("qtdpax", qntPass);
            RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaPassageiros.jsp");
            dispatcher.forward(request, response);

        } else if (qntPass == 3) {
            sessao.setAttribute("Passageiro3", pass);
            sessao.setAttribute("PassageiroVoo3", passVoos);

            qntPass--;
            sessao.setAttribute("qtdpax", qntPass);
            RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaPassageiros.jsp");
            dispatcher.forward(request, response);
        }

        //-----------------------------------------------------------------------------------------
        Calendar calendario = Calendar.getInstance();
        Reserva reserva = new Reserva();


        reserva.setCliente((Cliente) sessao.getAttribute("clienteSelectReserva"));
        reserva.setDataReserva(calendario.getTime());

        Usuario usu = new Usuario();
        SingletonLogin singleton = SingletonLogin.getInstance();

        try {
            usu = ServicoUsuario.ObterUsuario(singleton.getFunc_id());
        } catch (Exception e) {
            e.getMessage();
        }

        reserva.setUsuario(usu);
        reserva.setVendedor(usu.getNome());        

        Servico serv = new Servico();
        Double precoBag = null;
        String bagagem = (String) sessao.getAttribute("bagagem");

        if (bagagem.equals("5")) {
            precoBag = 20.9;
            serv.setExtraBag(bagagem);
            serv.setPreco(precoBag);

        } else if (bagagem.equals("10")) {
            precoBag = 39.9;
            serv.setExtraBag(bagagem);
            serv.setPreco(precoBag);

        } else if (bagagem.equals(79.90)) {
            precoBag = 79.9;
            serv.setExtraBag(bagagem);
            serv.setPreco(precoBag);
        }

        Voos vooIda = new Voos();
        Voos vooVolta = new Voos();
        String opcao = (String) sessao.getAttribute("opcaoIdaOuIdaVolta");

        if (opcao.equals("0")) {
            int idIda = (int) sessao.getAttribute("idVooIda");
            int idVolta = (int) sessao.getAttribute("idVooVolta");

            try {
                vooIda = ServicoVoos.obterVoo(idIda);
                vooVolta = ServicoVoos.obterVoo(idVolta);
            } catch (DataExceptions ex) {
                ex.getMessage();
            }
            reserva.setCustoTotal(vooIda.getTarifa() + serv.getPreco() + vooVolta.getTarifa());

        } else if (opcao.equals("1")) {
            int idIda = (int) sessao.getAttribute("idVooIda");

            try {
                vooIda = ServicoVoos.obterVoo(idIda);

            } catch (DataExceptions ex) {
                ex.getMessage();
            }
            reserva.setCustoTotal(vooIda.getTarifa() + serv.getPreco());
        }
        
        sessao.setAttribute("ReservaFinal", reserva);
        sessao.setAttribute("ServicoReservaFinal", serv);
        sessao.setAttribute("VooIdaReservaFinal", vooIda);
        sessao.setAttribute("VooVoltaResrvaFinal", vooVolta);

        Cliente cliente = (Cliente) sessao.getAttribute("clienteSelectReserva");
        String nomePagador = cliente.getNome() + " " + cliente.getSobrenome();
        sessao.setAttribute("nomePagador", nomePagador);
        sessao.setAttribute("custoTotal", reserva.getCustoTotal());
        //---------------------------------------------------------------------------------------------
        RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaPagamento.jsp");
        dispatcher.forward(request, response);
    }
}
