/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.leonsdev.usuario.Servlets;

import br.senac.tads3.pi3b.leonsdev.exceptions.DataExceptions;
import br.senac.tads3.pi3b.leonsdev.exceptions.ExceptionUsuario;
import br.senac.tads3.pi3b.leonsdev.usuario.classes.ServicoUsuario;
import br.senac.tads3.pi3b.leonsdev.usuario.classes.Usuario;
import java.io.IOException;
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
@WebServlet(name = "AtualizarUsuarioServlet", urlPatterns = {"/AtualizarUsuario"})
public class AtualizarUsuarioServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession sessao = request.getSession();
        

        String id = request.getParameter("id-usua");
        int id_vdd = Integer.parseInt(id);
        
        String nome = request.getParameter("nome-usua");
        String sobrenome = request.getParameter("sobrenome-usua");
        String cpf = request.getParameter("cpf-usua");
        String cargo = request.getParameter("cargo-usua");
        String email = request.getParameter("email-usua");
        String login = request.getParameter("login-usua");
        String senha = request.getParameter("senha-usua");
        
        Usuario usu = new Usuario(id_vdd, nome, sobrenome, cpf, email, cargo, login, senha, true);
        
        try {
            ServicoUsuario.AtualizarUsuario(usu);
        } catch (DataExceptions | ExceptionUsuario e) {
            e.getMessage();
        }
        
        response.sendRedirect(request.getContextPath() + "/consultarUsuario.jsp");
    }
}
