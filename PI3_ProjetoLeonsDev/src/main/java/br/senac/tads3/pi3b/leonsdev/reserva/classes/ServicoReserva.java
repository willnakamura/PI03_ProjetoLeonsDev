/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.leonsdev.reserva.classes;

import br.senac.tads3.pi3b.leonsdev.DAOs.DaoFazerReserva;
import br.senac.tads3.pi3b.leonsdev.DAOs.DaoReservas;
import br.senac.tads3.pi3b.leonsdev.cliente.classes.Cliente;
import br.senac.tads3.pi3b.leonsdev.exceptions.DataExceptions;
import br.senac.tads3.pi3b.leonsdev.exceptions.ReservaException;
import br.senac.tads3.pi3b.leonsdev.passageiros.classes.Passageiros;
import br.senac.tads3.pi3b.leonsdev.passageiros.classes.PassageirosVoos;
import br.senac.tads3.pi3b.leonsdev.servico.classes.Servico;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rafael Rodrigues
 */
public class ServicoReserva {
    public static void inserirReserva (Reserva reserva) throws DataExceptions, ReservaException {
        
        try{
            ValidadorReservaVoo.validar(reserva);
        }catch(ReservaException e){
            e.printStackTrace();
            System.out.println("Erro. " + e.getMessage());
        }
        
        
        try {
            DaoReservas.inserir(reserva);
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new DataExceptions("Erro na fonte de dados." , ex);
        }
    }
    
    public static void atualizarReserva (Reserva reserva) throws DataExceptions, ReservaException{
        
        try{
            ValidadorReservaVoo.validar(reserva);
        }catch(ReservaException e){
            e.printStackTrace();
            System.out.println("Erro, " + e.getMessage());
        }
        
        try {
            DaoReservas.atualizar(reserva);
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new DataExceptions("Erro na fonte de dados." , ex);
        }
    }
    
    public static void excluirReserva (Integer id) throws DataExceptions, ReservaException{
        try {
            DaoReservas.excluir(id);
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new DataExceptions("Erro na fonte de dados." , ex);
        }
    }
    
    public static List<Reserva> listarReserva (String valor) throws DataExceptions, ReservaException{
        try {
            if(valor.equals("") || valor == null){
                return DaoReservas.listar();
            }else{
                return DaoReservas.procurar(valor);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataExceptions("Erro na fonte de dados", e);
        }
    }
    
    
    public static Reserva obterreserva(Integer id) throws DataExceptions, ReservaException {
        try {
            return DaoReservas.obter(id);
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new DataExceptions("Erro na fonte de dados" , ex);
        }
    }
    
    public static void inserirVenda(Reserva reserva, Passageiros[] passageiro, PassageirosVoos[] pvoos, Servico servico, Cliente cliente) throws SQLException, Exception {
        try {
            DaoFazerReserva.inserirVenda(reserva, passageiro, pvoos, servico, cliente);
        } catch (Exception e) {
            e.getMessage();
            e.printStackTrace();
        }
    }
}
