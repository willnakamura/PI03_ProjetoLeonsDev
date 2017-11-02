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
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.Dispatch;

/**
 *
 * @author Rafael
 */
@WebServlet(name = "EditarUsuarioServlet", urlPatterns = {"/EditarUsuario"})
public class EditarUsuarioServlet extends HttpServlet {


    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        HttpSession sessao = request.getSession();
        Usuario usuario = new Usuario();
        //add parametro qdo apertar botao editar....
        String cpf = request.getParameter("");
        
        try {
           usuario = ServicoUsuario.Procurar(cpf);
        } catch (DataExceptions | ExceptionUsuario e) {
            e.getMessage();
        }
        
        request.setAttribute("usuarioEditar", usuario);
        RequestDispatcher dispatcher = request.getRequestDispatcher("consultarUsuario.jsp");
            dispatcher.forward(request, response);
    }
}
