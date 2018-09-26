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
    private long numeroPlaca;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + (int) (this.numeroPlaca ^ (this.numeroPlaca >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Carro other = (Carro) obj;
        if (this.numeroPlaca != other.numeroPlaca) {
            return false;
        }
        return true;
    }
    
    
    
    public void buzinar(){
        System.out.println("bi bi bi");
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void parar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void acelerar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

}
