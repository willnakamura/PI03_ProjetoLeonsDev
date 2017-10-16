/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.leonsdev.reserva.classes;

import br.senac.tads3.pi3b.leonsdev.exceptions.ReservaException;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Nakamura-PC
 */
public class ValidadorReserva {

    public static void validar(Reserva reserva) throws ReservaException {

        if (reserva == null) {
            throw new ReservaException("Reserva inválida");
        }

        //Obtém a data atual em 00:00:00 (evita conflitos com horário)
        Calendar calendar = Calendar.getInstance();
        Date hoje = calendar.getTime();
        if (reserva.getDataReserva().after(hoje)) {
            throw new ReservaException("A data da reserva é menor que a data de hoje.");
        }
        if (reserva.getFormaPgto().equals("Selecione")) {
            throw new ReservaException("É necessário informar o modo de pagamento.");
        }
    }
}
