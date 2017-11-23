/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.leonsdev.passageiros.classes;

import br.senac.tads3.pi3b.leonsdev.voos.classes.Voos;

/**
 *
 * @author Rafael Rodrigues
 */
public class PassageirosVoos {

    private Voos vooIda, vooVolta;
    private String status;
    private String assento;
    private Passageiros passageiro;

    public PassageirosVoos(Voos vooIda, Voos vooVolta, String status, String assento, Passageiros passageiro) {
        this.vooIda = vooIda;
        this.vooVolta = vooVolta;
        this.status = status;
        this.assento = assento;
        this.passageiro = passageiro;
    }

    public Voos getVooIda() {
        return vooIda;
    }

    public void setVooIda(Voos vooIda) {
        this.vooIda = vooIda;
    }

    public Voos getVooVolta() {
        return vooVolta;
    }

    public void setVooVolta(Voos vooVolta) {
        this.vooVolta = vooVolta;
    }

    public PassageirosVoos() {
    }

    public String getAssento() {
        return assento;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setAssento(String assento) {
        this.assento = assento;
    }

    public void setPassageiro(Passageiros passageiro) {
        this.passageiro = passageiro;
    }

}
