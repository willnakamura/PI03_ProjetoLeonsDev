/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.leonsdev.reserva.servlets;

import br.senac.tads3.pi3b.leonsdev.Telas.classes.TelaHorarioIda;
import br.senac.tads3.pi3b.leonsdev.Telas.classes.ValidadorTelaHorarioIda;
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
 * @author Nakamura-PC
 */
@WebServlet(name = "HorarioReservaVooVoltaServlet", urlPatterns = {"/HorarioReservaVooVolta"})
public class HorarioReservaVooVoltaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    //-----------------------------------------------------------------------------
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession sessao = request.getSession();
        TelaHorarioIda telaHorarioIda = new TelaHorarioIda();
        String nVoo = request.getParameter("seleciona");

        telaHorarioIda.setOpcaoVoo(nVoo);

        try {
            ValidadorTelaHorarioIda.validar(telaHorarioIda);

        } catch (Exception e) {
            request.setAttribute("erroTelaHorarioVolta", e.getMessage());
            RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaHorario.jsp");
            dispatcher.forward(request, response);
        }

        int id = -1;
        try {
            id = Integer.parseInt(nVoo);
        } catch (Exception e) {
            e.getMessage();
        }

        sessao.setAttribute("idVooVolta", id);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaCliente.jsp");
        dispatcher.forward(request, response);
    }
}
