/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.leonsdev.cliente.servlet;

import br.senac.tads3.pi3b.leonsdev.cliente.classes.Cliente;
import java.io.IOException;

import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Nakamura-PC
 */
@WebServlet(name = "ConsultarClienteServlet", urlPatterns = {"/ConsultarClienteServlet"})
public class ConsultarClienteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String cpfCli = request.getParameter("buscaCliente");

        List<Cliente> clientes = null;

        if (" ".equals(cpfCli) || cpfCli == null) {
            
        }

    }
}
