/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.leonsdev.usuario.classes;

import br.senac.tads3.pi3b.leonsdev.exceptions.ExceptionUsuario;

/**
 *
 * @author Rafael Rodrigues
 */
public class ValidadorUsuario {
    public void Validar (Usuario usuario) throws ExceptionUsuario{
        
        if(usuario == null){
            throw new ExceptionUsuario("Dados inválidos.");
        }
        
        
        if(usuario.getNome() == null || usuario.getNome().equals("")){
            throw new ExceptionUsuario("Favor, informe um nome valido.");
        }
        if(usuario.getNome().length() > 10){
            throw new ExceptionUsuario("Nome inválido.");
        }
        
        
        if(usuario.getSobrenome()== null || usuario.getSobrenome().equals("")){
            throw new ExceptionUsuario("Favor, informe um sobrenome valido.");
        }
        if(usuario.getSobrenome().length() > 10){
            throw new ExceptionUsuario("sobrenome inválido.");
        }
        
        
        if(usuario.getEmail() == null || usuario.getEmail().equals("")){
            throw new ExceptionUsuario("Favor, informe um email válido.");
        }
        if(usuario.getEmail().length() > 25){
            throw new ExceptionUsuario("Email inválido.");
        }
        
        
        if(usuario.getCpf() == null || usuario.getCpf().equals("")){
            throw new ExceptionUsuario("Favor, informe um CPF válido.");
        }
        if(usuario.getCpf().length() > 11){
            throw new ExceptionUsuario("CPF inválido.");
        }
        
        
        if(usuario.getCargo() == null || usuario.getCargo().equals("")){
            throw new ExceptionUsuario("Favor, informe um cargo válido.");
        }
        if(usuario.getCargo().length() > 20){
            throw new ExceptionUsuario("Cargo inválido.");
        }
        
        
        if(usuario.getLogin() == null || usuario.getLogin().equals("")){
            throw new ExceptionUsuario("Favor, informe um login válido.");
        }
        if(usuario.getLogin().length() > 15){
            throw new ExceptionUsuario("Login inválido.");
        }
        
        
        if(usuario.getSenha() == null || usuario.getSenha().equals("")){
            throw new ExceptionUsuario("Favor, informe uma senha válida.");
        }
        if(usuario.getSenha().length() > 8){
            throw new ExceptionUsuario("Senha inválida.");
        }
    }
}

