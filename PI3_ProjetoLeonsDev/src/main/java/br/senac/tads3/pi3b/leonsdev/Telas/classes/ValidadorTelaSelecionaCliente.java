/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.leonsdev.Telas.classes;

import br.senac.tads3.pi3b.leonsdev.exceptions.DataExceptions;
import br.senac.tads3.pi3b.leonsdev.exceptions.ExceptionTelaSelecionaCliente;

/**
 *
 * @author Rafael
 */
public class ValidadorTelaSelecionaCliente {
    public static void validar (TelaSelecionaCliente tela) 
            throws ExceptionTelaSelecionaCliente, DataExceptions{
        
        if(tela == null){
            throw new ExceptionTelaSelecionaCliente("Não houve resultado para o CPF informado.");
        }
        
        if(tela.getCpf().trim().equals("") || tela.getCpf() == null){
            throw new ExceptionTelaSelecionaCliente("Informe um CPF válido para pesquisa.");
        }
        
        if(tela.getCpf().length() > 11 || tela.getCpf().length() < 11){
            throw new ExceptionTelaSelecionaCliente("O CPF informado é inválido\nInforme um CPF válido.");
        }
        
    }
}
