/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.leonsdev.login.classes;

/**
 *
 * @author Rafael Rodrigues
 */
public class Login {
    private String userName, senha, cargo, nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    private int funcID;

    public int getFuncID() {
        return funcID;
    }

    public void setFuncID(int funcID) {
        this.funcID = funcID;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    

    //construtores
    public Login(String userName, String senha) {
        this.userName = userName;
        this.senha = senha;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public Login (){
        
    }
    
    //metodos
    public String getUserName() {
        return userName;
    }

    public String getSenha() {
        return senha;
    }

}
