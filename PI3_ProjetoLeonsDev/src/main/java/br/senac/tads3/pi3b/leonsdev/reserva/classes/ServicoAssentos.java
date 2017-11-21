/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.leonsdev.reserva.classes;

import br.senac.tads3.pi3b.leonsdev.DAOs.DaoConsultarAssentos;
import br.senac.tads3.pi3b.leonsdev.exceptions.DataExceptions;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Rafael
 */
public class ServicoAssentos {
    public static ArrayList assentosConsultaDisponiveis (Date dataVoo, int nVoo) throws DataExceptions{
        ArrayList assentos = null;
        
        try {
            assentos = DaoConsultarAssentos.AssentosDisponiveis(dataVoo, nVoo);
        } catch (Exception e) {
            e.getMessage();
        }
        return assentos;
    }
}
