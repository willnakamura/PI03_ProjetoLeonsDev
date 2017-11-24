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
        
        HttpSession sessao = request.getSession();
        Cliente cli = new Cliente();
        String buscaCli = request.getParameter("buscaCliente");
        
        TelaSelecionaCliente tela = new TelaSelecionaCliente();
        tela.setCpf(buscaCli.trim());
        
        try {
            ValidadorTelaSelecionaCliente.validar(tela);
        } catch (DataExceptions | ExceptionTelaSelecionaCliente e) {
            request.setAttribute("erroCampoBusca", e.getMessage());
            
            RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaCliente.jsp");
            dispatcher.forward(request, response);        
        }
        
        
        
        try {
            cli = ServicoCliente.procurarCliente(buscaCli);
            
            if(cli.getCpf().equals("") || cli.getCpf() == null){
                request.setAttribute("erroSelecionaCli", "A pesquisa não troxe resultado para esta pesquisa.");
            
                RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaCliente.jsp");
                dispatcher.forward(request, response);
            }else{
                request.setAttribute("sucessoSelecionaCli", "Pesquisa realizada com sucesso.");
            
                RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaCliente.jsp");
                dispatcher.forward(request, response);
            }
            
            sessao.setAttribute("clienteSelectReserva", cli);
        } catch (ClienteException | DataExceptions e) {
            request.setAttribute("erroSelecionaCli", e.getMessage());
            
            RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaCliente.jsp");
            dispatcher.forward(request, response);        
        }        
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaCliente.jsp");
            dispatcher.forward(request, response);        
    }
}
