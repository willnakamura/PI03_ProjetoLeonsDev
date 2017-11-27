/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.leonsdev.voos.classes;

/**
 *
 * @author Rafael
 */
public class Assento {
    private String nAssento;
    private Double preco;

    public Assento(String nAssento, Double preco) {
        this.nAssento = nAssento;
        this.preco = preco;
    }

    public Assento() {
    }

    public String getnAssento() {
        return nAssento;
    }

    public void setnAssento(String nAssento) {
        this.nAssento = nAssento;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
    
    
}
