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
    private String aeroportoOrigem, aeroportoDestino, opcaoIdaVolta;
    private Date dataIda, dataVolta;
    private String qtdPass;

    public TelaVoo() {
    }

    public String getAeroportoOrigem() {
        return aeroportoOrigem;
    }

    public void setAeroportoOrigem(String aeroportoOrigem) {
        this.aeroportoOrigem = aeroportoOrigem;
    }

    public String getAeroportoDestino() {
        return aeroportoDestino;
    }

    public void setAeroportoDestino(String aeroportoDestino) {
        this.aeroportoDestino = aeroportoDestino;
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

    public String getQtdPass() {
        return qtdPass;
    }

    public void setQtdPass(String qtdPass) {
        this.qtdPass = qtdPass;
    }
    
    
}
