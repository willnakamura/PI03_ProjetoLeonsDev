/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.leonsdev.reserva.servlets;

import br.senac.tads3.pi3b.leonsdev.exceptions.DataExceptions;
import br.senac.tads3.pi3b.leonsdev.voos.classes.ServicoVoos;
import br.senac.tads3.pi3b.leonsdev.voos.classes.Voos;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
@WebServlet(name = "VooReservaServlet", urlPatterns = {"/VooReserva"})
public class VooReservaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

//------------------------------------------------------------------------------
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession sessao = request.getSession();
        SimpleDateFormat dataForm = new SimpleDateFormat("yyyy-MM-dd");
        

        String opcao = request.getParameter("opcao");
        int opcaoInt = Integer.parseInt(opcao);
        request.setAttribute("opcaoIdaOuIdaVolta", opcao);

        if (opcaoInt == 0) {
            Voos voo = new Voos();
            Voos voo2 = new Voos();
            String origem = request.getParameter("origemVoo");
            String destino = request.getParameter("destinoVoo");
            String datIda = request.getParameter("data-ida-voo");

            Date dataIdaVoo = null;
            try {
                dataIdaVoo = dataForm.parse(datIda);
            } catch (ParseException e) {
                e.getMessage();
            }
            
            String datVolta = request.getParameter("data-volta-voo");
            
            Date dataVoltaVoo = null;
            try {
                dataVoltaVoo = dataForm.parse(datVolta);
            } catch (ParseException e) {
                e.getMessage();
            }
            
            String qtdPass = request.getParameter("qtdpax");
            int qtdPassageiros = Integer.parseInt(qtdPass);
            
            sessao.setAttribute("qtdpax", qtdPassageiros);
             
            String bagagem = request.getParameter("bagagem-voo");
            
            voo.setAeroportoPartida(origem);
            voo.setAeroportoChegada(destino);
            voo.setDataVoo(dataIdaVoo);
            
            voo2.setAeroportoPartida(destino);
            voo2.setAeroportoChegada(origem);
            voo2.setDataVoo(dataVoltaVoo);
            
            String ida = voo.getAeroportoPartida();
            String chegada = voo.getAeroportoChegada();
            
            List<Voos> voo1 = null;
            try {
                voo1 = ServicoVoos.buscarVooEspecial(voo.getDataVoo(), ida.substring(0, 3), chegada.substring(0, 3));
            } catch (DataExceptions | SQLException e) {
                e.getMessage();
            }
            
            sessao.setAttribute("VooIda", voo1);
            
            String ida2 = voo2.getAeroportoPartida();
            String chegada2 = voo2.getAeroportoChegada();
            
            List<Voos> vooVolta = null;
            try {
                vooVolta = ServicoVoos.buscarVooEspecial(voo2.getDataVoo(), ida2.substring(0, 3), chegada2.substring(0, 3));
            } catch (DataExceptions | SQLException e) {
                e.getMessage();
            }
            
            sessao.setAttribute("VooVolta", vooVolta);
            
            RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaHorario.jsp");
            dispatcher.forward(request, response);
            
            
        }else if(opcaoInt == 1){
            Voos voo = new Voos();
            String origem = request.getParameter("origemVoo");
            String destino = request.getParameter("destinoVoo");
            String datIda = request.getParameter("data-ida-voo");

            Date dataIdaVoo = null;
            try {
                dataIdaVoo = dataForm.parse(datIda);
            } catch (ParseException e) {
                e.getMessage();
            }
            
            Integer qtdPassageiros = Integer.parseInt(request.getParameter("qtdpax"));
            sessao.setAttribute("qtdpax", qtdPassageiros);
            
            String bagagem = request.getParameter("bagagem-voo");
            
            voo.setAeroportoPartida(origem);
            voo.setAeroportoChegada(destino);
            voo.setDataVoo(dataIdaVoo);
            
            List<Voos> voo1 = null;
            try {
                voo1 = ServicoVoos.buscarVooEspecial(voo.getDataVoo(), voo.getAeroportoPartida(), voo.getAeroportoChegada());
            } catch (DataExceptions | SQLException e) {
                e.getMessage();
            }
            
            sessao.setAttribute("VooIda", voo1);
            
            RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaHorario.jsp");
            dispatcher.forward(request, response);
            
        }
    }
}
