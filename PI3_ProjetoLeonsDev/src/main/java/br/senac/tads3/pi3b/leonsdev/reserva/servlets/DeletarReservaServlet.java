/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.leonsdev.reserva.servlets;

import br.senac.tads3.pi3b.leonsdev.login.classes.SingletonLogin;
import br.senac.tads3.pi3b.leonsdev.reserva.classes.ServicoConsultaCancelaReserva;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Rafael
 */
@WebServlet(name = "DeletarReservaServlet", urlPatterns = {"/DeletarReserva"})
public class DeletarReservaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession sessao = request.getSession();
        SingletonLogin singleton = SingletonLogin.getInstance();

        String id = request.getParameter("selecionarRes");

        if (id == null || id.trim().equals("")) {
            request.setAttribute("erroCancelamento", "favor selecione uma reserva para ser cancelada.");
            if (singleton.getCargo().equals("Gerente")) {
                RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaConsultaRetornaVoo.jsp");
                dispatcher.forward(request, response);
                return;
            } else {
                RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaConsultaRetornaVooUsuario.jsp");
                dispatcher.forward(request, response);
                return;
            }
        }
        
        int idReserva = Integer.parseInt(id);
        
        try {
            ServicoConsultaCancelaReserva.DeletarReserva(idReserva);
        } catch (Exception e) {
            request.setAttribute("erroCancelamento", e.getMessage());
            if (singleton.getCargo().equals("Gerente")) {
                RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaConsultaRetornaVoo.jsp");
                dispatcher.forward(request, response);
                return;
            } else {
                RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaConsultaRetornaVooUsuario.jsp");
                dispatcher.forward(request, response);
                return;
            }
        }
        
        if (singleton.getCargo().equals("Gerente")) {
                RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaConsultaRetornaVoo.jsp");
                dispatcher.forward(request, response);
                
            } else {
                RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaConsultaRetornaVooUsuario.jsp");
                dispatcher.forward(request, response);
                
            }
        

    }
}
