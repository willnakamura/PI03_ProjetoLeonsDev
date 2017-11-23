/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.leonsdev.Telas.classes;

import br.senac.tads3.pi3b.leonsdev.exceptions.ExceptionTelaPassageiro;
import java.util.Calendar;

/**
 *
 * @author Nakamura-PC
 */
public class ValidadorTelaPassageiro {

    public static void validar(TelaPassageiro telaPass) throws ExceptionTelaPassageiro {
        Calendar calendar = Calendar.getInstance();

        if (telaPass == null) {
            throw new ExceptionTelaPassageiro("Passageiro inválido");
        }
        
        //--
        if (telaPass.getNome() == null || "".equals(telaPass.getNome())) {
            throw new ExceptionTelaPassageiro("Favor informar o nome do passageiro.");
        }
        if (telaPass.getNome().length() > 45) {
            throw new ExceptionTelaPassageiro("Nome inválido.");
        }
        
        //---
        if (telaPass.getSobrenome() == null || "".equals(telaPass.getSobrenome())) {
            throw new ExceptionTelaPassageiro("Favor informar o sobrenome do passageiro.");
        }
        if (telaPass.getSobrenome().length() > 45) {
            throw new ExceptionTelaPassageiro("Sobrenome inválido.");
        }
    }
}
