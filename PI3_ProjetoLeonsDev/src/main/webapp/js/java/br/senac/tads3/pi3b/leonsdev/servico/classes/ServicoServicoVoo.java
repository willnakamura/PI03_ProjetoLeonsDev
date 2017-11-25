/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.leonsdev.servico.classes;

import br.senac.tads3.pi3b.leonsdev.DAOs.DaoServicos;
import br.senac.tads3.pi3b.leonsdev.exceptions.DataExceptions;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Rafael
 */
public class ServicoServicoVoo {
    
        public static List<Servico> listarServicos() throws SQLException, DataExceptions {

        try {
            return DaoServicos.listar();
            
        } catch (Exception e) {
            throw new DataExceptions("Erro na fonte de dados", e);
        }
    }
    
}
