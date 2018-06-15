/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.peoo.poo;

import java.util.Date;

/**
 *
 * @author joaon
 */
public class IngressoDeCinema {
    
    private Date dataDoFilme;
    private float horario;
    private int sala;
    private float valor;

    public IngressoDeCinema(){        
    }
    
    public IngressoDeCinema(Date dataDoFilme, float horario, int sala, float valor) {
        this.dataDoFilme = dataDoFilme;
        this.horario = horario;
        this.sala = sala;
        this.valor = valor;
    }
    
    public double calcularDesconto(Date dataAniversario){
        if (new Date().getYear() - dataAniversario.getYear() <= 12){
            return 0.5;
        }
        return 0.0;
    }
    
    
    
}
