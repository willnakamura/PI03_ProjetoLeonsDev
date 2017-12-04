/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.leonsdev.reserva.classes;

import br.senac.tads3.pi3b.leonsdev.DAOs.DaoConsultarReservas;
import br.senac.tads3.pi3b.leonsdev.exceptions.DataExceptions;
import java.util.List;

/**
 *
 * @author Rafael
 */
public class ServicoConsultaCancelaReserva {
     public static List<ReservaConsultar> consultaReserva (String ticket) throws DataExceptions, Exception{
        List<ReservaConsultar> consulta = null;
        try {
            consulta = DaoConsultarReservas.procurarReserva(ticket);
        } catch (Exception e) {
            e.getMessage();
        }
        
        return consulta;
    }
    
    public static void DeletarReserva (int id) throws DataExceptions, Exception{
        try {
            DaoConsultarReservas.deletarReserva(id);
        } catch (Exception e) {
            e.getMessage();
        }
    } 
}
