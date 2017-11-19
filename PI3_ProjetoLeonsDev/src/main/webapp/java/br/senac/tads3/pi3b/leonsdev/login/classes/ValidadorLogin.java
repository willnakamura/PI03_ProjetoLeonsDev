/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.leonsdev.login.classes;

import br.senac.tads3.pi3b.leonsdev.exceptions.LoginException;

/**
 *
 * @author Rafael Rodrigues
 */
public class ValidadorLogin {
    public static void Validar (Login login) throws LoginException {
        
        if(login == null){
            throw new LoginException("Dados inválidos.");
        }
        
        if(login.getUserName().length() > 15 || login.getUserName().equals("")){
            throw new LoginException("Nome de usuário inválido.");
        }
        
        if(login.getSenha().length() > 8 || login.getSenha().equals("")){
            throw new LoginException("Senha inválida");
        }
    }
}
