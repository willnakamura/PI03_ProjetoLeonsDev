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
@WebServlet(name = "ExcluirUsuarioServlet", urlPatterns = {"/ExcluirUsuario"})
public class ExcluirUsuarioServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession sessao = request.getSession();
        Usuario usu = new Usuario();
        
        String cpf = request.getParameter("selecionaUsuario");
        
        try {
            usu = ServicoUsuario.Procurar(cpf);
            ServicoUsuario.ExcluirUsuario(usu.getId());
        } catch (DataExceptions | ExceptionUsuario e) {
            request.setAttribute("erroExcluir", e.getMessage());
            
        }
        
        response.sendRedirect(request.getContextPath() + "/consultarUsuario.jsp");
    }
}
