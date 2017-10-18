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

    public int getReserva_ID() {
        return Reserva_ID;
    }

    public void setReserva_ID(int Reserva_ID) {
        this.Reserva_ID = Reserva_ID;
    }
    String combo;
    double preco;
    boolean ativo;

    public void setId(int id) {
        this.id = id;
    }

    public void setCombo(String combo) {
        this.combo = combo;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    Reserva reserva;

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }
    
    //construtores
    public Produtos (){
        
    }
    
    public Produtos(int id, String combo, double preco) {
        this.id = id;
        this.combo = combo;
        this.preco = preco;
    }
    //
    
    //metodos
    public int getId() {
        return id;
    }

    public String getCombo() {
        return combo;
    }

    public double getPreco() {
        return preco;
    }
    //
}
