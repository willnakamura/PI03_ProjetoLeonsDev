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

/**
 *
 * @author Rafael Rodrigues
 */
@WebServlet(name = "CadastroUsuarioServlet", urlPatterns = {"/cadastro-usuario"})
public class CadastroUsuarioServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }
//----------------------------------------------------------------------------------------

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession sessao = request.getSession();

        String nome = request.getParameter("nome-usua");
        String sobNome = request.getParameter("sobreNome-usua");
        String cpf = request.getParameter("cpf-usua");
        String cargo = request.getParameter("cargo-usua");
        String email = request.getParameter("email-usua");
        String login = request.getParameter("login-usua");
        String senha = request.getParameter("senha-usua");

        Usuario usuario = new Usuario();
        usuario.setNome(nome);
        usuario.setSobrenome(sobNome);
        usuario.setCpf(cpf);
        usuario.setCargo(cargo);
        usuario.setEmail(email);
        usuario.setLogin(login);
        usuario.setSenha(senha);
        usuario.setEnable(true);
//        try {
//
//            ServicoUsuario.CadastrarUsuario(usuario);
//            request.setAttribute("sucessCadastro", "Cadastro realizado com sucesso.");
//        } catch (ExceptionUsuario | DataExceptions e) {
//            request.setAttribute("erroCadastro", e.getMessage());
//            sessao.setAttribute("usuRepreenche", usuario);
//            RequestDispatcher dispatcher = request.getRequestDispatcher("/cadastrarUsuario.jsp");
//            dispatcher.forward(request, response);
//        }
//        
        try {
            ServicoUsuario.CadastrarUsuario(usuario);
            request.setAttribute("sucessCadastro", "Cadastro realizado com sucesso.");
        } catch (ExceptionUsuario | DataExceptions e) {
            request.setAttribute("erroCadastro", e.getMessage());
            request.setAttribute("usuRepreenche", usuario);
        }

        sessao.setAttribute("usuario", usuario);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/cadastrarUsuario.jsp");
        dispatcher.forward(request, response);
    }
}
