/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.leonsdev.usuario.classes;

import br.senac.tads3.pi3b.leonsdev.DAOs.DaoUsuarios;
import br.senac.tads3.pi3b.leonsdev.exceptions.DataExceptions;
import br.senac.tads3.pi3b.leonsdev.exceptions.ExceptionUsuario;
import java.util.List;

/**
 *
 * @author Rafael Rodrigues
 */
public class ServicoUsuario {

    public static void CadastrarUsuario(Usuario usuario) throws DataExceptions, ExceptionUsuario {
        ValidadorUsuario.Validar(usuario);

        try {
            DaoUsuarios.inserir(usuario);
        } catch (Exception e) {
            throw new DataExceptions("Erro na fonte de dados.", e);
        }
    }

    public static void AtualizarUsuario(Usuario usuario) throws DataExceptions, ExceptionUsuario {
        ValidadorUsuario.Validar(usuario);

        try {
            DaoUsuarios.atualizar(usuario);
        } catch (Exception e) {
            throw new DataExceptions("Erro na fonte de dados.", e);
        }
    }

    public static void ExcluirUsuario(Integer id) throws DataExceptions, ExceptionUsuario {
        try {
            DaoUsuarios.excluir(id);
        } catch (Exception e) {
            throw new DataExceptions("Erro na fonte de dados.", e);
        }
    }

    
    public static Usuario Procurar(String valor) throws DataExceptions, ExceptionUsuario {
        try {
            return DaoUsuarios.procurar(valor);
        } catch (Exception e) {
            throw new DataExceptions("Erro na fonte de dados.", e);
        }
    }
    

    public static List<Usuario> listar() throws DataExceptions, ExceptionUsuario {
        try {
            return DaoUsuarios.listar();
        } catch (Exception e) {
            throw new DataExceptions("Erro na fonte de dados.", e);
        }
    }

    public static Usuario ObterUsuario(Integer id) throws DataExceptions, ExceptionUsuario {
        try {
            return DaoUsuarios.obter(id);
        } catch (Exception e) {
            throw new DataExceptions("Erro na fonte de dados.", e);
        }
    }
}
