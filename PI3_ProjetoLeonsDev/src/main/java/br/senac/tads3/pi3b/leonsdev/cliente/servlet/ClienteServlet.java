/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.leonsdev.cliente.servlet;

import br.senac.tads3.pi3b.leonsdev.cliente.classes.Cliente;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Nakamura-PC
 */
@WebServlet(name = "ClienteServlet", urlPatterns = {"/produto"})
public class ClienteServlet extends HttpServlet {

   /* @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Cliente c1 = new Cliente(1, "John","Smith","11111111","john@gmail.com", "1199999", 
                "SP", "Masc", "SP", "Rua X", "11111", new Date(), true);

        List<Cliente> lista = new ArrayList<Cliente>();
        lista.add(c1);

        request.setAttribute("listaCliente", lista);
        RequestDispatcher dispatcher = request.getRequestDispatcher("Cliente.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }*/
}
