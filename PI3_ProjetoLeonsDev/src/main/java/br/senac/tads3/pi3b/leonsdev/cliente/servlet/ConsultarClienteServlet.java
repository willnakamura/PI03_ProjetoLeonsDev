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
import java.io.IOException;
import java.util.List;
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
@WebServlet(name = "ConsultarClienteServlet", urlPatterns = {"/ConsultarCliente"})
public class ConsultarClienteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String cpfCli = request.getParameter("buscaCliente");
        HttpSession sessao = request.getSession();
        sessao.setAttribute("buscar", cpfCli);
        
        Cliente cli = new Cliente();

        try {

            if (cpfCli == null || cpfCli.trim().equals("")) {
                List<Cliente> listaCli = ServicoCliente.listarCliente();

                sessao.setAttribute("ResultClienteLista", listaCli);

            } else {
                cli = ServicoCliente.procurarCliente(cpfCli);
                sessao.setAttribute("ResultCli", cli);
            }

        } catch (DataExceptions | ClienteException e) {
            request.setAttribute("erro", e.getMessage());
        }

        RequestDispatcher rd = request.getRequestDispatcher("/consultarCliente.jsp");
        rd.forward(request, response);
    }
}
