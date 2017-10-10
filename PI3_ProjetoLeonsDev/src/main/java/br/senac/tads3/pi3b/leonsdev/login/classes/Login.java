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
    private String userName, senha;
    

    //construtores
    public Login(String userName, String senha) {
        this.userName = userName;
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
