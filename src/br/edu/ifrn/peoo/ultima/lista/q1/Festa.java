/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.peoo.ultima.lista.q1;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author joaon
 */
public class Festa implements Serializable {
    
    private Tema tema;
    private String data;
    private String horaIncicio;
    private String horaFim;
    private double valor;
    private Cliente cliente;
    

    /**
     * @return the tema
     */
    public Tema getTema() {
        return tema;
    }

    /**
     * @param tema the tema to set
     */
    public void setTema(Tema tema) {
        this.tema = tema;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @return the horaIncicio
     */
    public String getHoraIncicio() {
        return horaIncicio;
    }

    /**
     * @param horaIncicio the horaIncicio to set
     */
    public void setHoraIncicio(String horaIncicio) {
        this.horaIncicio = horaIncicio;
    }

    /**
     * @return the horaFim
     */
    public String getHoraFim() {
        return horaFim;
    }

    /**
     * @param horaFim the horaFim to set
     */
    public void setHoraFim(String horaFim) {
        this.horaFim = horaFim;
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
    
    
}
