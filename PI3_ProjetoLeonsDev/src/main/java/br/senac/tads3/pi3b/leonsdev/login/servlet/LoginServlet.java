/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.leonsdev.login.servlet;

import br.senac.tads3.pi3b.leonsdev.exceptions.DataExceptions;
import br.senac.tads3.pi3b.leonsdev.exceptions.LoginException;
import br.senac.tads3.pi3b.leonsdev.login.classes.Login;
import br.senac.tads3.pi3b.leonsdev.login.classes.ServicoLogin;
import br.senac.tads3.pi3b.leonsdev.login.classes.SingletonLogin;
import br.senac.tads3.pi3b.leonsdev.voos.classes.ServicoAeroportos;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        HttpSession sessao = request.getSession();
        //------------pre operações para carregamento de dropBox---------

        //-------------operaçoes de login----------------------------------
        // Pega o class="user" e atribui á uma variavel
        String username = request.getParameter("user");

        // Pega o class="password" e atribui á uma variavel
        String password = request.getParameter("password");

        login.setUserName(username);
        login.setSenha(password);

        try {

            ServicoLogin.autenticacao(login);

        } catch (LoginException e) {

            RequestDispatcher dispatcher
                    = request.getRequestDispatcher("/index.jsp");
        } catch (DataExceptions ex) {
            Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
        }

        if ("não logado".equals(SingletonLogin.getInstance().getNome())) {

            request.setAttribute("erroLogin", "Usuário e/ou senha inválido");
            RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
            dispatcher.forward(request, response);

        } else {
            ArrayList aeroportos = null;
            
            try {
                aeroportos = ServicoAeroportos.obterAeroporto();
            } catch (DataExceptions | SQLException ex) {
                ex.getMessage();
            }
            sessao.setAttribute("ListaAeroportos", aeroportos);
            response.sendRedirect(request.getContextPath() + "/Protegido/resultado");

        }

    }
}
