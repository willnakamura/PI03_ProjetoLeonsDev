/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.leonsdev.reserva.servlets;

import br.senac.tads3.pi3b.leonsdev.Telas.classes.TelaSelecionaCliente;
import br.senac.tads3.pi3b.leonsdev.Telas.classes.ValidadorTelaSelecionaCliente;
import br.senac.tads3.pi3b.leonsdev.cliente.classes.Cliente;
import br.senac.tads3.pi3b.leonsdev.cliente.classes.ServicoCliente;
import br.senac.tads3.pi3b.leonsdev.exceptions.ClienteException;
import br.senac.tads3.pi3b.leonsdev.exceptions.DataExceptions;
import br.senac.tads3.pi3b.leonsdev.exceptions.ExceptionTelaSelecionaCliente;
import br.senac.tads3.pi3b.leonsdev.login.classes.SingletonLogin;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Rafael Rodrigues
 */
@WebServlet(name = "ClienteReservaServlet", urlPatterns = {"/ClienteReserva"})
public class ClienteReservaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    //------------------------------------------------------------------
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        SingletonLogin singleton = SingletonLogin.getInstance();
        HttpSession sessao = request.getSession();
        Cliente cli = new Cliente();
        String buscaCli = request.getParameter("buscaCliente");

        TelaSelecionaCliente tela = new TelaSelecionaCliente();
        tela.setCpf(buscaCli.trim());

        try {
            ValidadorTelaSelecionaCliente.validar(tela);
        } catch (DataExceptions | ExceptionTelaSelecionaCliente e) {
            request.setAttribute("erroCampoBusca", e.getMessage());

            if (singleton.getCargo().equals("Gerente")) {
                RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaCliente.jsp");
                dispatcher.forward(request, response);
            } else {
                RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaClienteUsuario.jsp");
                dispatcher.forward(request, response);
            }

        }

        try {
            cli = ServicoCliente.procurarCliente(buscaCli);

            if (cli.getCpf() == null) {
                request.setAttribute("erroSelecionaCli", "A pesquisa não troxe resultado para esta pesquisa.");

                if (singleton.getCargo().equals("Gerente")) {
                    RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaCliente.jsp");
                    dispatcher.forward(request, response);
                } else {
                    RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaClienteUsuario.jsp");
                    dispatcher.forward(request, response);
                }
            } else {
                request.setAttribute("sucessoSelecionaCli", "Pesquisa realizada com sucesso.");
            }

            sessao.setAttribute("clienteSelectReserva", cli);
            request.setAttribute("Cliente", cli);
        } catch (ClienteException | DataExceptions e) {
            request.setAttribute("erroSelecionaCli", e.getMessage());

            if (singleton.getCargo().equals("Gerente")) {
                RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaCliente.jsp");
                dispatcher.forward(request, response);
            } else {
                RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaClienteUsuario.jsp");
                dispatcher.forward(request, response);
            }
        }

        if (singleton.getCargo().equals("Gerente")) {
            RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaCliente.jsp");
            dispatcher.forward(request, response);
        } else {
            RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaClienteUsuario.jsp");
            dispatcher.forward(request, response);
        }
    }
}
