/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.leonsdev.Telas.classes;

/**
 *
 * @author Rafael
 */
public class TelaSelecionaCliente {
    private String cpf;

    public TelaSelecionaCliente() {
    }

    public TelaSelecionaCliente(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
