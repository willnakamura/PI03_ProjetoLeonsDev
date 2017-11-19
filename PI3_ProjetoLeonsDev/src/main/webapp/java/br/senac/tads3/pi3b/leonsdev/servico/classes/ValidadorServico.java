/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.leonsdev.servico.classes;

import br.senac.tads3.pi3b.leonsdev.exceptions.ServicoException;

/**
 *
 * @author Nakamura-PC
 */
public class ValidadorServico {

    public static void validar(Servico servico) throws ServicoException {

        String extraBag = servico.getExtraBag();
        
        if (servico == null) {
            throw new ServicoException("Reserva inválida");
        }
        
        if(extraBag == null){
            throw new ServicoException("Favor selecione um serviço");
        }
    }
}
