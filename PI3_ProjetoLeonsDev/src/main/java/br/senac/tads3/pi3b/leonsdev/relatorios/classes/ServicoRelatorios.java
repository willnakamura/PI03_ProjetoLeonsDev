/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.leonsdev.relatorios.classes;

import br.senac.tads3.pi3b.leonsdev.DAOs.DaoAeronaves;
import br.senac.tads3.pi3b.leonsdev.DAOs.DaoRelatorios;
import br.senac.tads3.pi3b.leonsdev.exceptions.DataExceptions;
import br.senac.tads3.pi3b.leonsdev.exceptions.RelatorioException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Rafael
 */
public class ServicoRelatorios {
    public static List <RelatorioClientes> listarClientes (Date dataInicio, Date dataFim)
            throws SQLException, DataExceptions, RelatorioException, Exception{
        List<RelatorioClientes> listaCliRelatorio = null;
        try {
            listaCliRelatorio = DaoRelatorios.listarClientes(dataInicio, dataFim);
        } catch (RelatorioException | DataExceptions |SQLException e) {
            e.getMessage();
        }
        return listaCliRelatorio;
    }
    
    public static List <RelatorioReservas> listarVendas (Date dataInicio, Date dataFim)
            throws SQLException, DataExceptions, RelatorioException, Exception{
        List<RelatorioReservas> listaReservasRelatorio = null;
        try {
            listaReservasRelatorio = DaoRelatorios.listarVendas(dataInicio, dataFim);
        } catch (RelatorioException | DataExceptions |SQLException e) {
            e.getMessage();
        }
        return listaReservasRelatorio;
    }
}
