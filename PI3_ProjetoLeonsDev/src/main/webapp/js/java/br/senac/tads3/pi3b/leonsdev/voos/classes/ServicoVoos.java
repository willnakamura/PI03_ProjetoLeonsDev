/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.leonsdev.voos.classes;

import br.senac.tads3.pi3b.leonsdev.DAOs.DaoVoos;
import br.senac.tads3.pi3b.leonsdev.exceptions.DataExceptions;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Rafael Rodrigues
 */
public class ServicoVoos {
    public static List<Voos> buscarVooEspecial(Date dataVoo, String aeroportoPartida, String aeroportoChegada) throws DataExceptions, SQLException{
        List<Voos> voos = null; 
        try {
            voos = DaoVoos.buscarVooEspecial(dataVoo, aeroportoPartida, aeroportoChegada);
        } catch (Exception e) {
            e.getMessage();
        }
        return voos;
    }
}
