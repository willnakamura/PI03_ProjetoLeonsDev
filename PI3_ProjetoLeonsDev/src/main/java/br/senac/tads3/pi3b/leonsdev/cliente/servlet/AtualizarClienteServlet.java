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
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
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
@WebServlet(name = "AtualizarClienteServlet", urlPatterns = {"/AtualizarCliente"})
public class AtualizarClienteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        SimpleDateFormat dataForm = new SimpleDateFormat("yyyy-MM-dd");
        HttpSession sessao = request.getSession();

        String id = request.getParameter("id-cli");
        int id_vdd = Integer.parseInt(id);
        String nome = request.getParameter("nome-cli");
        String sobrenome = request.getParameter("sobreNome-cli");
        String cpf = request.getParameter("cpf-cli");
        String email = request.getParameter("email-cli");
        String celular = request.getParameter("celular-cli");
        String sexo = request.getParameter("sexo-cli");

        String dtNascString = request.getParameter("dtNasc-cli");

        Date dataNasc = null;

        try {

            dataNasc = dataForm.parse(dtNascString);

        } catch (Exception e) {
            e.printStackTrace();
        }

        String estado = request.getParameter("estado-cli");
        String cidade = request.getParameter("cidade-cli");
        String cep = request.getParameter("cep-cli");
        String endereco = request.getParameter("end-cli");

        Cliente cli = new Cliente();

        cli.setId(id_vdd);
        cli.setNome(nome);
        cli.setSobrenome(sobrenome);
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
            ServicoCliente.atualizarCliente(cli);
        } catch (DataExceptions | ClienteException e) {
            e.getMessage();
        }

        response.sendRedirect(request.getContextPath() + "/consultarCliente.jsp");
    }
}
