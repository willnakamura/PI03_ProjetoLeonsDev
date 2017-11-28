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

    public static void validar(TelaPassageiro telaPass, String opcao) throws ExceptionTelaPassageiro {
        Calendar calendar = Calendar.getInstance();
        int cal = calendar.getTime().getYear();
        int dtNasc = telaPass.getDtNasc().getYear();

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

        //--
        if (telaPass.getSobrenome() == null || "".equals(telaPass.getSobrenome())) {
            throw new ExceptionTelaPassageiro("Favor informar o sobrenome do passageiro.");
        }
        if (telaPass.getSobrenome().length() > 45) {
            throw new ExceptionTelaPassageiro("Sobrenome inválido.");
        }

        //--
        if ("".equals(telaPass.getCpf()) || telaPass.getCpf() == null) {
            throw new ExceptionTelaPassageiro("Favor informar um CPF válido.");
        }
        if (telaPass.getCpf().length() > 11) {
            throw new ExceptionTelaPassageiro("CPF inválido.");
        }

        //--
        if (telaPass.getDtNasc().after(calendar.getTime()) || telaPass.getDtNasc() == null || cal == dtNasc) {
            throw new ExceptionTelaPassageiro("Informe uma data de nascimento válida.");
        }
        
        //--
        if (telaPass.getEmail().length() > 50) {
            throw new ExceptionTelaPassageiro("Email inválido.");
        }

        //--
        if (opcao.equals("0")) {
            if (telaPass.getAssentoIda().equals("Selecione o assento!") || telaPass.getAssentoIda().equals("Selecione o assento da Ida")) {
                throw new ExceptionTelaPassageiro("Selecione um assento de ida");
            }

            if (telaPass.getAssentoVolta().equals("Selecione o assento da Volta")) {
                throw new ExceptionTelaPassageiro("Selecione um assento da volta");
            }

        } else if (opcao.equals("1")) {
            if (telaPass.getAssentoIda().equals("Selecione o assento!") || telaPass.getAssentoIda().equals("Selecione o assento da Ida")) {
                throw new ExceptionTelaPassageiro("Selecione um assento de ida");
            }
        }
    }
}
