/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.leonsdev.servico.classes;

/**
 *
 * @author Nakamura-PC
 */
public class Servico {

    private Integer idServico;
    private String extraBag1, extraBag2, extraBag3;
    private Double preco;
    //private Integer idReserva;

    public Servico(Integer idServico, String extraBag1, String extraBag2, String extraBag3, Double preco) {
        this.idServico = idServico;
        this.extraBag1 = extraBag1;
        this.extraBag2 = extraBag2;
        this.extraBag3 = extraBag3;
        this.preco = preco;
    }

    public Servico(String extraBag1, String extraBag2, String extraBag3, Double preco) {
        this.extraBag1 = extraBag1;
        this.extraBag2 = extraBag2;
        this.extraBag3 = extraBag3;
        this.preco = preco;
    }

    public Integer getIdServico() {
        return idServico;
    }

    public String getExtraBag1() {
        return extraBag1;
    }

    public void setExtraBag1(String extraBag1) {
        this.extraBag1 = extraBag1;
    }

    public String getExtraBag2() {
        return extraBag2;
    }

    public void setExtraBag2(String extraBag2) {
        this.extraBag2 = extraBag2;
    }

    public String getExtraBag3() {
        return extraBag3;
    }

    public void setExtraBag3(String extraBag3) {
        this.extraBag3 = extraBag3;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
