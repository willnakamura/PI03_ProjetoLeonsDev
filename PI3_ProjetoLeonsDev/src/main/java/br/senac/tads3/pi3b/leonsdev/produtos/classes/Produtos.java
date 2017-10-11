/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.leonsdev.produtos.classes;

/**
 *
 * @author Rafael Rodrigues
 */
public class Produtos {
    int id;
    String combo1, combo2, combo3;
    double preco;
    
    //construtores
    public Produtos (){
        
    }
    
    public Produtos(int id, String combo1, String combo2, String combo3, double preco) {
        this.id = id;
        this.combo1 = combo1;
        this.combo2 = combo2;
        this.combo3 = combo3;
        this.preco = preco;
    }
    //
    
    //metodos
    public int getId() {
        return id;
    }

    public String getCombo1() {
        return combo1;
    }

    public String getCombo2() {
        return combo2;
    }

    public String getCombo3() {
        return combo3;
    }

    public double getPreco() {
        return preco;
    }
    //
}
