/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.leonsdev.passageiros.classes;

import br.senac.tads3.pi3b.leonsdev.exceptions.PassageirosException;
import java.util.Calendar;

/**
 *
 * @author Rafael Rodrigues
 */
public class ValidadorPassageiros {
   
    public static void Validar (Passageiros passageiro) throws PassageirosException{
        Calendar calendario = Calendar.getInstance();
        
        if(passageiro == null){
            throw new PassageirosException("Dados inválidos.");
        }
        
        if(passageiro.getCpf() == null || passageiro.getCpf().equals("")){
            throw new PassageirosException("Favor, informar um CPF válido.");
        }
        
        if(passageiro.getCpf().length() > 11){
            throw new PassageirosException("CPF inválido.");
        }
        
        if(passageiro.getDataNascimento() == null || calendario.before(passageiro.getDataNascimento())){
            throw new PassageirosException("Data inválida.");
        }
        
        if(passageiro.getEmail() == null || passageiro.getEmail().equals("")){
            throw new PassageirosException("Favor, informar um email.");
        }
        
        if(passageiro.getEmail().length() > 45){
            throw new PassageirosException("Email invállido.");
        }
        
        if(passageiro.getNome() == null || passageiro.getNome().equals("")){
            throw new PassageirosException("Favor, informe seu nome.");
        }
        
        if(passageiro.getNome().length() > 45){
            throw new PassageirosException("Nome inválido.");
        }
        
        if(passageiro.getSobrenome() == null || passageiro.getSobrenome().equals("")){
            throw new PassageirosException("Favor, informe um sobrenome.");
        }
        
        if(passageiro.getSobrenome().length() > 45){
            throw new PassageirosException("Sobrenome inválido.");
        }
    }
}
