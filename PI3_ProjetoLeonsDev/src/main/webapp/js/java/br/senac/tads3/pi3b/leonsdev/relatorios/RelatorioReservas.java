/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.leonsdev.relatorios;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author Josué
 */
public class RelatorioReservas {

    private Date DataReserva, DataPartida;
    private String TicketCode, PrimeiroNome_Passageiro, UltimoNome_Passageiro, AeroportoOrigem, AeroportoDestino, Assento;
    private Integer Nr_Voo;
    private Time HoraVoo;

    public Date getDataReserva() {
        return DataReserva;
    }

    public void setDataReserva(Date DataReserva) {
        this.DataReserva = DataReserva;
    }

    public Date getDataPartida() {
        return DataPartida;
    }

    public void setDataPartida(Date DataPartida) {
        this.DataPartida = DataPartida;
    }

    public String getTicketCode() {
        return TicketCode;
    }

    public void setTicketCode(String TicketCode) {
        this.TicketCode = TicketCode;
    }

    public String getPrimeiroNome_Passageiro() {
        return PrimeiroNome_Passageiro;
    }

    public void setPrimeiroNome_Passageiro(String PrimeiroNome_Passageiro) {
        this.PrimeiroNome_Passageiro = PrimeiroNome_Passageiro;
    }

    public String getUltimoNome_Passageiro() {
        return UltimoNome_Passageiro;
    }

    public void setUltimoNome_Passageiro(String UltimoNome_Passageiro) {
        this.UltimoNome_Passageiro = UltimoNome_Passageiro;
    }

    public String getAeroportoOrigem() {
        return AeroportoOrigem;
    }

    public void setAeroportoOrigem(String AeroportoOrigem) {
        this.AeroportoOrigem = AeroportoOrigem;
    }

    public String getAeroportoDestino() {
        return AeroportoDestino;
    }

    public void setAeroportoDestino(String AeroportoDestino) {
        this.AeroportoDestino = AeroportoDestino;
    }

    public String getAssento() {
        return Assento;
    }

    public void setAssento(String Assento) {
        this.Assento = Assento;
    }

    public Integer getNr_Voo() {
        return Nr_Voo;
    }

    public void setNr_Voo(Integer Nr_Voo) {
        this.Nr_Voo = Nr_Voo;
    }

    public Time getHoraVoo() {
        return HoraVoo;
    }

    public void setHoraVoo(Time HoraVoo) {
        this.HoraVoo = HoraVoo;
    }

    public RelatorioReservas(Date DataReserva, Date DataPartida, String TicketCode, String PrimeiroNome_Passageiro, String UltimoNome_Passageiro, String AeroportoOrigem, String AeroportoDestino, String Assento, Integer Nr_Voo, Time HoraVoo) {
        this.DataReserva = DataReserva;
        this.DataPartida = DataPartida;
        this.TicketCode = TicketCode;
        this.PrimeiroNome_Passageiro = PrimeiroNome_Passageiro;
        this.UltimoNome_Passageiro = UltimoNome_Passageiro;
        this.AeroportoOrigem = AeroportoOrigem;
        this.AeroportoDestino = AeroportoDestino;
        this.Assento = Assento;
        this.Nr_Voo = Nr_Voo;
        this.HoraVoo = HoraVoo;
    }

    public RelatorioReservas() {
    }
    
}
