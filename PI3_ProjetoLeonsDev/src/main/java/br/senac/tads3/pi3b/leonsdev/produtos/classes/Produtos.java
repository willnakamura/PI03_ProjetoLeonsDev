/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.leonsdev.produtos.classes;

import br.senac.tads3.pi3b.leonsdev.reserva.classes.Reserva;

/**
 *
 * @author Rafael Rodrigues
 */
public class Produtos {
    int id, Reserva_ID;

    String combo;
    Double preco;
    boolean ativo;
     Reserva reserva;
    
    public Produtos (){
        
    }

    public Produtos(int id, int Reserva_ID, String combo, Double preco, boolean ativo, Reserva reserva) {
        this.id = id;
        this.Reserva_ID = Reserva_ID;
        this.combo = combo;
        this.preco = preco;
        this.ativo = ativo;
        this.reserva = reserva;
    }
    
    
    public int getReserva_ID() {
        return Reserva_ID;
    }

    public void setReserva_ID(int Reserva_ID) {
        this.Reserva_ID = Reserva_ID;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCombo(String combo) {
        this.combo = combo;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
   

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }
    
    public int getId() {
        return id;
    }

    public String getCombo() {
        return combo;
    }

    public Double getPreco() {
        return preco;
    }
    //
}
