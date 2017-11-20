/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.leonsdev.reserva.servlets;

import java.io.IOException;
import java.io.PrintWriter;
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

        String nVoo = request.getParameter("seleciona");
        int nVooInt = -1;
        try {
            nVooInt = Integer.parseInt(nVoo);
        } catch (Exception e) {
            e.getMessage();
        }

        sessao.setAttribute("nVooIda", nVooInt);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaHorarioVolta.jsp");
    }
}
