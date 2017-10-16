/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.leonsdev.aeronave.classes;

/**
 *
 * @author Rafael Rodrigues
 */
public class Aeronave {
    private int id;
    private String fabricante, modelo;
    private Integer totalAssentos;
    boolean Ativo;

    public Aeronave() {
    }

    public Aeronave(String fabricante, String modelo, Integer totalAssentos) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.totalAssentos = totalAssentos;
    }

    public int getId() {
        return id;
    }

    public boolean isAtivo() {
        return Ativo;
    }

    public void setAtivo(boolean Ativo) {
        this.Ativo = Ativo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getTotalAssentos() {
        return totalAssentos;
    }

    public void setTotalAssentos(Integer totalAssentos) {
        this.totalAssentos = totalAssentos;
    }
    
    
}
