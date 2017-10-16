package br.senac.tads3.pi3b.leonsdev.aeronave.classes;


import br.senac.tads3.pi3b.leonsdev.aeronave.classes.Aeronave;
import br.senac.tads3.pi3b.leonsdev.exceptions.AeronaveException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rafael Rodrigues
 */
public class ValidadorAeronave {
    public static void Validar (Aeronave aeronave) throws AeronaveException{
        if(aeronave == null){
            throw new AeronaveException("Dados inválidos.");
        }
        
        if(aeronave.getModelo() == null || aeronave.getModelo().equals("")){
            throw new AeronaveException("Favor, informar o modelo da aeronave.");
        }
        
        if(aeronave.getModelo().length() > 45){
            throw new AeronaveException("Dados do modelo são inválidos.");
        }
        
        if(aeronave.getFabricante() == null || aeronave.getFabricante().equals("")){
            throw new AeronaveException("Favor, informar o fabricante da aeronave.");
        }
        
        if(aeronave.getFabricante().length() > 45){
            throw new AeronaveException("Dados do fabricante são inválidos.");
        }
        
        if(aeronave.getTotalAssentos() == null || aeronave.getTotalAssentos().equals("")){
            throw new AeronaveException("Favor, informar o total de assentos que a aeronave possui.");
        }
        
        if(aeronave.getTotalAssentos().toString().length() > 11){
            throw new AeronaveException("Dados do total de assentos que a aeronave possui são inválidos.");
        }
    }
}
