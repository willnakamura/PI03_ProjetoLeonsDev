/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.leonsdev.relatorios.classes;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author Josué
 */
public class RelatorioReservas {

    private Date dataReserva, dataPartida;
    private String ticketCode, primeiroNome_Passageiro, ultimoNome_Passageiro, 
            aeroportoOrigem, aeroportoDestino, assento;
    private Integer nr_Voo;
    private Time horaVoo;

    public RelatorioReservas() {
    }

    public RelatorioReservas(Date dataReserva, Date dataPartida, String ticketCode, String primeiroNome_Passageiro, String ultimoNome_Passageiro, String aeroportoOrigem, String aeroportoDestino, String assento, Integer nr_Voo, Time horaVoo) {
        this.dataReserva = dataReserva;
        this.dataPartida = dataPartida;
        this.ticketCode = ticketCode;
        this.primeiroNome_Passageiro = primeiroNome_Passageiro;
        this.ultimoNome_Passageiro = ultimoNome_Passageiro;
        this.aeroportoOrigem = aeroportoOrigem;
        this.aeroportoDestino = aeroportoDestino;
        this.assento = assento;
        this.nr_Voo = nr_Voo;
        this.horaVoo = horaVoo;
    }

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

    public String getPrimeiroNome_Passageiro() {
        return primeiroNome_Passageiro;
    }

    public void setPrimeiroNome_Passageiro(String primeiroNome_Passageiro) {
        this.primeiroNome_Passageiro = primeiroNome_Passageiro;
    }

    public String getUltimoNome_Passageiro() {
        return ultimoNome_Passageiro;
    }

    public void setUltimoNome_Passageiro(String ultimoNome_Passageiro) {
        this.ultimoNome_Passageiro = ultimoNome_Passageiro;
    }

    public String getAeroportoOrigem() {
        return aeroportoOrigem;
    }

    public void setAeroportoOrigem(String aeroportoOrigem) {
        this.aeroportoOrigem = aeroportoOrigem;
    }

    public String getAeroportoDestino() {
        return aeroportoDestino;
    }

    public void setAeroportoDestino(String aeroportoDestino) {
        this.aeroportoDestino = aeroportoDestino;
    }

    public String getAssento() {
        return assento;
    }

    public void setAssento(String assento) {
        this.assento = assento;
    }

    public Integer getNr_Voo() {
        return nr_Voo;
    }

    public void setNr_Voo(Integer nr_Voo) {
        this.nr_Voo = nr_Voo;
    }

    public Time getHoraVoo() {
        return horaVoo;
    }

    public void setHoraVoo(Time horaVoo) {
        this.horaVoo = horaVoo;
    }

    
}
