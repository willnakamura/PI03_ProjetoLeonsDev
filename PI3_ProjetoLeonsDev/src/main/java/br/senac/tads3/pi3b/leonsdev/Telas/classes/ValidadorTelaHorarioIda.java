/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.leonsdev.Telas.classes;

import br.senac.tads3.pi3b.leonsdev.exceptions.ExceptionHorarioIda;

/**
 *
 * @author Nakamura-PC
 */
public class ValidadorTelaHorarioIda {

    public static void validar(TelaHorarioIda telaHorarioIda) throws ExceptionHorarioIda {
        
        if (telaHorarioIda == null) {
            throw new ExceptionHorarioIda("Horário do voo inválido");
        }

        if (telaHorarioIda.getOpcaoVoo() == null || telaHorarioIda.getOpcaoVoo().equals("")) {
            throw new ExceptionHorarioIda("Selecione um horário de voo válido.");
        }
    }
}
