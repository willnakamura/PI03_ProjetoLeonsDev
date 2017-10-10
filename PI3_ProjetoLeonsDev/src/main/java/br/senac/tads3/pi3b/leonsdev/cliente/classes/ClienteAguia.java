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
public class ClienteAguia extends Cliente {
    private String nivel;
    
    public ClienteAguia (){
        
    }

    public ClienteAguia(String nivel) {
        this.nivel = nivel;
    }

    public ClienteAguia(String nivel, int id, String nome, String sobrenome, String endereco, String telefone, String email, String genero, Long cpf, Date dataNascimento, boolean enable) {
        super(id, nome, sobrenome, endereco, telefone, email, genero, cpf, dataNascimento, enable);
        this.nivel = nivel;
    }

    public ClienteAguia(String nivel, String nome, String endereco, String telefone, String email, String genero, Long cpf, Date dataNascimento) {
        super(nome, endereco, telefone, email, genero, cpf, dataNascimento);
        this.nivel = nivel;
    }

    public String getNivel() {
        return nivel;
    }

  
    
}
