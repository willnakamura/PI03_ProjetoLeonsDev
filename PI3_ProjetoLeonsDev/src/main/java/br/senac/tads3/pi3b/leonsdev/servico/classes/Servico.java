/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.leonsdev.servico.classes;

import br.senac.tads3.pi3b.leonsdev.reserva.classes.Reserva;

/**
 *
 * @author Nakamura-PC
 */
public class Servico {

    private Integer idServico, Reserva_ID;
    private String extraBag;
    private Double preco;
    private Reserva reserva;
    private Boolean ativo;
    //private Integer idReserva;

    public Integer getReserva_ID() {
        return Reserva_ID;
    }

    public void setReserva_ID(Integer Reserva_ID) {
        this.Reserva_ID = Reserva_ID;
    }
    

    public Servico (){
        
    }
    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public Servico(Integer idServico, String extraBag, Double preco) {
        this.idServico = idServico;
        this.extraBag = extraBag;
        this.preco = preco;
    }

    public Servico(String extraBag, Double preco) {
        this.extraBag = extraBag;
        this.preco = preco;
    }

    public Integer getIdServico() {
        return idServico;
    }

    public String getExtraBag() {
        return extraBag;
    }

    public void setExtraBag(String extraBag) {
        this.extraBag = extraBag;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
