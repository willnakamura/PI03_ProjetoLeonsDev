/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.leonsdev.relatorios;

import java.sql.Date;

/**
 *
 * @author Josué
 */
public class RelatorioClientes {
    private Date DataCadastro, 	DataUltimaCompra;
    private String Nome, SobreNome, CPF, Email, Nível;
    private int MilhasTotal, QtdReservas;

    public Date getDataCadastro() {
        return DataCadastro;
    }

    public void setDataCadastro(Date DataCadastro) {
        this.DataCadastro = DataCadastro;
    }

    public Date getDataUltimaCompra() {
        return DataUltimaCompra;
    }

    public void setDataUltimaCompra(Date DataUltimaCompra) {
        this.DataUltimaCompra = DataUltimaCompra;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getSobreNome() {
        return SobreNome;
    }

    public void setSobreNome(String SobreNome) {
        this.SobreNome = SobreNome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getNível() {
        return Nível;
    }

    public void setNível(String Nível) {
        this.Nível = Nível;
    }

    public int getMilhasTotal() {
        return MilhasTotal;
    }

    public void setMilhasTotal(int MilhasTotal) {
        this.MilhasTotal = MilhasTotal;
    }

    public int getQtdReservas() {
        return QtdReservas;
    }

    public void setQtdReservas(int QtdReservas) {
        this.QtdReservas = QtdReservas;
    }

    public RelatorioClientes(Date DataCadastro, Date DataUltimaCompra, String Nome, String SobreNome, String CPF, String Email, String Nível, int MilhasTotal, int QtdReservas) {
        this.DataCadastro = DataCadastro;
        this.DataUltimaCompra = DataUltimaCompra;
        this.Nome = Nome;
        this.SobreNome = SobreNome;
        this.CPF = CPF;
        this.Email = Email;
        this.Nível = Nível;
        this.MilhasTotal = MilhasTotal;
        this.QtdReservas = QtdReservas;
    }

    public RelatorioClientes() {
    }
}
