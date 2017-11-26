/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.leonsdev.cliente.classes;

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
        if (cliente.getNome().length() > 45) {
            throw new ClienteException("Nome inválido.");
        }
        
        //sobrenome
        if (cliente.getSobrenome()== null || "".equals(cliente.getSobrenome())) {
            throw new ClienteException("Favor informar o sobrenome do cliente.");
        }
        if (cliente.getSobrenome().length() > 45) {
            throw new ClienteException("Sobrenome inválido.");
        }
        
        // Genero
        if (cliente.getGenero().equals("Selecione")) {
            throw new ClienteException("Favor selecione o sexo do cliente.");
        }
        
        //Data Nasc.
        if (cliente.getDataNascimento() == null || cliente.getDataNascimento().after(calendario.getTime())) {
            throw new ClienteException("Favor informar uma data válida.");
        }

        //CPF
        if ("".equals(cliente.getCpf()) || cliente.getCpf() == null) {
            throw new ClienteException("Favor informar um CPF válido.");
        }
        if(cliente.getCpf().length() > 11){
            throw new ClienteException("CPF inválido.");
        }

        // Endereço
        if (cliente.getEndereco() == null || "".equals(cliente.getEndereco())) {
            throw new ClienteException("Favor informar o endereço do cliente.");
        }
        if (cliente.getEndereco().length() > 50) {
            throw new ClienteException("Endereço inválido.");
        }
        
        //Estado
        if(cliente.getEstado().equals("Selecione")){
            throw new ClienteException("Favor informe um estado válido.");
        }
        
        //Cidade
        if(cliente.getCidade() == null || cliente.equals("")){
            throw new ClienteException("Favor informe uma cidade válida.");
        }
        if(cliente.getCidade().length() > 25){
            throw new ClienteException("Cidade inválida.");
        }
        
        //CEP
        if(cliente.getCep() == null || cliente.getCep().equals("")){
            throw new ClienteException("Favor informe um CEP válido.");
        }
        if(cliente.getCep().toString().length() > 15){
            throw new ClienteException("CEP inválido.");
        }

        // Telefone
        if (cliente.getCelular()== null || "".equals(cliente.getCelular())) {
            throw new ClienteException("Favor informar um telefone válido.");
        }
        if(cliente.getCelular().length() > 15){
            throw new ClienteException("O número informado é inválido.");
        }

        //Email
        if (cliente.getEmail().length() > 50) {
            throw new ClienteException("Email inválido.");
        }

    }
}
