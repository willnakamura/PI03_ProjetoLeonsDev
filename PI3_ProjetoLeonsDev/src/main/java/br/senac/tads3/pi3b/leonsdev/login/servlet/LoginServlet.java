/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.leonsdev.login.servlet;

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
 * @author Nakamura-PC
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/login"})
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Pega o class="user" e atribui á uma variavel
        String username = request.getParameter("user");
        
        // Pega o class="password" e atribui á uma variavel
        String password = request.getParameter("password");
        HttpSession sessao = request.getSession();

        
        
        
        
        
        //Faz uma verificação generica, que vai ser substituida pela DAO
        if ("master".equals(username) && "1234".equals(password)) {
            sessao.setAttribute("nome", "Usuário Master");
            response.sendRedirect(request.getContextPath() + "/Protegido/resultado");

        } else if ("normal".equals(username) && "1234".equals(password)) {
            sessao.setAttribute("nome", "Usuário normal");
            response.sendRedirect(request.getContextPath() + "/Protegido/resultado");

        } else { // Usuário inválido
            request.setAttribute("Msagem Erro", "Usuário ou senha inválido");
            RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
            dispatcher.forward(request, response);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
