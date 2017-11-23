/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.leonsdev.passageiros.classes;

import br.senac.tads3.pi3b.leonsdev.voos.classes.Voos;
import java.util.ArrayList;

/**
 *
 * @author Rafael Rodrigues
 */
public class PassageirosVoos {

    public PassageirosVoos(String status, String assento, Passageiros passageiro) {
        this.status = status;
        this.assento = assento;
        this.passageiro = passageiro;
    }

    private String status;
    private int idVoo;

    public int getIdVoo() {
        return idVoo;
    }

    public void setIdVoo(int idVoo) {
        this.idVoo = idVoo;
    }
    private String assento;
    private Passageiros passageiro;

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
