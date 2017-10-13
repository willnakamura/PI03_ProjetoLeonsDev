/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.leonsdev.voos.classes;

import java.util.Date;

/**
 *
 * @author Rafael Rodrigues
 */
public class Voos {
    private int id, distanciaMilhas;
    private Integer nrVoo;
    private String aeroportoPartida, aeroportoChegada, Operadora, horaPartida, horaChegada;
    private Date DataVoo;

    public Voos (){
        
    }

    public Voos(int id, int distanciaMilhas, Integer nrVoo, String aeroportoPartida, String aeroportoChegada, String Operadora, String horaPartida, String horaChegada, Date DataVoo) {
        this.id = id;
        this.distanciaMilhas = distanciaMilhas;
        this.nrVoo = nrVoo;
        this.aeroportoPartida = aeroportoPartida;
        this.aeroportoChegada = aeroportoChegada;
        this.Operadora = Operadora;
        this.horaPartida = horaPartida;
        this.horaChegada = horaChegada;
        this.DataVoo = DataVoo;
    }

    public Voos(int distanciaMilhas, Integer nrVoo, String aeroportoPartida, String aeroportoChegada, String Operadora, String horaPartida, String horaChegada, Date DataVoo) {
        this.distanciaMilhas = distanciaMilhas;
        this.nrVoo = nrVoo;
        this.aeroportoPartida = aeroportoPartida;
        this.aeroportoChegada = aeroportoChegada;
        this.Operadora = Operadora;
        this.horaPartida = horaPartida;
        this.horaChegada = horaChegada;
        this.DataVoo = DataVoo;
    }
    
    
    
    //metodos
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public void setNrVoo(Integer nrVoo) {
        this.nrVoo = nrVoo;
    }
    
    public Integer getNrVoo() {
        return nrVoo;
    }

    public int getDistanciaMilhas() {
        return distanciaMilhas;
    }

    public void setDistanciaMilhas(int distanciaMilhas) {
        this.distanciaMilhas = distanciaMilhas;
    }

    public String getAeroportoPartida() {
        return aeroportoPartida;
    }

    public void setAeroportoPartida(String aeroportoPartida) {
        this.aeroportoPartida = aeroportoPartida;
    }

    public String getAeroportoChegada() {
        return aeroportoChegada;
    }

    public void setAeroportoChegada(String aeroportoChegada) {
        this.aeroportoChegada = aeroportoChegada;
    }

    public String getOperadora() {
        return Operadora;
    }

    public void setOperadora(String Operadora) {
        this.Operadora = Operadora;
    }

    public String getHoraPartida() {
        return horaPartida;
    }

    public void setHoraPartida(String horaPartida) {
        this.horaPartida = horaPartida;
    }

    public String getHoraChegada() {
        return horaChegada;
    }

    public void setHoraChegada(String horaChegada) {
        this.horaChegada = horaChegada;
    }

    public Date getDataVoo() {
        return DataVoo;
    }

    public void setDataVoo(Date DataVoo) {
        this.DataVoo = DataVoo;
    }
 }
