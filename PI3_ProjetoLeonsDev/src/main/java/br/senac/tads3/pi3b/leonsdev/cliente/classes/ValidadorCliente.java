/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.leonsdev.cliente.classes;

import br.senac.tads3.pi3b.leonsdev.cliente.classes.Cliente;
import br.senac.tads3.pi3b.leonsdev.exceptions.ClienteException;

import java.util.Calendar;

/**
 *
 * @author Nakamura-PC
 */
public class ValidadorCliente {

    public static void validar(Cliente cliente) throws ClienteException {
        Calendar calendario = Calendar.getInstance();

        //Realização das validações.
        if (cliente == null) {
            throw new ClienteException("Favor informar um cliente.");
        }

        //Nome
        if (cliente.getNome() == null || "".equals(cliente.getNome())) {
            throw new ClienteException("Favor informar o nome do cliente.");
        }
        if (cliente.getNome().length() > 100) {
            throw new ClienteException("Nome inválido.");
        }

        // Genero
        if (cliente.getGenero().equals("Selecione")) {
            throw new ClienteException("Favor selecione o sexo do cliente.");
        }

        //Data Nasc.
        if (cliente.getDataNascimento() == null || calendario.before(cliente.getDataNascimento())) {
            throw new ClienteException("Favor informar uma data válida.");
        }

        //CPF
        if ("".equals(cliente.getCpf()) || cliente.getCpf() == null) {
            throw new ClienteException("Favor informar um CPF válido.");
        }

        // Endereço
        if (cliente.getEndereco() == null || "".equals(cliente.getEndereco())) {
            throw new ClienteException("Favor informar o endereço do cliente.");
        }
        if (cliente.getEndereco().length() > 100) {
            throw new ClienteException("Endereço inválido.");
        }

        // Telefone
        if (cliente.getTelefone() == null || "".equals(cliente.getTelefone())) {
            throw new ClienteException("Favor informar um telefone válido.");
        }

        //Email
        if (cliente.getEmail().length() > 50) {
            throw new ClienteException("Email inválido.");
        }
    }
}
