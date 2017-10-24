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
import br.senac.tads3.pi3b.leonsdev.login.classes.ValidadorLogin;

import java.io.IOException;
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

        // Pega o class="user" e atribui á uma variavel
        String username = request.getParameter("user");

        // Pega o class="password" e atribui á uma variavel
        String password = request.getParameter("password");


        login.setUserName(username);
        login.setSenha(password);

       
        try {

            ValidadorLogin.Validar(login);
            ServicoLogin.autenticacao(login);

        } catch (LoginException e) {

            e.printStackTrace();
            RequestDispatcher dispatcher
                    = request.getRequestDispatcher("/index.jsp");
        } catch (DataExceptions ex) {
            Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(SingletonLogin.getInstance().getNome());
        if ("não logado".equals(SingletonLogin.getInstance().getNome())){
                    response.sendRedirect(request.getContextPath() + "/index.jsp");
                    
        } else {
            HttpSession sessao = request.getSession();
        response.sendRedirect(request.getContextPath() + "/Protegido/resultado");
        sessao.setAttribute("nome", "Usuário Master");
        }
        
        
    }
}
