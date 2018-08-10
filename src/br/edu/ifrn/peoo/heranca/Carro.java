/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.peoo.heranca;

/**
 *
 * @author joaon
 */
public class Carro extends Terrestre {
    
    private String modelo;
    
    public void buzinar(){
        System.out.println("bi bi bi");
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}
