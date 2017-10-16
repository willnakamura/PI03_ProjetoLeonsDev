/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.leonsdev.passageiros.classes;

/**
 *
 * @author Rafael Rodrigues
 */
public class PassageirosVoos {
    private Passageiros passageiro;
    private String status;

    public PassageirosVoos(Passageiros passageiro, String status) {
        this.passageiro = passageiro;
        this.status = status;
    }

    public PassageirosVoos() {
    }

    public Passageiros getPassageiro() {
        return passageiro;
    }

    public String getStatus() {
        return status;
    }
}
