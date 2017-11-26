/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.leonsdev.reserva.servlets;

import br.senac.tads3.pi3b.leonsdev.exceptions.DataExceptions;
import br.senac.tads3.pi3b.leonsdev.reserva.classes.ServicoAssentos;
import br.senac.tads3.pi3b.leonsdev.voos.classes.Assento;
import br.senac.tads3.pi3b.leonsdev.voos.classes.ServicoVoos;
import br.senac.tads3.pi3b.leonsdev.voos.classes.Voos;
import java.io.IOException;
import java.util.ArrayList;
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
@WebServlet(name = "TrocaTelaClienteReservaServlet", urlPatterns = {"/TrocaTelaClienteReserva"})
public class TrocaTelaClienteReservaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    //-------------------------------------------------------------------------
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession sessao = request.getSession();

        Voos voo = new Voos();
        Integer id = (Integer) sessao.getAttribute("idVooIda");

        try {
            voo = ServicoVoos.obterVoo(id);
        } catch (DataExceptions e) {
            e.getMessage();
        }

        ArrayList <Assento> assentos = null;
        try {
            assentos = (ArrayList) ServicoAssentos.assentosDisponiveis(voo.getDataVoo(), voo.getNrVoo());

        } catch (DataExceptions e) {
            e.getMessage();
        }

        sessao.setAttribute("assentosLista", assentos);

        String opcao = (String) sessao.getAttribute("opcaoIdaOuIdaVolta");

        if (opcao.equals("0")) {
            RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaPassageirosIdaVolta.jsp");
            dispatcher.forward(request, response);
        } else if (opcao.equals("1")) {
            RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaPassageiros.jsp");
            dispatcher.forward(request, response);
        }

    }
}
