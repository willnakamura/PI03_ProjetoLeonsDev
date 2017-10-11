/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.leonsdev.usuario.classes;

import br.senac.tads3.pi3b.leonsdev.usuario.classes.Usuario;
import br.senac.tads3.pi3b.leonsdev.exceptions.ExceptionUsuario;
import java.util.Calendar;

/**
 *
 * @author Rafael Rodrigues
 */
public class ValidadorUsuario {
    public static void validarCampos (Usuario usuario) throws ExceptionUsuario {
        Calendar calendario = Calendar.getInstance();

        //Realização de validações de negócio
        if (usuario == null) {
            throw new ExceptionUsuario("Não foi informado um Usuário do sistema válido!");
        }
        //
        if (usuario.getNome() == null || "".equals(usuario.getNome())) {
            throw new ExceptionUsuario("Favor informar o nome Válido!");
        }
        if (usuario.getNome().length() > 50) {
            throw new ExceptionUsuario("Ultrapassou o limite de 50 caracteres no campo nome.");
        }
        //
        if ("".equals(usuario.getCpf()) || usuario.getCpf() == null) {
            throw new ExceptionUsuario("Favor informar um CPF válido!");
        }
        //
        if (usuario.getDataNasc()== null || calendario.before(usuario.getDataNasc())) {
            throw new ExceptionUsuario("Favor informar uma data válida!");
        }
        //
       
        //
        if (usuario.getEmail().length() > 40) {
            throw new ExceptionUsuario("Ultrapassou o limite de 40 caracteres no campo email.");
        }
        //
        if (usuario.getCargo() == null || "".equals(usuario.getCargo())) {
            throw new ExceptionUsuario("Favor informe o cargo do Usuário!");
        }
        if (usuario.getCargo().length() > 20) {
            throw new ExceptionUsuario("Ultrapassou o limite de 20 caracteres no campo cargo;");
        }
        //
        if (usuario.getLogin() == null || "".equals(usuario.getLogin())) {
            throw new ExceptionUsuario("Favor informar o login do Usuário!");
        }
        if (usuario.getLogin().length() > 10) {
            throw new ExceptionUsuario("Ultrapassou o limite de 10 caracteres no campo login.");
        }
        //
        if (usuario.getSenha() == null || "".equals(usuario.getSenha())) {
            throw new ExceptionUsuario("Favor informar a senha do Usuário!");
        }
        if (usuario.getSenha().length() > 50) {
            throw new ExceptionUsuario("Ultrapassou o limite de 50 caracteres no campo senha.");
        }
       
        if (usuario.getNome().length() > 50) {
            throw new ExceptionUsuario("Ultrapassou o limite de 70 caracteres no campo endereço.");
        }
        //
    }
}

