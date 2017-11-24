/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.leonsdev.Telas.classes;

import br.senac.tads3.pi3b.leonsdev.exceptions.DataExceptions;
import br.senac.tads3.pi3b.leonsdev.exceptions.ExceptionTelaPagamento;

/**
 *
 * @author Rafael
 */
public class ValidadorTelaPagamento {
    public static void validar (TelaPagamento tela) 
            throws ExceptionTelaPagamento, DataExceptions {
        
        
        if(tela == null){
            throw new ExceptionTelaPagamento("Pagamento inválido.");
        }
        
        if(tela.getPagamento().equals("Forma de Pagamento")){
            throw new ExceptionTelaPagamento("Selecione uma forma de pagamento.");
        }
    }
}
