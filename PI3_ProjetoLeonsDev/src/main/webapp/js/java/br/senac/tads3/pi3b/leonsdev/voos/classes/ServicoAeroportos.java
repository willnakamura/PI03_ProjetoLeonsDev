/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.leonsdev.voos.classes;

import br.senac.tads3.pi3b.leonsdev.DAOs.DaoOrigensDestinos;
import br.senac.tads3.pi3b.leonsdev.exceptions.DataExceptions;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Rafael
 */
public class ServicoAeroportos {
    
    public static ArrayList obterAeroporto() throws DataExceptions, SQLException {

        try {
            return DaoOrigensDestinos.OrigensDestinos();
        } catch (Exception e) {
            throw new DataExceptions("Erro na fonte de dados", e);
        }
    }
}
