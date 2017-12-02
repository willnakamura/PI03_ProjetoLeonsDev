/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.leonsdev.reserva.classes;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author Josué
 */
public class ReservaConsultar {
    private Date dataReserva, dataPartida;
    private String ticketCode, nome, sobrenome, origem, destino, assento;
    private int nVoo, reservaID;

    public int getReservaID() {
        return reservaID;
    }

    public void setReservaID(int reservaID) {
        this.reservaID = reservaID;
    }
    private Time horaVoo;

    public Date getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(Date dataReserva) {
        this.dataReserva = dataReserva;
    }

    public Date getDataPartida() {
        return dataPartida;
    }

    public void setDataPartida(Date dataPartida) {
        this.dataPartida = dataPartida;
    }

    public String getTicketCode() {
        return ticketCode;
    }

    public void setTicketCode(String ticketCode) {
        this.ticketCode = ticketCode;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String Destino) {
        this.destino = Destino;
    }

    public String getAssento() {
        return assento;
    }

    public void setAssento(String assento) {
        this.assento = assento;
    }

    public int getnVoo() {
        return nVoo;
    }

    public void setnVoo(int nVoo) {
        this.nVoo = nVoo;
    }

    public Time getHoraVoo() {
        return horaVoo;
    }

    public void setHoraVoo(Time horaVoo) {
        this.horaVoo = horaVoo;
    }
}
