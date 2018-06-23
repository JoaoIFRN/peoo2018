/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.peoo.teste2unidade;

import java.util.ArrayList;

/**
 *
 * @author joaon
 */
public class Operadora {
    
    private int id;
    private ArrayList<Voo> voos = new ArrayList();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Voo> getVoos() {
        return voos;
    }

    public void setVoos(ArrayList<Voo> voos) {
        this.voos = voos;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + this.id;
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
        final Operadora other = (Operadora) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Operadora{" + "id=" + id + ", voos=" + voos + '}';
    }        
    
}
