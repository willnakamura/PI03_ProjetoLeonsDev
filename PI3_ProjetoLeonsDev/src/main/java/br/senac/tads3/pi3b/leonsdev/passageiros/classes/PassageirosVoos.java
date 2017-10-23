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
    private Voos voo;
    private String status;
    private String assento;
    private Passageiros passageiro;

    public PassageirosVoos(Voos voo, String status, String assento, Passageiros passageiro) {
        this.voo = voo;
        this.status = status;
        this.assento = assento;
        this.passageiro = passageiro;
    }
    
    public PassageirosVoos() {
    }

    public String getAssento() {
        return assento;
    }

    public Voos getVoo() {
        return voo;
    }

    public String getStatus() {
        return status;
    }

}
