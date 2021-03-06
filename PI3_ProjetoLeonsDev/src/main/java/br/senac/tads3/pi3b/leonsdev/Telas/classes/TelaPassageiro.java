/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.leonsdev.Telas.classes;

import java.util.Date;

/**
 *
 * @author Nakamura-PC
 */
public class TelaPassageiro {

    private String nome, sobrenome, cpf;
    private Date dtNasc;
    private String email, assentoIda, assentoVolta;

    public TelaPassageiro() {

    }

    public String getAssentoIda() {
        return assentoIda;
    }

    public void setAssentoIda(String assentoIda) {
        this.assentoIda = assentoIda;
    }

    public String getAssentoVolta() {
        return assentoVolta;
    }

    public void setAssentoVolta(String assentoVolta) {
        this.assentoVolta = assentoVolta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDtNasc() {
        return dtNasc;
    }

    public void setDtNasc(Date dtNasc) {
        this.dtNasc = dtNasc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
