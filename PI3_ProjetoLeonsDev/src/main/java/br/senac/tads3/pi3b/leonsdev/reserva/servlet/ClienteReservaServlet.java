/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.leonsdev.reserva.servlet;

import br.senac.tads3.pi3b.leonsdev.cliente.classes.Cliente;
import br.senac.tads3.pi3b.leonsdev.cliente.classes.ServicoCliente;
import br.senac.tads3.pi3b.leonsdev.exceptions.ClienteException;
import br.senac.tads3.pi3b.leonsdev.exceptions.DataExceptions;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.ws.rs.core.Request;

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
        
        HttpSession sessao = request.getSession();
        Cliente cli = new Cliente();
        String buscaCli = request.getParameter("buscaCliente");
        
        try {
            cli = ServicoCliente.procurarCliente(buscaCli);
        } catch (ClienteException | DataExceptions e) {
            request.setAttribute("erroSelecionaCli", e.getMessage());
        }
        
        sessao.setAttribute("clienteSelectReserva", cli);
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaCliente.jsp");
            dispatcher.forward(request, response);
        
    }

   

}
