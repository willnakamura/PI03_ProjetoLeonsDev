/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.leonsdev.relatorios.Servlets;

import br.senac.tads3.pi3b.leonsdev.relatorios.classes.RelatorioReservas;
import br.senac.tads3.pi3b.leonsdev.relatorios.classes.ServicoRelatorios;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
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
@WebServlet(name = "RelatorioReservaServlet", urlPatterns = {"/RelatorioReserva"})
public class RelatorioReservaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession sessao = request.getSession();

        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dataForm = new SimpleDateFormat("yyyy-MM-dd");

        String dataInicio = request.getParameter("data-inicio");
        String dataFim = request.getParameter("data-fim");

        if (dataInicio == null || dataInicio.trim().equals("")) {
            request.setAttribute("erroRelatorio", "Indique uma data de inicio para o relatório.");
            RequestDispatcher dispatcher = request.getRequestDispatcher("/relatorioReserva.jsp");
            dispatcher.forward(request, response);

        } else if (dataFim == null || dataFim.trim().equals("")) {
            request.setAttribute("erroRelatorio", "Indique uma data de fim para o relatório.");
            RequestDispatcher dispatcher = request.getRequestDispatcher("/relatorioReserva.jsp");
            dispatcher.forward(request, response);
        }

        Date dataInicioRelatorio = null;
        Date dataFimrelatorio = null;

        try {
            dataInicioRelatorio = dataForm.parse(dataInicio);
            dataFimrelatorio = dataForm.parse(dataFim);
        } catch (ParseException e) {
            e.getMessage();
        }

        List<RelatorioReservas> relatorioVenda = null;

        try {
            relatorioVenda = ServicoRelatorios.listarVendas(dataInicioRelatorio, dataFimrelatorio);
        } catch (Exception e) {
            e.getMessage();
        }

        if (relatorioVenda == null) {
            request.setAttribute("erroRelatorio", "A pesquisa não trouxe resultados.");
            RequestDispatcher dispatcher = request.getRequestDispatcher("/relatorioReserva.jsp");
            dispatcher.forward(request, response);
        }
        
        sessao.setAttribute("ListaReservaRelatorio", relatorioVenda);
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("/relatorioReserva.jsp");
        dispatcher.forward(request, response);

    }
}
