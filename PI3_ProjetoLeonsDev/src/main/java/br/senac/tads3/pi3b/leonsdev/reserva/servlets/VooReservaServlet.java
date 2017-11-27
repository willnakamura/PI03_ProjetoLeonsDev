/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.leonsdev.reserva.servlets;

import br.senac.tads3.pi3b.leonsdev.Telas.classes.TelaVoo;
import br.senac.tads3.pi3b.leonsdev.Telas.classes.ValidadorTelaVoo;
import br.senac.tads3.pi3b.leonsdev.exceptions.DataExceptions;
import br.senac.tads3.pi3b.leonsdev.exceptions.ExceptionTelaVoo;
import br.senac.tads3.pi3b.leonsdev.login.classes.SingletonLogin;
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
        SingletonLogin singleton = SingletonLogin.getInstance();
        HttpSession sessao = request.getSession();
        SimpleDateFormat dataForm = new SimpleDateFormat("yyyy-MM-dd");

        TelaVoo tela = new TelaVoo();
        String opcao = request.getParameter("opcao");
        tela.setOpcaoIdaVolta(opcao);

        String origem = request.getParameter("origemVoo");
        String destino = request.getParameter("destinoVoo");
        String datIda = request.getParameter("data-ida-voo");

        if (datIda.equals("")) {
            request.setAttribute("erroTelaVoo", "Favor informar uma data de ida");

            if (singleton.getCargo().equals("Gerente")) {
                RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaVoo.jsp");
                dispatcher.forward(request, response);
            } else {
                RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaVooUsuario.jsp");
                dispatcher.forward(request, response);
            }
        }

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
        //int qtdPassageiros = Integer.parseInt(qtdPass);

        sessao.setAttribute("opcaoIdaOuIdaVolta", opcao);

        String bagagem = request.getParameter("bagagem-voo");

        tela.setAeroportoDestino(destino);
        tela.setAeroportoOrigem(origem);
        tela.setDataIda(dataIdaVoo);
        tela.setDataVolta(dataVoltaVoo);

        tela.setQtdPass(qtdPass);

        try {
            ValidadorTelaVoo.validar(tela);

        } catch (ExceptionTelaVoo e) {
            request.setAttribute("erroTelaVoo", e.getMessage());
            request.setAttribute("telaVooRepreencher", tela);
            request.setAttribute("bagagemRepreencher", bagagem);
            
            if (singleton.getCargo().equals("Gerente")) {
                RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaVoo.jsp");
                dispatcher.forward(request, response);

            } else {
                RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaVooUsuario.jsp");
                dispatcher.forward(request, response);
            }
        }

        if (opcao.equals("0")) {
            if (datVolta.equals("")) {
                request.setAttribute("erroTelaVoo", "Favor informar uma data de volta");
                if (singleton.getCargo().equals("Gerente")) {
                    RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaVoo.jsp");
                    dispatcher.forward(request, response);
                } else {
                    RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaVooUsuario.jsp");
                    dispatcher.forward(request, response);
                }
            }

            Voos voo = new Voos();
            Voos voo2 = new Voos();

            sessao.setAttribute("qtdpax", qtdPass);
            sessao.setAttribute("qtdPassageirosReserva", qtdPass);

            //verificar operação com a bagagem....
            sessao.setAttribute("bagagem", bagagem);

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
                if (voo1 == null || voo1.isEmpty()) {
                    request.setAttribute("erroTelaVoo", "Não temos voo para esta origem e este destino, ou ele não está disponível para essa data.");
                    if (singleton.getCargo().equals("Gerente")) {
                        RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaVoo.jsp");
                        dispatcher.forward(request, response);
                    } else {
                        RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaVooUsuario.jsp");
                        dispatcher.forward(request, response);
                    }
                }
            } catch (DataExceptions | SQLException e) {
                e.getMessage();
            }

            sessao.setAttribute("VooIda", voo1);

            String ida2 = voo2.getAeroportoPartida();
            String chegada2 = voo2.getAeroportoChegada();

            List<Voos> vooVolta = null;
            try {
                vooVolta = ServicoVoos.buscarVooEspecial(voo2.getDataVoo(), ida2.substring(0, 3), chegada2.substring(0, 3));
                if (vooVolta == null || vooVolta.isEmpty()) {
                    request.setAttribute("erroTelaVoo", "Não temos voo para esta origem e este destino, ou ele não está disponível para essa data.");
                    if (singleton.getCargo().equals("Gerente")) {
                        RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaVoo.jsp");
                        dispatcher.forward(request, response);
                    } else {
                        RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaVooUsuario.jsp");
                        dispatcher.forward(request, response);
                    }
                }
            } catch (DataExceptions | SQLException e) {
                e.getMessage();
            }

            sessao.setAttribute("VooVolta", vooVolta);

            if (singleton.getCargo().equals("Gerente")) {
                RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaHorario.jsp");
                dispatcher.forward(request, response);
            } else {
                RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaHorarioUsuario.jsp");
                dispatcher.forward(request, response);
            }

        } else if (opcao.equals("1")) {
            Voos voo = new Voos();

            sessao.setAttribute("qtdpax", qtdPass);
            sessao.setAttribute("qtdPassageirosReserva", qtdPass);

            sessao.setAttribute("bagagem", bagagem);

            voo.setAeroportoPartida(origem);
            voo.setAeroportoChegada(destino);
            voo.setDataVoo(dataIdaVoo);

            List<Voos> voo1 = null;
            try {
                voo1 = ServicoVoos.buscarVooEspecial(voo.getDataVoo(),
                        voo.getAeroportoPartida().substring(0, 3), voo.getAeroportoChegada().substring(0, 3));
                if (voo1 == null || voo1.isEmpty()) {
                    request.setAttribute("erroTelaVoo", "Não temos voo para esta origem e este destino.");
                    if (singleton.getCargo().equals("Gerente")) {
                        RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaVoo.jsp");
                        dispatcher.forward(request, response);
                    } else {
                        RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaVooUsuario.jsp");
                        dispatcher.forward(request, response);
                    }
                }
            } catch (DataExceptions | SQLException e) {
                e.getMessage();
            }

            sessao.setAttribute("VooIda", voo1);

            if (singleton.getCargo().equals("Gerente")) {
                RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaHorario.jsp");
                dispatcher.forward(request, response);
            } else {
                RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaHorarioUsuario.jsp");
                dispatcher.forward(request, response);
            }

        }
    }
}
