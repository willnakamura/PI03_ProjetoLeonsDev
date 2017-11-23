/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.leonsdev.Telas.classes;

import br.senac.tads3.pi3b.leonsdev.exceptions.ExceptionTelaVoo;
import java.util.Calendar;

/**
 *
 * @author Rafael
 */
public class ValidadorTelaVoo {
    public static void validar (TelaVoo telaVoo) throws ExceptionTelaVoo{
        Calendar calendar = Calendar.getInstance();
        
        if(telaVoo == null){
            throw new ExceptionTelaVoo("Voo inválido");
        }
        
        if(telaVoo.getAeroportoOrigem().equals("Selecione o aeroporto de origem")){
            throw new ExceptionTelaVoo("Selecione um Aeroporto de origem válido.");
        }
        
        if(telaVoo.getAeroportoDestino().equals("Selecione o aeroporto de destino")){
            throw new ExceptionTelaVoo("Selecione um Aeroporto de destino válido.");
        }
        
        if(telaVoo.getOpcaoIdaVolta() == null || telaVoo.getOpcaoIdaVolta().equals("")){
            throw new ExceptionTelaVoo("Selecione a opção ida ou ida e volta.");
        }
        
        if(telaVoo.getOpcaoIdaVolta())
    }
}
