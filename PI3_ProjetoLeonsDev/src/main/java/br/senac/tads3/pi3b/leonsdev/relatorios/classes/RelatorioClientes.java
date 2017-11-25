/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.leonsdev.relatorios.classes;

import java.sql.Date;

/**
 *
 * @author Josué
 */
public class RelatorioClientes {
    private Date dataCadastro, 	dataUltimaCompra;
    private String nome, sobrenome, cpf, email, nivel;
    private int milhasTotal, qtdReservas;

    public RelatorioClientes() {
    }

    public RelatorioClientes(Date dataCadastro, Date dataUltimaCompra, String nome, String sobrenome, String cpf, String email, String nível, int milhasTotal, int qtdReservas) {
        this.dataCadastro = dataCadastro;
        this.dataUltimaCompra = dataUltimaCompra;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.email = email;
        this.nivel = nível;
        this.milhasTotal = milhasTotal;
        this.qtdReservas = qtdReservas;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Date getDataUltimaCompra() {
        return dataUltimaCompra;
    }

    public void setDataUltimaCompra(Date dataUltimaCompra) {
        this.dataUltimaCompra = dataUltimaCompra;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    
    public int getMilhasTotal() {
        return milhasTotal;
    }

    public void setMilhasTotal(int milhasTotal) {
        this.milhasTotal = milhasTotal;
    }

    public int getQtdReservas() {
        return qtdReservas;
    }

    public void setQtdReservas(int qtdReservas) {
        this.qtdReservas = qtdReservas;
    }

    
}
