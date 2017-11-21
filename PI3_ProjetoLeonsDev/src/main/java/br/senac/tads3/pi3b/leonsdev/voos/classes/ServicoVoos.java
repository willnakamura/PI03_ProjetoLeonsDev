/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.leonsdev.voos.classes;

import br.senac.tads3.pi3b.leonsdev.DAOs.DaoVoos;
import br.senac.tads3.pi3b.leonsdev.exceptions.DataExceptions;
import java.util.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rafael Rodrigues
 */
public class ServicoVoos {

    public static ArrayList<Voos> buscarVooEspecial(Date dataVoo, String aeroportoPartida, String aeroportoChegada) throws DataExceptions, SQLException {
        ArrayList<Voos> voos = null;

        java.util.Date dataUtil2 = new java.util.Date();
        dataUtil2 = dataVoo;
        java.sql.Date dataSql2 = new java.sql.Date(dataUtil2.getTime());
        try {
            voos = DaoVoos.buscarVooEspecial(dataSql2, aeroportoPartida, aeroportoChegada);
        } catch (Exception e) {
            e.getMessage();
        }
        return voos;
    }

    public static Voos obterVoo(Integer id) throws DataExceptions {
        Voos voo = new Voos();
        try {
            voo = DaoVoos.obter(id);
        } catch (Exception e) {
            e.getMessage();
        }
        return voo;
    }
}
