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
        
        if(telaVoo.getOpcaoIdaVolta().equals(0)){
            if(telaVoo.getDataIda().before(calendar.getTime()) || telaVoo.getDataIda() == null){
                throw new ExceptionTelaVoo("Informe uma data de ida Válida.");
            }else if(telaVoo.getDataVolta().before(calendar.getTime()) || telaVoo.getDataVolta() == null){
                throw new ExceptionTelaVoo("Informe uma data de volta Válida.");
            }
        }else if(telaVoo.getOpcaoIdaVolta().equals(1)){
             if(telaVoo.getDataIda().before(calendar.getTime()) || telaVoo.getDataIda() == null){
                throw new ExceptionTelaVoo("Informe uma data de ida Válida.");
            }
        }
        
        if(telaVoo.getQtdPass().equals("Quantidade de Passageiros")){
            throw new ExceptionTelaVoo("Selecione a quantidade de passageiros para este voo.");
        }
    }
}
