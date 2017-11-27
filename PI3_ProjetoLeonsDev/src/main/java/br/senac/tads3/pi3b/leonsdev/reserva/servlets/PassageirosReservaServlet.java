/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.leonsdev.reserva.servlets;

import br.senac.tads3.pi3b.leonsdev.Telas.classes.TelaPassageiro;
import br.senac.tads3.pi3b.leonsdev.Telas.classes.ValidadorTelaPassageiro;
import br.senac.tads3.pi3b.leonsdev.cliente.classes.Cliente;
import br.senac.tads3.pi3b.leonsdev.exceptions.DataExceptions;
import br.senac.tads3.pi3b.leonsdev.exceptions.ExceptionTelaPassageiro;
import br.senac.tads3.pi3b.leonsdev.login.classes.SingletonLogin;
import br.senac.tads3.pi3b.leonsdev.passageiros.classes.Passageiros;
import br.senac.tads3.pi3b.leonsdev.passageiros.classes.PassageirosVoos;
import br.senac.tads3.pi3b.leonsdev.reserva.classes.Reserva;
import br.senac.tads3.pi3b.leonsdev.servico.classes.Servico;
import br.senac.tads3.pi3b.leonsdev.usuario.classes.ServicoUsuario;
import br.senac.tads3.pi3b.leonsdev.usuario.classes.Usuario;
import br.senac.tads3.pi3b.leonsdev.voos.classes.ServicoVoos;
import br.senac.tads3.pi3b.leonsdev.voos.classes.Voos;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
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

        SingletonLogin singleton = SingletonLogin.getInstance();
        HttpSession sessao = request.getSession();
        Passageiros pass = new Passageiros();
        PassageirosVoos passVoos = new PassageirosVoos();
        PassageirosVoos passVoosVolta = new PassageirosVoos();
        TelaPassageiro telaPass = new TelaPassageiro();

        String opcao = (String) sessao.getAttribute("opcaoIdaOuIdaVolta");

        SimpleDateFormat dataForm = new SimpleDateFormat("yyyy-MM-dd");

        String qtdPassString = (String) sessao.getAttribute("qtdpax");
        int qntPass = Integer.parseInt(qtdPassString);

        String qtdPassReservaString = (String) sessao.getAttribute("qtdPassageirosReserva");
        int qtdPassReserva = Integer.parseInt(qtdPassReservaString);
        //sessao.setAttribute("qtdPassReserva", qtdPassReserva);

        String nome = request.getParameter("nome-pass-selecionar");
        String sobreNome = request.getParameter("sobreNome-pass-selecionar");
        String cpf = request.getParameter("cpf-pass-selecionar");

        String dataNascString = request.getParameter("dtNasc-pass-selecionar");

        if (dataNascString.equals("")) {
            request.setAttribute("erroPassageiro", "Favor informar uma data de nascimento válida");
            if (singleton.getCargo().equals("Gerente")) {
                RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaPassageiros.jsp");
                dispatcher.forward(request, response);
            } else {
                RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaPassageirosUsuario.jsp");
                dispatcher.forward(request, response);
            }

        }

        Date dataNasc = null;

        try {

            dataNasc = dataForm.parse(dataNascString);

        } catch (ParseException e) {
            e.getMessage();
        }

        String email = request.getParameter("email-pass-selecionar");
        String assento = request.getParameter("assentosPassageiro");

        pass.setNome(nome);
        pass.setSobrenome(sobreNome);
        pass.setCpf(cpf);
        pass.setDataNascimento(dataNasc);
        pass.setEmail(email);

        //-------------------------------Reserva----------------------------------------------------------
        Calendar calendario = Calendar.getInstance();
        Reserva reserva = new Reserva();

        reserva.setCliente((Cliente) sessao.getAttribute("clienteSelectReserva"));
        reserva.setDataReserva(calendario.getTime());

        Usuario usu = new Usuario();

        try {
            usu = ServicoUsuario.ObterUsuario(singleton.getFunc_id());
        } catch (Exception e) {
            e.getMessage();
        }

        reserva.setUsuario(usu);
        reserva.setVendedor(usu.getNome());

        Servico serv = new Servico();
        Double precoBag = null;
        String bagagem = (String) sessao.getAttribute("bagagem");

        if (bagagem.equals("5Kg")) {
            precoBag = 20.9d;
            serv.setExtraBag(bagagem);
            serv.setPreco(precoBag);
            sessao.setAttribute("Servico", serv);

        } else if (bagagem.equals("10Kg")) {
            precoBag = 39.9d;
            serv.setExtraBag(bagagem);
            serv.setPreco(precoBag);
            sessao.setAttribute("Servico", serv);
        } else if (bagagem.equals("20Kg")) {
            precoBag = 79.9d;
            serv.setExtraBag(bagagem);
            serv.setPreco(precoBag);
            sessao.setAttribute("Servico", serv);
        } else if (bagagem.equals("0Kg")) {
            precoBag = 0.0d;
            serv.setExtraBag(bagagem);
            serv.setPreco(precoBag);
            sessao.setAttribute("Servico", serv);
        }

        Voos vooIda = new Voos();
        Voos vooVolta = new Voos();

        telaPass.setNome(nome);
        telaPass.setSobrenome(sobreNome);
        telaPass.setCpf(cpf);
        telaPass.setDtNasc(dataNasc);
        telaPass.setEmail(email);

        if (opcao.equals("0")) {
            String assentoVolta = request.getParameter("assentosPassageiroVolta");

            int idIda = (int) sessao.getAttribute("idVooIda");
            int idVolta = (int) sessao.getAttribute("idVooVolta");

            telaPass.setAssentoIda(assento);
            telaPass.setAssentoVolta(assentoVolta);

            try {

                ValidadorTelaPassageiro.validar(telaPass, opcao);

            } catch (ExceptionTelaPassageiro e) {
                request.setAttribute("erroPassageiro", e.getMessage());

                if (singleton.getCargo().equals("Gerente")) {
                    RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaPassageiros.jsp");
                    dispatcher.forward(request, response);
                } else {
                    RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaPassageirosUsuario.jsp");
                    dispatcher.forward(request, response);
                }

            }

            try {
                vooIda = ServicoVoos.obterVoo(idIda);
                vooVolta = ServicoVoos.obterVoo(idVolta);

            } catch (DataExceptions ex) {
                ex.getMessage();
            }

            passVoos.setIdVoo(vooIda.getId());
            passVoosVolta.setIdVoo(vooVolta.getId());
            passVoos.setAssento(assento);
            passVoos.setPassageiro(pass);
            passVoosVolta.setAssento(assentoVolta);
            passVoosVolta.setPassageiro(pass);

//            if (passVoos.getAssento().equals(passVoosVolta.getAssento())) {
//                request.setAttribute("erroPassageiro", "Este assento ja está reservado.");
//
//                RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaPassageirosIdaVolta.jsp");
//                dispatcher.forward(request, response);
//            }
            pass.setpassVoos(passVoos);
            pass.setpassVoos(passVoosVolta);

            int quantidadePass = qtdPassReserva;

            //-----------desconto----------
            //----------------------------
            if (reserva.getCliente().getNivel().equals("Pelicano")) {
                if (passVoos.getAssento().contains("30.0")) {
                    Double desconto = (Double) sessao.getAttribute("desconto");
                    if (desconto == null) {
                        desconto = 0.0;
                    }
                    desconto = desconto + 30.0;
                    sessao.setAttribute("desconto", desconto);
                    reserva.setCustoTotal((vooIda.getTarifa() * quantidadePass) + (vooVolta.getTarifa() * quantidadePass) - desconto + serv.getPreco());

                } else {
                    Double desconto = (Double) sessao.getAttribute("desconto");
                    if (desconto == null) {
                        desconto = 0.0;
                    }
                    desconto = 0.0;
                    sessao.setAttribute("desconto", desconto);
                    reserva.setCustoTotal((vooIda.getTarifa() * quantidadePass) + (vooVolta.getTarifa() * quantidadePass) - desconto + serv.getPreco());
                }
                //reserva.setCustoTotal((vooIda.getTarifa() * quantidadePass) + serv.getPreco() + (vooVolta.getTarifa() * quantidadePass));
            } else if (reserva.getCliente().getNivel().equals("Aguia")) {
                if (passVoos.getAssento().contains("30.0")) {
                    Double desconto = (Double) sessao.getAttribute("desconto");
                    if (desconto == null) {
                        desconto = 0.0;
                    }
                    desconto = desconto + 30.0 + serv.getPreco();
                    sessao.setAttribute("desconto", desconto);
                    reserva.setCustoTotal((vooIda.getTarifa() * quantidadePass) + (vooVolta.getTarifa() * quantidadePass) - desconto);

                } else {
                    Double desconto = (Double) sessao.getAttribute("desconto");
                    if (desconto == null) {
                        desconto = 0.0;
                    }
                    desconto = desconto + serv.getPreco();
                    sessao.setAttribute("desconto", desconto);
                    reserva.setCustoTotal((vooIda.getTarifa() * quantidadePass) + (vooVolta.getTarifa() * quantidadePass) - desconto);
                }
                //reserva.setCustoTotal((vooIda.getTarifa() * quantidadePass) + serv.getPreco() + (vooVolta.getTarifa() * quantidadePass));
            } else if (reserva.getCliente().getNivel().equals("Pombo")) {
                if (passVoos.getAssento().contains("30.0")) {
                    Double desconto = (Double) sessao.getAttribute("desconto");
                    if (desconto == null) {
                        desconto = 0.0;
                    }
                    desconto = 0.0;
                    sessao.setAttribute("desconto", desconto);
                    reserva.setCustoTotal((vooIda.getTarifa() * quantidadePass) + (vooVolta.getTarifa() * quantidadePass) + 30.0 + serv.getPreco());

                } else {
                    Double desconto = (Double) sessao.getAttribute("desconto");
                    if (desconto == null) {
                        desconto = 0.0;
                    }
                    desconto = 0.0;
                    sessao.setAttribute("desconto", desconto);
                    reserva.setCustoTotal((vooIda.getTarifa() * quantidadePass) + (vooVolta.getTarifa() * quantidadePass) - serv.getPreco());
                }

            }
            //----------------------------------------
            //-----------------------------------------

            sessao.setAttribute("ReservaFinal", reserva);
            sessao.setAttribute("ServicoReservaFinal", serv);
            sessao.setAttribute("VooIdaReservaFinal", vooIda);
            sessao.setAttribute("VooVoltaReservaFinal", vooVolta);

            Cliente cliente = (Cliente) sessao.getAttribute("clienteSelectReserva");
            String nomePagador = cliente.getNome() + " " + cliente.getSobrenome();
            sessao.setAttribute("nomePagador", nomePagador);
            sessao.setAttribute("custoTotal", reserva.getCustoTotal());
            //---------------------------------------------------------------------------------------------

            if (qntPass == 1) {
                sessao.setAttribute("Passageiro1", pass);
                sessao.setAttribute("PassageiroVoo1", passVoos);
                sessao.setAttribute("assentoPass1", passVoos.getAssento());
                sessao.setAttribute("assentoPass1Volta", passVoosVolta.getAssento());

                if (singleton.getCargo().equals("Gerente")) {
                    RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaPagamento.jsp");
                    dispatcher.forward(request, response);
                } else {
                    RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaPagamentoUsuario.jsp");
                    dispatcher.forward(request, response);
                }

            } else if (qntPass == 2) {
                sessao.setAttribute("Passageiro2", pass);
                sessao.setAttribute("assentoPass2", passVoos.getAssento());
                sessao.setAttribute("assentoPass2Volta", passVoosVolta.getAssento());
                qntPass--;
                String qtdPax = Integer.toString(qntPass);
                sessao.setAttribute("qtdpax", qtdPax);

                request.setAttribute("nPassPag", 2);
//                sessao.setAttribute("assentoPass2", assento);
                if (singleton.getCargo().equals("Gerente")) {
                    RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaPassageirosIdaVolta.jsp");
                    dispatcher.forward(request, response);
                } else {
                    RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaPassageirosIdaVoltaUsuario.jsp");
                    dispatcher.forward(request, response);
                }

            } else if (qntPass == 3) {
                sessao.setAttribute("Passageiro3", pass);
                sessao.setAttribute("assentoPass3", passVoos.getAssento());
                sessao.setAttribute("assentoPass3Volta", passVoosVolta.getAssento());

                qntPass--;
                String qtdPax = Integer.toString(qntPass);
                sessao.setAttribute("qtdpax", qtdPax);
                request.setAttribute("nPassPag", 3);
//                sessao.setAttribute("assentoPass3", assento);

                if (singleton.getCargo().equals("Gerente")) {
                    RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaPassageirosIdaVolta.jsp");
                    dispatcher.forward(request, response);
                } else {
                    RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaPassageirosIdaVoltaUsuario.jsp");
                    dispatcher.forward(request, response);
                }
            }
            //reserva.setCustoTotal((vooIda.getTarifa() * quantidadePass) + serv.getPreco() + (vooVolta.getTarifa() * quantidadePass));

        } else if (opcao.equals("1")) {

            int idIda = (int) sessao.getAttribute("idVooIda");
            telaPass.setAssentoIda(assento);

            try {

                ValidadorTelaPassageiro.validar(telaPass, opcao);

            } catch (ExceptionTelaPassageiro e) {
                request.setAttribute("erroPassageiro", e.getMessage());

                if (singleton.getCargo().equals("Gerente")) {
                    RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaPassageiros.jsp");
                    dispatcher.forward(request, response);
                } else {
                    RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaPassageirosUsuario.jsp");
                    dispatcher.forward(request, response);
                }

            }

            try {
                vooIda = ServicoVoos.obterVoo(idIda);

            } catch (DataExceptions ex) {
                ex.getMessage();
            }

//            passVoos.setVoos(voos);
            passVoos.setIdVoo(vooIda.getId());
            passVoos.setAssento(assento);
            passVoos.setPassageiro(pass);

            pass.setpassVoos(passVoos);

            int quantidadePass = qtdPassReserva;

            if (reserva.getCliente().getNivel().equals("Pelicano")) {
                if (passVoos.getAssento().contains("30.0")) {
                    Double desconto = (Double) sessao.getAttribute("desconto");
                    if (desconto == null) {
                        desconto = 0.0;
                    }
                    desconto = 30.0;
                    sessao.setAttribute("desconto", desconto);
                    reserva.setCustoTotal((vooIda.getTarifa() * quantidadePass) + (vooVolta.getTarifa() * quantidadePass) - desconto + serv.getPreco());

                } else {
                    Double desconto = (Double) sessao.getAttribute("desconto");
                    if (desconto == null) {
                        desconto = 0.0;
                    }
                    desconto = 0.0;
                    sessao.setAttribute("desconto", desconto);
                    reserva.setCustoTotal((vooIda.getTarifa() * quantidadePass) + (vooVolta.getTarifa() * quantidadePass) - desconto + serv.getPreco());
                }
                //reserva.setCustoTotal((vooIda.getTarifa() * quantidadePass) + serv.getPreco() + (vooVolta.getTarifa() * quantidadePass));
            } else if (reserva.getCliente().getNivel().equals("Aguia")) {
                if (passVoos.getAssento().contains("30.0")) {
                    Double desconto = (Double) sessao.getAttribute("desconto");
                    if (desconto == null) {
                        desconto = 0.0;
                    }

                    desconto = desconto + 30 + serv.getPreco();
                    sessao.setAttribute("desconto", desconto);
                    reserva.setCustoTotal((vooIda.getTarifa() * quantidadePass) + (vooVolta.getTarifa() * quantidadePass) - desconto);

                } else {
                    Double desconto = (Double) sessao.getAttribute("desconto");
                    if (desconto == null) {
                        desconto = 0.0;
                    }
                    desconto = desconto + serv.getPreco();
                    sessao.setAttribute("desconto", desconto);
                    reserva.setCustoTotal((vooIda.getTarifa() * quantidadePass) + (vooVolta.getTarifa() * quantidadePass) - desconto);
                }
                //reserva.setCustoTotal((vooIda.getTarifa() * quantidadePass) + serv.getPreco() + (vooVolta.getTarifa() * quantidadePass));
            } else if (reserva.getCliente().getNivel().equals("Pombo")) {
                if (passVoos.getAssento().contains("30.0")) {
                    Double desconto = (Double) sessao.getAttribute("desconto");
                    if (desconto == null) {
                        desconto = 0.0;
                    }
                    desconto = 0.0;
                    sessao.setAttribute("desconto", desconto);
                    reserva.setCustoTotal((vooIda.getTarifa() * quantidadePass) + (vooVolta.getTarifa() * quantidadePass) + 30.0 + serv.getPreco());

                } else {
                    Double desconto = (Double) sessao.getAttribute("desconto");
                    if (desconto == null) {
                        desconto = 0.0;
                    }
                    desconto = 0.0;
                    sessao.setAttribute("desconto", desconto);
                    reserva.setCustoTotal((vooIda.getTarifa() * quantidadePass) + (vooVolta.getTarifa() * quantidadePass) - serv.getPreco());
                }

            }

            sessao.setAttribute("ReservaFinal", reserva);
            sessao.setAttribute("ServicoReservaFinal", serv);
            sessao.setAttribute("VooIdaReservaFinal", vooIda);
            sessao.setAttribute("VooVoltaResrvaFinal", vooVolta);

            Cliente cliente = (Cliente) sessao.getAttribute("clienteSelectReserva");
            String nomePagador = cliente.getNome() + " " + cliente.getSobrenome();
            sessao.setAttribute("nomePagador", nomePagador);
            sessao.setAttribute("custoTotal", reserva.getCustoTotal());
            //---------------------------------------------------------------------------------------------

            if (qntPass == 1) {
                sessao.setAttribute("Passageiro1", pass);
                sessao.setAttribute("PassageiroVoo1", passVoos);
                sessao.setAttribute("assentoPass1", passVoos.getAssento());

                if (singleton.getCargo().equals("Gerente")) {
                    RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaPagamento.jsp");
                    dispatcher.forward(request, response);
                } else {
                    RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaPagamentoUsuario.jsp");
                    dispatcher.forward(request, response);
                }

            } else if (qntPass == 2) {
                sessao.setAttribute("Passageiro2", pass);
                sessao.setAttribute("PassageiroVoo2", passVoos);
                qntPass--;
                String qtdPax = Integer.toString(qntPass);
                sessao.setAttribute("qtdpax", qtdPax);

                request.setAttribute("nPassPag", 2);
                sessao.setAttribute("assentoPass2", passVoos.getAssento());

                if (singleton.getCargo().equals("Gerente")) {
                    RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaPassageiros.jsp");
                    dispatcher.forward(request, response);
                } else {
                    RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaPassageirosUsuario.jsp");
                    dispatcher.forward(request, response);
                }

            } else if (qntPass == 3) {
                sessao.setAttribute("Passageiro3", pass);
                sessao.setAttribute("PassageiroVoo3", passVoos);

                qntPass--;
                String qtdPax = Integer.toString(qntPass);
                sessao.setAttribute("qtdpax", qtdPax);
                request.setAttribute("nPassPag", 3);
                sessao.setAttribute("assentoPass3", passVoos.getAssento());

                if (singleton.getCargo().equals("Gerente")) {
                    RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaPassageiros.jsp");
                    dispatcher.forward(request, response);
                } else {
                    RequestDispatcher dispatcher = request.getRequestDispatcher("/reservaPassageirosUsuario.jsp");
                    dispatcher.forward(request, response);
                }
            }
            //reserva.setCustoTotal((vooIda.getTarifa() * qtdPassReserva) + serv.getPreco());
        }
    }
}
