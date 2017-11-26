/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.leonsdev.reserva.servlets;

import br.senac.tads3.pi3b.leonsdev.DAOs.DaoFazerReserva;
import br.senac.tads3.pi3b.leonsdev.Telas.classes.TelaPagamento;
import br.senac.tads3.pi3b.leonsdev.Telas.classes.ValidadorTelaPagamento;
import br.senac.tads3.pi3b.leonsdev.cliente.classes.Cliente;
import br.senac.tads3.pi3b.leonsdev.exceptions.DataExceptions;
import br.senac.tads3.pi3b.leonsdev.exceptions.ExceptionTelaPagamento;
import br.senac.tads3.pi3b.leonsdev.login.classes.SingletonLogin;
import br.senac.tads3.pi3b.leonsdev.passageiros.classes.Passageiros;
import br.senac.tads3.pi3b.leonsdev.passageiros.classes.PassageirosVoos;
import br.senac.tads3.pi3b.leonsdev.reserva.classes.Reserva;
import br.senac.tads3.pi3b.leonsdev.reserva.classes.ServicoReserva;
import br.senac.tads3.pi3b.leonsdev.servico.classes.Servico;
import br.senac.tads3.pi3b.leonsdev.usuario.classes.ServicoUsuario;
import br.senac.tads3.pi3b.leonsdev.usuario.classes.Usuario;
import br.senac.tads3.pi3b.leonsdev.voos.classes.ServicoVoos;
import br.senac.tads3.pi3b.leonsdev.voos.classes.Voos;
import java.io.IOException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
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

        Reserva r = new Reserva();

        String pagamento = request.getParameter("pagamento");
        TelaPagamento tela = new TelaPagamento();
        tela.setPagamento(pagamento);
        try {
            ValidadorTelaPagamento.validar(tela);
        } catch (DataExceptions | ExceptionTelaPagamento e) {
            request.setAttribute("erroPagamento", e.getMessage());
            RequestDispatcher dispatcher = request.getRequestDispatcher("/resrvaPagamento.jsp");
            dispatcher.forward(request, response);
        }

        String qtdPassString = (String) sessao.getAttribute("qtdPassageirosReserva");
        int qtdPass = Integer.parseInt(qtdPassString);
        Passageiros pass1 = new Passageiros();
        Passageiros pass2 = new Passageiros();
        Passageiros pass3 = new Passageiros();
        PassageirosVoos passVoos1 = new PassageirosVoos();
        PassageirosVoos passVoos2 = new PassageirosVoos();
        PassageirosVoos passVoos3 = new PassageirosVoos();
        Passageiros passVetor[] = new Passageiros[qtdPass];
        PassageirosVoos passVoosVetor[] = new PassageirosVoos[qtdPass];

        if (qtdPass == 1) {
            pass1 = (Passageiros) sessao.getAttribute("Passageiro1");
            passVoos1 = (PassageirosVoos) sessao.getAttribute("PassageiroVoo1");
            passVetor[0] = pass1;
            passVoosVetor[0] = passVoos1;
        } else if (qtdPass == 2) {
            pass1 = (Passageiros) sessao.getAttribute("Passageiro1");
            pass2 = (Passageiros) sessao.getAttribute("Passageiro2");
            passVoos1 = (PassageirosVoos) sessao.getAttribute("PassageiroVoo1");
            passVoos2 = (PassageirosVoos) sessao.getAttribute("PassageiroVoo2");
            passVetor[0] = pass1;
            passVetor[1] = pass2;
            passVoosVetor[0] = passVoos1;
            passVoosVetor[1] = passVoos2;
        } else if (qtdPass == 3) {
            pass1 = (Passageiros) sessao.getAttribute("Passageiro1");
            pass2 = (Passageiros) sessao.getAttribute("Passageiro2");
            pass3 = (Passageiros) sessao.getAttribute("Passageiro3");
            passVoos1 = (PassageirosVoos) sessao.getAttribute("PassageiroVoo1");
            passVoos2 = (PassageirosVoos) sessao.getAttribute("PassageiroVoo2");
            passVoos3 = (PassageirosVoos) sessao.getAttribute("PassageiroVoo3");
            passVetor[0] = pass1;
            passVetor[1] = pass2;
            passVetor[2] = pass3;
            passVoosVetor[0] = passVoos1;
            passVoosVetor[1] = passVoos2;
            passVoosVetor[2] = passVoos3;

        }
        r = (Reserva) sessao.getAttribute("ReservaFinal");
        r.setFormaPgto(pagamento);
        sessao.setAttribute("ReservaFinal", r);
        Servico servico = new Servico();
        servico = (Servico) sessao.getAttribute("ServicoReservaFinal");
        Cliente cli = new Cliente();
        cli = (Cliente) sessao.getAttribute("clienteSelectReserva");
        String erro;

        try {
            ServicoReserva.inserirVenda(r, passVetor, passVoosVetor, servico, cli);
        } catch (Exception e) {
            erro = e.getMessage();
            e.printStackTrace();
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaResumoCompraNOVO.jsp");
        dispatcher.forward(request, response);
    }
}
