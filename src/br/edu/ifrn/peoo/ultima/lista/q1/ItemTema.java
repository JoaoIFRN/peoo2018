/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.peoo.ultima.lista.q1;

import java.io.Serializable;

/**
 *
 * @author joaon
 */
public class ItemTema implements Serializable {
    
    private String nome;

    public ItemTema(){
        
    }
    
    public ItemTema(String nome) {
        this.nome = nome;
    }        

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
        
}
