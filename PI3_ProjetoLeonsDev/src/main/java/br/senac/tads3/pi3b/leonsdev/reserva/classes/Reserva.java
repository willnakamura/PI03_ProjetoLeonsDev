/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.leonsdev.reserva.classes;

import br.senac.tads3.pi3b.leonsdev.cliente.classes.Cliente;
import br.senac.tads3.pi3b.leonsdev.usuario.classes.Usuario;
import java.util.Date;

/**
 *
 * @author Nakamura-PC
 */
public class Reserva {

    private Integer idReserva;
    private String ticket;

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    private Date dataReserva;
    private String status, formaPgto, vendedor;
    private Cliente cliente;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }
    //Duvida sobre usuário na classe reserva.
    private Usuario usuario;
    private Double custoTotal;
    private Integer idCliente;
    private Boolean Ativo;

    public Boolean getAtivo() {
        return Ativo;
    }

    public void setAtivo(Boolean Ativo) {
        this.Ativo = Ativo;
    }

    public Reserva(Integer idReserva, Date dataReserva, String status, String formaPgto, Usuario usuario, Double custoTotal) {
        this.idReserva = idReserva;
        this.dataReserva = dataReserva;
        this.status = status;
        this.formaPgto = formaPgto;
        this.usuario = usuario;
        this.custoTotal = custoTotal;
    }

    public Reserva(Date dataReserva, String status,
            String formaPgto, Usuario usuario, Double custoTotal, Integer idCliente) {
        this.dataReserva = dataReserva;
        this.status = status;
        this.formaPgto = formaPgto;
        this.usuario = usuario;
        this.custoTotal = custoTotal;
        this.idCliente = idCliente;
    }

    public Reserva (){
        
    }

    public void setIdReserva(Integer idReserva) {
        this.idReserva = idReserva;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }
    public Integer getIdReserva() {
        return idReserva;
    }

    public Date getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(Date dataReserva) {
        this.dataReserva = dataReserva;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFormaPgto() {
        return formaPgto;
    }

    public void setFormaPgto(String formaPgto) {
        this.formaPgto = formaPgto;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Double getCustoTotal() {
        return custoTotal;
    }

    public void setCustoTotal(Double custoTotal) {
        this.custoTotal = custoTotal;
    }
}
