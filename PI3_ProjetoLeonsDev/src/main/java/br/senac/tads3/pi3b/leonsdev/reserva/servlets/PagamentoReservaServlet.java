/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.leonsdev.reserva.servlets;

import br.senac.tads3.pi3b.leonsdev.cliente.classes.Cliente;
import br.senac.tads3.pi3b.leonsdev.exceptions.DataExceptions;
import br.senac.tads3.pi3b.leonsdev.login.classes.Login;
import br.senac.tads3.pi3b.leonsdev.login.classes.SingletonLogin;
import br.senac.tads3.pi3b.leonsdev.passageiros.classes.Passageiros;
import br.senac.tads3.pi3b.leonsdev.reserva.classes.Reserva;
import br.senac.tads3.pi3b.leonsdev.servico.classes.Servico;
import br.senac.tads3.pi3b.leonsdev.usuario.classes.ServicoUsuario;
import br.senac.tads3.pi3b.leonsdev.usuario.classes.Usuario;
import br.senac.tads3.pi3b.leonsdev.voos.classes.ServicoVoos;
import br.senac.tads3.pi3b.leonsdev.voos.classes.Voos;
import java.io.IOException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
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
@WebServlet(name = "PagamentoReservaServlet", urlPatterns = {"/PagamentoReserva"})
public class PagamentoReservaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Calendar calendario = Calendar.getInstance();
        HttpSession sessao = request.getSession();

        String pagamento = request.getParameter("pagamento");

        Reserva reserva = new Reserva();

        reserva.setFormaPgto(pagamento);
        reserva.setCliente((Cliente) sessao.getAttribute("clienteSelectReserva"));
        reserva.setDataReserva(calendario.getTime());

        Usuario usu = new Usuario();
//        Login log = new Login();
//        
//        try {
//            usu = ServicoUsuario.ObterUsuario(log.getFuncID());
//        } catch (Exception e) {
//            e.getMessage();
//        }

        SingletonLogin singleton = SingletonLogin.getInstance();

        try {
            usu = ServicoUsuario.ObterUsuario(singleton.getFunc_id());
        } catch (Exception e) {
            e.getMessage();
        }

        reserva.setUsuario(usu);
        reserva.setVendedor(usu.getNome());

        int qtdPass = (int) sessao.getAttribute("qtdPassageirosReserva");
        Passageiros pass1 = new Passageiros();
        Passageiros pass2 = new Passageiros();
        Passageiros pass3 = new Passageiros();

        if (qtdPass == 1) {
            pass1 = (Passageiros) sessao.getAttribute("Passageiro1");
        } else if (qtdPass == 2) {
            pass1 = (Passageiros) sessao.getAttribute("Passageiro1");
            pass2 = (Passageiros) sessao.getAttribute("Passageiro2");
        } else if (qtdPass == 3) {
            pass1 = (Passageiros) sessao.getAttribute("Passageiro1");
            pass2 = (Passageiros) sessao.getAttribute("Passageiro2");
            pass3 = (Passageiros) sessao.getAttribute("Passageiro3");
        }

        Servico serv = new Servico();
        String servBag = null;
        Double precoBagagem = (Double) sessao.getAttribute("bagagem");
        if (precoBagagem == 20.90d) {
            servBag = "5Kg";
            serv.setExtraBag(servBag);
            serv.setPreco(precoBagagem);
        }else if (precoBagagem == 39.90d) {
            servBag = "10Kg";
            serv.setExtraBag(servBag);
            serv.setPreco(precoBagagem);
        }else if (precoBagagem == 79.90d) {
            servBag = "20Kg";
            serv.setExtraBag(servBag);
            serv.setPreco(precoBagagem);
        }
        
        Voos vooIda = new Voos();
        Voos vooVolta = new Voos();
        int opcao = (int) sessao.getAttribute("opcaoIdaOuIdaVolta");
        
        if(opcao == 0){
            int idIda = (int) sessao.getAttribute("idVooIda");
            int idVolta = (int) sessao.getAttribute("idVooVolta");
            try {
                vooIda = ServicoVoos.obterVoo(idIda);
                vooVolta = ServicoVoos.obterVoo(idVolta);
            } catch (DataExceptions ex) {
               ex.getMessage();
            }
            reserva.setCustoTotal(vooIda.getTarifa() + serv.getPreco() + vooVolta.getTarifa());
        }else if(opcao == 1){
            int idIda = (int) sessao.getAttribute("idVooIda");
            
            try {
                vooIda = ServicoVoos.obterVoo(idIda);
                
            } catch (DataExceptions ex) {
               ex.getMessage();
            }
            reserva.setCustoTotal(vooIda.getTarifa() + serv.getPreco());
        }
        

    }
}
