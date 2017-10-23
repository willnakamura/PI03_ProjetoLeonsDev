/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.leonsdev.login.classes;

import br.senac.tads3.pi3b.leonsdev.DAOs.DaoLogin;
import br.senac.tads3.pi3b.leonsdev.exceptions.DataExceptions;
import br.senac.tads3.pi3b.leonsdev.exceptions.LoginException;

/**
 *
 * @author Rafael Rodrigues
 */
public class ServicoLogin {

    public static void autenticacao(Login login) throws DataExceptions, LoginException {

        ValidadorLogin.Validar(login);

        try {
            DaoLogin.Autenticacao(login);
            SingletonLogin.getInstance().setLogin(login.getUserName());

        } catch (Exception e) {
            e.printStackTrace();
            throw new DataExceptions("Erro na fonte de dados", e);
        }
    }
}
