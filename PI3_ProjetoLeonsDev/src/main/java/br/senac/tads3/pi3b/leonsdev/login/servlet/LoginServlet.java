/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.leonsdev.login.servlet;

import br.senac.tads3.pi3b.leonsdev.login.classes.Login;
import br.senac.tads3.pi3b.leonsdev.login.classes.ServicoLogin;

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

        Login login = new Login();

        // Pega o class="user" e atribui á uma variavel
        String username = request.getParameter("user");

        // Pega o class="password" e atribui á uma variavel
        String password = request.getParameter("password");


        login.setUserName(username);
        login.setSenha(password);

       
        try {

            ServicoLogin.autenticacao(login);

        } catch (Exception e) {

            e.printStackTrace();
            RequestDispatcher dispatcher
                    = request.getRequestDispatcher("/index.jsp");
        }

        HttpSession sessao = request.getSession();
        response.sendRedirect(request.getContextPath() + "/Protegido/resultado");
        sessao.setAttribute("nome", "Usuário Master");
    }
}
