/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.leonsdev.exceptions;

/**
 *
 * @author Rafael Rodrigues
 */
public class DataExceptions extends Exception {

    public DataExceptions(String message) {
        super(message);
    }

    public DataExceptions(String message, Throwable cause) {
        super(message, cause);
    }

    public DataExceptions(Throwable cause) {
        super(cause);
    }
}
