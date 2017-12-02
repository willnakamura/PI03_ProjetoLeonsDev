/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.leonsdev.reserva.servlets;

import br.senac.tads3.pi3b.leonsdev.login.classes.SingletonLogin;
import br.senac.tads3.pi3b.leonsdev.reserva.classes.ReservaConsultar;
import br.senac.tads3.pi3b.leonsdev.reserva.classes.ServicoConsultaCancelaReserva;
import br.senac.tads3.pi3b.leonsdev.reserva.classes.ServicoReserva;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "ConsultaReservaServlet", urlPatterns = {"/ConsultaReserva"})
public class ConsultaReservaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession sessao = request.getSession();
        SingletonLogin singleton = SingletonLogin.getInstance();

        String ticket = request.getParameter("buscaCodigo");

        if (ticket == null || ticket.trim().equals("")) {
            request.setAttribute("erroConsulta", "Informe um parametro para a pesquisa.");
            if (singleton.getCargo().equals("Gerente")) {
                RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaConsultaRetornaVoo.jsp");
                dispatcher.forward(request, response);
                return;
            } else {
                RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaConsultaRetornaVooUsuario.jsp");
                dispatcher.forward(request, response);
                return;
            }
        }

        List<ReservaConsultar> consulta = null;

        try {
            consulta = ServicoConsultaCancelaReserva.consultaReserva(ticket);
        } catch (Exception e) {
            request.setAttribute("erroConsulta", e.getMessage());
            if (singleton.getCargo().equals("Gerente")) {
                RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaConsultaRetornaVoo.jsp");
                dispatcher.forward(request, response);
                return;
            } else {
                RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaConsultaRetornaVooUsuario.jsp");
                dispatcher.forward(request, response);
                return;
            }
        }
        if (consulta == null) {
            request.setAttribute("erroConsulta", "Não houve resultado.");
            if (singleton.getCargo().equals("Gerente")) {
                RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaConsultaRetornaVoo.jsp");
                dispatcher.forward(request, response);
                return;
            } else {
                RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaConsultaRetornaVooUsuario.jsp");
                dispatcher.forward(request, response);
                return;
            }
        }

        sessao.setAttribute("listaConsulta", consulta);
        if (singleton.getCargo().equals("Gerente")) {
            RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaConsultaRetornaVoo.jsp");
            dispatcher.forward(request, response);
        } else {
            RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaConsultaRetornaVooUsuario.jsp");
            dispatcher.forward(request, response);
        }

    }
}
