/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.leonsdev.passageiros.classes;

import br.senac.tads3.pi3b.leonsdev.reserva.classes.Reserva;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Rafael Rodrigues
 */
public class Passageiros {
    private int id, Reserva_ID;
    private String nome, sobrenome, cpf, email;
    private Date dataNascimento;
    private ArrayList<PassageirosVoos> passVoos = new ArrayList<PassageirosVoos>();
    private Reserva reserva;

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public int getReserva_ID() {
        return Reserva_ID;
    }

    public void setReserva_ID(int Reserva_ID) {
        this.Reserva_ID = Reserva_ID;
    }
    
    public Passageiros() {
    }

    public Passageiros(int id, String nome, String sobrenome, String cpf, String email, Date dataNascimento) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.email = email;
        this.dataNascimento = dataNascimento;
    }

    public Passageiros(String nome, String sobrenome, String cpf, String email, Date dataNascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.email = email;
        this.dataNascimento = dataNascimento;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
        public ArrayList<PassageirosVoos> getpassVoos() {
        return passVoos;
    }

    public void setpassVoos(PassageirosVoos passVoos) {
        this.passVoos.add(passVoos);
    }

    
}
