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
    private String ticketCode, nome, sobrenome, Origem, Destino, Assento;
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
        return Origem;
    }

    public void setOrigem(String Origem) {
        this.Origem = Origem;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String Destino) {
        this.Destino = Destino;
    }

    public String getAssento() {
        return Assento;
    }

    public void setAssento(String Assento) {
        this.Assento = Assento;
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
