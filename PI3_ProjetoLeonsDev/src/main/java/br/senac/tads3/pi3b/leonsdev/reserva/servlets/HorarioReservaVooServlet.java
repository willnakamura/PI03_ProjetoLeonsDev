/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.leonsdev.reserva.servlets;

import br.senac.tads3.pi3b.leonsdev.voos.classes.Voos;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Rafael
 */
@WebServlet(name = "HorarioReservaVooServlet", urlPatterns = {"/HorarioReservaVoo"})
public class HorarioReservaVooServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    //--------------------------------------------------------------------------
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession sessao = request.getSession();
        
        if((int)request.getAttribute("opcaoIdaOuIdaVolta") == 0){
                        
        }
    }
}
