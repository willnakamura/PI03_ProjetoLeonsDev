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
import java.util.List;
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
@WebServlet(name = "ConsultaUsuarioServlet", urlPatterns = {"/ConsultaUsuario"})
public class ConsultaUsuarioServlet extends HttpServlet {


   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession sessao = request.getSession();
        String busca = request.getParameter("buscaUsuario");
        sessao.setAttribute("buscar", busca);
        
        Usuario usuario = new Usuario();
        
        
        try {
            if(busca == null || busca.trim().equals("")){
                List<Usuario> listaUsuario = ServicoUsuario.listar();
                sessao.setAttribute("ResultUsuarioLista", listaUsuario);
            }else{
                usuario = ServicoUsuario.Procurar(busca);
                sessao.setAttribute("ResultUsuario", usuario);
            }
            
            
        } catch (DataExceptions | ExceptionUsuario e) {
            request.setAttribute("erro", e.getMessage());
        }
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("/consultarUsuario.jsp");
            dispatcher.forward(request, response);
    }
}
