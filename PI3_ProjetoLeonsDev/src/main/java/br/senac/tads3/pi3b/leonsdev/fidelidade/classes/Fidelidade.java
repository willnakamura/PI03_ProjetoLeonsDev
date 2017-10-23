/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.leonsdev.fidelidade.classes;

import br.senac.tads3.pi3b.leonsdev.cliente.classes.Cliente;

/**
 *
 * @author Rafael Rodrigues
 */
public class Fidelidade {
    private int programaId;
    private double milhasSaldo, milhasTotal;
    private String nivel;
    private Cliente cli;

    public Fidelidade(int programaId, double milhasSaldo, double milhasTotal, String nivel, Cliente cli) {
        this.programaId = programaId;
        this.milhasSaldo = milhasSaldo;
        this.milhasTotal = milhasTotal;
        this.nivel = nivel;
        this.cli = cli;
    }

    public Fidelidade(double milhasSaldo, double milhasTotal, String nivel, Cliente cli) {
        this.milhasSaldo = milhasSaldo;
        this.milhasTotal = milhasTotal;
        this.nivel = nivel;
        this.cli = cli;
    }

    public Fidelidade() {
    }

    public int getProgramaId() {
        return programaId;
    }

    public void setProgramaId(int programaId) {
        this.programaId = programaId;
    }

    public double getMilhasSaldo() {
        return milhasSaldo;
    }

    public void setMilhasSaldo(double milhasSaldo) {
        this.milhasSaldo = milhasSaldo;
    }

    public double getMilhasTotal() {
        return milhasTotal;
    }

    public void setMilhasTotal(double milhasTotal) {
        this.milhasTotal = milhasTotal;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public Cliente getCli() {
        return cli;
    }

    public void setCli(Cliente cli) {
        this.cli = cli;
    }
    
    
}
