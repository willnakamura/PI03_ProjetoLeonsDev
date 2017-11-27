/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.leonsdev.cliente.servlet;

import br.senac.tads3.pi3b.leonsdev.cliente.classes.Cliente;
import br.senac.tads3.pi3b.leonsdev.cliente.classes.ServicoCliente;
import br.senac.tads3.pi3b.leonsdev.exceptions.ClienteException;
import br.senac.tads3.pi3b.leonsdev.exceptions.DataExceptions;
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
 * @author Nakamura-PC
 */
@WebServlet(name = "EditarClienteServlet", urlPatterns = {"/EditarCliente"})
public class EditarClienteServlet extends HttpServlet {
//

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession sessao = request.getSession();
        Cliente cliente = new Cliente();
        String cpfCli = request.getParameter("selecionarCli");

        String btnEditar = request.getParameter("btnEditar");
        String btnExcluir = request.getParameter("btnExluir");
//
        if (btnEditar != null) {
            try {
                cliente = ServicoCliente.procurarCliente(cpfCli);

            } catch (DataExceptions | ClienteException e) {
                e.getMessage();
            }

            sessao.setAttribute("cliente", cliente);

            SingletonLogin singleton = SingletonLogin.getInstance();
            if (singleton.getCargo().equals("Gerente")) {
                RequestDispatcher dispatcher = request.getRequestDispatcher("/editarCliente.jsp");
                dispatcher.forward(request, response);
            } else {
                RequestDispatcher dispatcher = request.getRequestDispatcher("/editarClienteUsuario.jsp");
                dispatcher.forward(request, response);
            }

        } else if (btnExcluir != null) {

            try {
                cliente = ServicoCliente.procurarCliente(cpfCli);
                ServicoCliente.excluirCliente(cliente.getId());
            } catch (DataExceptions | ClienteException e) {
                request.setAttribute("erroExcluir", e.getMessage());

            }

            SingletonLogin singleton = SingletonLogin.getInstance();
            if (singleton.getCargo().equals("Gerente")) {
                response.sendRedirect(request.getContextPath() + "/consultarCliente.jsp");
            } else {
                response.sendRedirect(request.getContextPath() + "/consultarClienteUsuario.jsp");
            }

        }
    }

}
