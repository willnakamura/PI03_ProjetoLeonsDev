/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.leonsdev.Telas.classes;

import java.util.Date;

/**
 *
 * @author Rafael
 */
public class TelaVoo {
    private String AeroportoOrigem, AeroportoDestino, opcaoIdaVolta;
    //String bagagem;
    private Date dataIda, dataVolta;
    private int qtdPass;

    public TelaVoo() {
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

    public String getOpcaoIdaVolta() {
        return opcaoIdaVolta;
    }

    public void setOpcaoIdaVolta(String opcaoIdaVolta) {
        this.opcaoIdaVolta = opcaoIdaVolta;
    }

    public Date getDataIda() {
        return dataIda;
    }

    public void setDataIda(Date dataIda) {
        this.dataIda = dataIda;
    }

    public Date getDataVolta() {
        return dataVolta;
    }

    public void setDataVolta(Date dataVolta) {
        this.dataVolta = dataVolta;
    }

    public int getQtdPass() {
        return qtdPass;
    }

    public void setQtdPass(int qtdPass) {
        this.qtdPass = qtdPass;
    }
    
    
}
