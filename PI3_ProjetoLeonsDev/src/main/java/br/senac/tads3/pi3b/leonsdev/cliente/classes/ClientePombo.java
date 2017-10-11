/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.leonsdev.cliente.classes;

import java.util.Date;

/**
 *
 * @author Rafael Rodrigues
 */
public class ClientePombo extends Cliente {
    private String nivel;

    public ClientePombo(){
        
    }
    
    public ClientePombo(String nivel) {
        this.nivel = nivel;
    }

    public ClientePombo(String nivel, int id, String nome, String sobrenome, String cpf, String email, String celular, String estado, String genero, String cidade, String endereco, String cep, Date dataNascimento, boolean ativo) {
        super(id, nome, sobrenome, cpf, email, celular, estado, genero, cidade, endereco, cep, dataNascimento, ativo);
        this.nivel = nivel;
    }

    public ClientePombo(String nivel, String nome, String sobrenome, String cpf, String email, String celular, String estado, String genero, String cidade, String endereco, String cep, Date dataNascimento, boolean ativo) {
        super(nome, sobrenome, cpf, email, celular, estado, genero, cidade, endereco, cep, dataNascimento, ativo);
        this.nivel = nivel;
    }

    public String getNivel() {
        return nivel;
    }


}