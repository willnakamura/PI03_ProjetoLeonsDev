/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.leonsdev.reserva.servlets;

import br.senac.tads3.pi3b.leonsdev.Telas.classes.TelaHorarioIda;
import br.senac.tads3.pi3b.leonsdev.Telas.classes.ValidadorTelaHorarioIda;
import br.senac.tads3.pi3b.leonsdev.exceptions.ExceptionHorarioIda;
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
 * @author Rafael
 */
@WebServlet(name = "HorarioReservaVooServlet", urlPatterns = {"/HorarioReservaVoo"})
public class HorarioReservaVooIdaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    //--------------------------------------------------------------------------
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession sessao = request.getSession();
        TelaHorarioIda telaHorarioIda = new TelaHorarioIda();

        String opcao = (String) sessao.getAttribute("opcaoIdaOuIdaVolta");
        int opcaoInt = Integer.parseInt(opcao);

        if (opcaoInt == 0) {
            String nVoo = request.getParameter("seleciona");

            telaHorarioIda.setOpcaoVoo(nVoo);

            try {
                ValidadorTelaHorarioIda.validar(telaHorarioIda);

            } catch (Exception e) {
                request.setAttribute("erroTelaHorarioIda", e.getMessage());
                RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaHorario.jsp");
                dispatcher.forward(request, response);
            }

            int id = -1;
            try {
                id = Integer.parseInt(nVoo);
            } catch (NumberFormatException e) {
                e.getMessage();
            }

            sessao.setAttribute("idVooIda", id);
            RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaHorarioVolta.jsp");
            dispatcher.forward(request, response);

        } else if (opcaoInt == 1) {
            String id = request.getParameter("seleciona");

            telaHorarioIda.setOpcaoVoo(id);

            try {
                ValidadorTelaHorarioIda.validar(telaHorarioIda);

            } catch (ExceptionHorarioIda e) {
                request.setAttribute("erroTelaHorarioIda", e.getMessage());
                RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaHorario.jsp");
                dispatcher.forward(request, response);
            }

            Integer idVoo = null;

            try {
                idVoo = Integer.parseInt(id);
            } catch (NumberFormatException e) {
                e.getMessage();
            }

            sessao.setAttribute("idVooIda", idVoo);
            RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaCliente.jsp");
            dispatcher.forward(request, response);
        }

    }
}
