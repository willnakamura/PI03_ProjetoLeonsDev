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
import java.util.ArrayList;
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
        PassageirosVoos passVoosVolta = new PassageirosVoos();

        SimpleDateFormat dataForm = new SimpleDateFormat("yyyy-MM-dd");

        String qtdPassString = (String) sessao.getAttribute("qtdpax");
        int qntPass = Integer.parseInt(qtdPassString);
        String qtdPassReservaString = (String) sessao.getAttribute("qtdPassageirosReserva");
        int qtdPassReserva = Integer.parseInt(qtdPassReservaString);
        //sessao.setAttribute("qtdPassReserva", qtdPassReserva);

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

        try {

            ValidadorPassageiros.Validar(pass);

        } catch (PassageirosException e) {
            request.setAttribute("erroPassageiro", e.getMessage());

            RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaPassageiros.jsp");
            dispatcher.forward(request, response);

        }

        //-------------------------------Reserva----------------------------------------------------------
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

        if (bagagem.equals("5Kg")) {
            precoBag = 20.9d;
            serv.setExtraBag(bagagem);
            serv.setPreco(precoBag);

        } else if (bagagem.equals("10Kg")) {
            precoBag = 39.9d;
            serv.setExtraBag(bagagem);
            serv.setPreco(precoBag);

        } else if (bagagem.equals("20Kg")) {
            precoBag = 79.9d;
            serv.setExtraBag(bagagem);
            serv.setPreco(precoBag);
        } else if(bagagem.equals("0Kg")){
            precoBag = 0.0d;
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

            passVoos.setIdVoo(vooIda.getId());
            passVoosVolta.setIdVoo(vooVolta.getId());
            passVoos.setAssento(assento);
            passVoos.setPassageiro(pass);
            passVoosVolta.setAssento(assento);
            passVoosVolta.setPassageiro(pass);

            int quantidadePass = (int) sessao.getAttribute("qtdpax");

            reserva.setCustoTotal((vooIda.getTarifa() * quantidadePass) + serv.getPreco() + (vooVolta.getTarifa() * quantidadePass));

        } else if (opcao.equals("1")) {
            int idIda = (int) sessao.getAttribute("idVooIda");

            try {
                vooIda = ServicoVoos.obterVoo(idIda);

            } catch (DataExceptions ex) {
                ex.getMessage();
            }

            
//            passVoos.setVoos(voos);
            passVoos.setIdVoo(vooIda.getId());
            passVoos.setAssento(assento);
            passVoos.setPassageiro(pass);
            
            
            int quantidadePass = qtdPassReserva;

            double tarifa = vooIda.getTarifa();
            double servPreco = serv.getPreco();

            double soma = (vooIda.getTarifa() * qtdPassReserva) + serv.getPreco();

            reserva.setCustoTotal((vooIda.getTarifa() * qtdPassReserva) + serv.getPreco());
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

        if (qntPass == 1) {
            sessao.setAttribute("Passageiro1", pass);
            sessao.setAttribute("PassageiroVoo1", passVoos);
            sessao.setAttribute("assentoPass", assento);

        } else if (qntPass == 2) {
            sessao.setAttribute("Passageiro2", pass);
            sessao.setAttribute("PassageiroVoo2", passVoos);
            qntPass--;
            sessao.setAttribute("qtdpax", qntPass);

            request.setAttribute("nPassPag", 2);
            sessao.setAttribute("assentoPass", assento);

            RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaPassageiros.jsp");
            dispatcher.forward(request, response);

        } else if (qntPass == 3) {
            sessao.setAttribute("Passageiro3", pass);
            sessao.setAttribute("PassageiroVoo3", passVoos);

            qntPass--;
            sessao.setAttribute("qtdpax", qntPass);
            request.setAttribute("nPassPag", 3);
            sessao.setAttribute("assentoPass", assento);

            RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaPassageiros.jsp");
            dispatcher.forward(request, response);
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaPagamento.jsp");
        dispatcher.forward(request, response);
    }
}
