/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.leonsdev.passageiros.classes;

import br.senac.tads3.pi3b.leonsdev.DAOs.DaoPassageiros;
import br.senac.tads3.pi3b.leonsdev.exceptions.DataExceptions;
import br.senac.tads3.pi3b.leonsdev.exceptions.PassageirosException;
import java.sql.SQLException;

/**
 *
 * @author Rafael
 */
public class ServicoPassageiro {

    public static void inserir(Passageiros passageiro) throws DataExceptions, PassageirosException {
        ValidadorPassageiros.Validar(passageiro);

        try {
            DaoPassageiros.inserir(passageiro);
        } catch (DataExceptions | PassageirosException e) {
            e.getMessage();
        } catch (Exception ex) {
            ex.getMessage();
        }
    }

    public static void atualizar(Passageiros passageiro) throws DataExceptions, PassageirosException {
        ValidadorPassageiros.Validar(passageiro);

        try {
            DaoPassageiros.atualizar(passageiro);
        } catch (DataExceptions | PassageirosException e) {
            e.getMessage();
        } catch (Exception ex) {
            ex.getMessage();
        }
    }
    
    public static void excluir (Integer id) throws DataExceptions, PassageirosException{
        try {
            DaoPassageiros.excluir(id);
        } catch (Exception e) {
            e.getMessage();
        }
    }
    
    public static void buscar (String valor) throws DataExceptions, PassageirosException{
        try {
            if(valor == null || valor.trim().equals("")){
                DaoPassageiros.listar();
            }else{
                DaoPassageiros.procurar(valor);
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }
    
    public static void obter (Integer id) throws DataExceptions, PassageirosException {
        try {
            DaoPassageiros.obter(id);
        } catch (Exception e) {
            e.getMessage();
        }
    }
        
    
}
