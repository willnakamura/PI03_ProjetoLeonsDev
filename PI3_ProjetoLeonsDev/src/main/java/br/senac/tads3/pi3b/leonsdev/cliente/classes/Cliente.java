/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.leonsdev.cliente.classes;

import java.util.Date;

/**
 *
 * @author Nakamura-PC
 */
public class Cliente {

    //
    private int id;
    private String nome, sobrenome, cpf, email, celular, estado, genero, cidade, endereco, cep;
    private Date dataNascimento;
    private boolean ativo;
    
    public Cliente() {

    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente(int id, String nome, String sobrenome, String cpf, String email, String celular, String estado, String genero, String cidade, String endereco, String cep, Date dataNascimento, boolean ativo) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.email = email;
        this.celular = celular;
        this.estado = estado;
        this.genero = genero;
        this.cidade = cidade;
        this.endereco = endereco;
        this.cep = cep;
        this.dataNascimento = dataNascimento;
        this.ativo = ativo;
    }

    public Cliente(String nome, String sobrenome, String cpf, String email, String celular, String estado, String genero, String cidade, String endereco, String cep, Date dataNascimento, boolean ativo) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.email = email;
        this.celular = celular;
        this.estado = estado;
        this.genero = genero;
        this.cidade = cidade;
        this.endereco = endereco;
        this.cep = cep;
        this.dataNascimento = dataNascimento;
        this.ativo = ativo;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getId() {
        return id;
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

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
   
}
