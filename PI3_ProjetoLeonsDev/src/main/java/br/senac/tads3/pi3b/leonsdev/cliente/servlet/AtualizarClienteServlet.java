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
import java.text.ParseException;
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
 * @author Rafael
 */
@WebServlet(name = "AtualizarClienteServlet", urlPatterns = {"/AtualizarCliente"})
public class AtualizarClienteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession sessao = request.getSession();
        SimpleDateFormat dataForm = new SimpleDateFormat("yyyy-MM-dd");

        String id = request.getParameter("id-cli");
        int id_vdd = Integer.parseInt(id);

        String nome = request.getParameter("nome-cli");
        String sobNome = request.getParameter("sobrenome-cli");
        String cpf = request.getParameter("cpf-cli");
        String sexo = request.getParameter("sexo-cli");
        String dataNascString = request.getParameter("dtNasc-cli");
        Date dataNasc = null;

        try {
            dataNasc = dataForm.parse(dataNascString);
        } catch (ParseException e) {
            e.getMessage();
        }

        String endereco = request.getParameter("end-cli");
        String cidade = request.getParameter("cidade-cli");
        String estado = request.getParameter("estado-cli");
        String cep = request.getParameter("cep-cli");
        String celular = request.getParameter("celular-cli");
        String email = request.getParameter("email-cli");

        Cliente cli = new Cliente(id_vdd, nome, sobNome, cpf, email, celular, estado, endereco, cidade, endereco, cep, dataNasc, true);

        try {
            ServicoCliente.atualizarCliente(cli);
        } catch (DataExceptions | ClienteException e) {
            request.setAttribute("erroAtualizar", e.getMessage());

            RequestDispatcher dispatcher = request.getRequestDispatcher("/editarCliente.jsp");
            dispatcher.forward(request, response);
        }

        response.sendRedirect(request.getContextPath() + "/consultarCliente.jsp");
    }

}
