/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.leonsdev.reserva.classes;

import br.senac.tads3.pi3b.leonsdev.DAOs.DaoAssentos;
import br.senac.tads3.pi3b.leonsdev.exceptions.DataExceptions;
import br.senac.tads3.pi3b.leonsdev.voos.classes.Assento;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Rafael
 */
public class ServicoAssentos {
//    public static ArrayList assentosConsultaDisponiveis (Date dataVoo, int nVoo) throws DataExceptions{
//        ArrayList assentos = null;
//        
//        try {
//            assentos = DaoConsultarAssentos.AssentosDisponiveis(dataVoo, nVoo);
//        } catch (Exception e) {
//            e.getMessage();
//        }
//        return assentos;
//    }
    
    public static ArrayList <Assento> assentosDisponiveis (Date dataVoo, int nVoo) throws DataExceptions{
        ArrayList <Assento> assentos = null;
        
        try {
            assentos = (ArrayList) DaoAssentos.listar(dataVoo, nVoo);
        } catch (Exception e) {
            e.getMessage();
        }
        return assentos;
    }
}
