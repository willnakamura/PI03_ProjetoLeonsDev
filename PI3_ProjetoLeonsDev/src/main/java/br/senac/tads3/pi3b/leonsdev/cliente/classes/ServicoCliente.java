/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.leonsdev.cliente.classes;

import br.senac.tads3.pi3b.leonsdev.DAOs.DaoClientes;
import br.senac.tads3.pi3b.leonsdev.exceptions.ClienteException;
import br.senac.tads3.pi3b.leonsdev.exceptions.DataExceptions;
import java.util.List;

/**
 *
 * @author Rafael Rodrigues
 */
public class ServicoCliente {

    public static void CadastrarCliente(Cliente cli) throws ClienteException, DataExceptions {
        ValidadorCliente.validar(cli);

        try {
            DaoClientes.inserir(cli);
        } catch (Exception e) {
            throw new DataExceptions("Erro na fonte de dados", e);
        }
    }

    public static void atualizarCliente(Cliente cliente) throws ClienteException, DataExceptions {

        ValidadorCliente.validar(cliente);

        try {
            DaoClientes.atualizar(cliente);
        } catch (Exception e) {
            throw new DataExceptions("Erro na fonte de dados", e);
        }
    }

    public static Cliente procurarCliente(String cpf) throws ClienteException, DataExceptions {
        
        try {
            return DaoClientes.procurar(cpf);

        } catch (Exception e) {
            throw new DataExceptions("Erro na fonte de dados", e);
        }
    }

    public static List<Cliente> listarCliente() throws ClienteException, DataExceptions {

        try {
            return DaoClientes.listar();
            
        } catch (Exception e) {
            throw new DataExceptions("Erro na fonte de dados", e);
        }
    }

    public static Cliente obterCliente(Integer id) throws ClienteException, DataExceptions {

        try {
            return DaoClientes.obter(id);
        } catch (Exception e) {
            throw new DataExceptions("Erro na fonte de dados", e);
        }
    }

    public static void excluirCliente(Integer id) throws ClienteException, DataExceptions {

        try {

            DaoClientes.excluir(id);
        } catch (Exception e) {
            throw new DataExceptions("Erro na fonte de dados", e);
        }
    }

}
