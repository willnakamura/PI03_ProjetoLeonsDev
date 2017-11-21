/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.leonsdev.reserva.servlets;

import br.senac.tads3.pi3b.leonsdev.passageiros.classes.Passageiros;
import br.senac.tads3.pi3b.leonsdev.passageiros.classes.PassageirosVoos;
import br.senac.tads3.pi3b.leonsdev.passageiros.classes.ValidadorPassageiros;
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
@WebServlet(name = "PassageirosReservaServlet", urlPatterns = {"/PassageirosReserva"})
public class PassageirosReservaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession sessao = request.getSession();
        Passageiros pass = new Passageiros();
        PassageirosVoos passVoos = new PassageirosVoos();

        SimpleDateFormat dataForm = new SimpleDateFormat("yyyy-MM-dd");
        int qntPass = (int) sessao.getAttribute("qtdpax");

        String nome = request.getParameter("nome-pass-selecionar");
        String sobreNome = request.getParameter("sobreNome-pass-selecionar");
        String cpf = request.getParameter("cpf-pass-selecionar");

        String dataNascString = request.getParameter("dtNasc-pass-selecionar");
        Date dataNasc = null;

        try {

            dataNasc = dataForm.parse(dataNascString);

        } catch (Exception e) {
            e.getMessage();
        }

        String email = request.getParameter("email-pass-selecionar");
        String assento = request.getParameter("assentosPassageiro");

        pass.setNome(nome);
        pass.setSobrenome(sobreNome);
        pass.setCpf(cpf);
        pass.setDataNascimento(dataNasc);
        pass.setEmail(email);

        passVoos.setAssento(assento);
        passVoos.setPassageiro(pass);
        
        try {
            
            ValidadorPassageiros.Validar(pass);
            
        } catch (Exception e) {
           sessao.setAttribute("erroPassageiro", e.getMessage());
        }

        if (qntPass == 1) {
            sessao.setAttribute("Passageiro1", pass);
            sessao.setAttribute("PassageiroVoo1", passVoos);

        } else if (qntPass == 2) {
            sessao.setAttribute("Passageiro2", pass);
            sessao.setAttribute("PassageiroVoo2", passVoos);
            qntPass--;
            sessao.setAttribute("qtdpax", qntPass);
            RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaPassageiros.jsp");
            dispatcher.forward(request, response);

        } else if (qntPass == 3) {
            sessao.setAttribute("Passageiro3", pass);
            sessao.setAttribute("PassageiroVoo3", passVoos);

            qntPass--;
            sessao.setAttribute("qtdpax", qntPass);
            RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaPassageiros.jsp");
            dispatcher.forward(request, response);
        }
        
        

        RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaPagamento.jsp");
        dispatcher.forward(request, response);
    }
}
