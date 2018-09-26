/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.peoo.revisao.bimestre3.lista2;

/**
 *
 * @author joaon
 */
public class CD extends Midia {
    
    private String gravadora;

    public String getGravadora() {
        return gravadora;
    }

    public void setGravadora(String gravadora) {
        this.gravadora = gravadora;
    }

    @Override
    public String toString() {
        return super.toString() +  " - CD{" + "gravadora=" + gravadora + '}';
    }
    
    
    
}
