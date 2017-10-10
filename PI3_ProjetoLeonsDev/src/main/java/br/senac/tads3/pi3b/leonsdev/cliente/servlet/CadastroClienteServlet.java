/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.leonsdev.cliente.servlet;

import br.senac.tads3.pi3b.leonsdev.cliente.classes.Cliente;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
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
@WebServlet(name = "ClienteServlet", urlPatterns = {"/cadastro-cliente"})
public class CadastroClienteServlet extends HttpServlet {

    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String destino;

        HttpSession sessao = request.getSession();
        if (sessao.getAttribute("cli") != null) {
            request.setAttribute("cli", sessao.getAttribute("cli"));
            // Remove o atributo da sessao para usuario nao ficar preso na tela de resultados
            sessao.removeAttribute("cli");

            request.setAttribute("disponivel", sessao.getAttribute("disponivel"));
            // Remove o atributo da sessao para usuario nao ficar preso na tela de resultados
            sessao.removeAttribute("disponivel");

            destino = "/WEB-INF/cadastroCliente.jsp";
        } else {
            destino = "/WEB-INF/cadastroCliente.jsp";
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher(destino);
        dispatcher.forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nome = request.getParameter("nome");
        String endereco = request.getParameter("endereco");
        String telefone = request.getParameter("telefone");
        String email = request.getParameter("email");
        String[] genero = request.getParameterValues("genero");
        Long cpf = Long.parseLong(request.getParameter("cpf"));

        Cliente c = new Cliente();
        c.setNome(nome);
        c.setEndereco(endereco);
        c.setTelefone(telefone);
        c.setEmail(email);
        c.setGenero(Arrays.toString(genero));
        c.setCpf(cpf);
        c.setDataNascimento(new Date());

        HttpSession sessao = request.getSession();
        sessao.setAttribute("cli", c);

        response.sendRedirect(request.getContextPath() + "/cadastro-cliente");
    }

}
