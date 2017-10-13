/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.leonsdev.voos.classes;

import br.senac.tads3.pi3b.leonsdev.exceptions.VoosException;
import java.util.Calendar;

/**
 *
 * @author Rafael Rodrigues
 */
public class ValidadorVoos {
    public void Validar (Voos voo) throws VoosException{
        
        Calendar calendario = Calendar.getInstance();
        
        if(voo == null){
            throw new VoosException("Dados inválidos.");
        }
        
        if(voo.getDataVoo() == null || calendario.before(voo.getDataVoo())){
            throw new VoosException("Data inválida.");
        }
        
        if(voo.getNrVoo().equals("") || voo.getNrVoo() == null){
            throw new VoosException("O voo informado não existe ou não é válido.");
        }
        
        if(voo.getNrVoo().toString().length() > 11){
            throw new VoosException("Número do voo é inválido.");
        }
        
        if(voo.getAeroportoChegada().equals("Selecione")){
            throw new VoosException("Favor, selecione um aeroporto de Partida.");
        }
        
        if(voo.getAeroportoChegada().equals("Selecione")){
            throw new VoosException("Favor, selecione um aeroporto de chegada.");
        }
        
        if(voo.getOperadora().equals("Selecione")){
            throw new VoosException("Selecione uma operadora para o voo.");
        }
        
        
    } 
}
