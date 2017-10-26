/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.leonsdev.cliente.servlet;

import br.senac.tads3.pi3b.leonsdev.cliente.classes.Cliente;
import br.senac.tads3.pi3b.leonsdev.cliente.classes.ServicoCliente;
import br.senac.tads3.pi3b.leonsdev.exceptions.ClienteException;
import br.senac.tads3.pi3b.leonsdev.exceptions.DataExceptions;
import java.io.IOException;
import java.text.SimpleDateFormat;
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
        
        sessao.getAttribute("cli");
        
        if (sessao.getAttribute("cli") != null) {
            request.setAttribute("cli", sessao.getAttribute("cli"));
            // Remove o atributo da sessao para usuario nao ficar preso na tela de resultados
            sessao.removeAttribute("cli");

            request.setAttribute("disponivel", sessao.getAttribute("disponivel"));
            // Remove o atributo da sessao para usuario nao ficar preso na tela de resultados
            sessao.removeAttribute("disponivel");

            destino = "cliente-cadastro.jsp";
        } else {
            destino = "cliente-cadastro.jsp";
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
        
        SimpleDateFormat dataForm = new SimpleDateFormat("yyyy-MM-dd");

        String nome = request.getParameter("nome-cli");
        String sobNome = request.getParameter("sobreNome-cli");
        String cpf = request.getParameter("cpf-cli");
        String sexo = request.getParameter("sexo-cli");
        
        String dataNascString = request.getParameter("dtNasc-cli");
        Date dataNasc = null;
        try {

            dataNasc = dataForm.parse(dataNascString);
            

        } catch (Exception e) {
            e.printStackTrace();
        }

        String endereco = request.getParameter("end-cli");
        String cidade = request.getParameter("cidade-cli");
        String estado = request.getParameter("estado-cli");
        String cep = request.getParameter("cep-cli");
        String celular = request.getParameter("celular-cli");
        String email = request.getParameter("email-cli");

        Cliente cli = new Cliente();
        cli.setNome(nome);
        cli.setSobrenome(sobNome);
        cli.setCpf(cpf);
        cli.setGenero(sexo);
        cli.setDataNascimento(dataNasc);
        cli.setEndereco(endereco);
        cli.setCidade(cidade);
        cli.setEstado(estado);
        cli.setCep(cep);
        cli.setCelular(celular);
        cli.setEmail(email);
        cli.setAtivo(true);

        try {

            ServicoCliente.CadastrarCliente(cli);

        } catch (ClienteException | DataExceptions e) {
            e.printStackTrace();
        }

        HttpSession sessao = request.getSession();
        sessao.setAttribute("cli", cli);

        response.sendRedirect(request.getContextPath() + "/cliente-cadastrar.jsp");
    }

}
