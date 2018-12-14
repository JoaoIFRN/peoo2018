/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.peoo.ultima.lista.q1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author joaon
 */
public class Tema implements Serializable {
    
    private String nome;
    private List<ItemTema> itens = new ArrayList();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the itens
     */
    public List<ItemTema> getItens() {
        return itens;
    }

    /**
     * @param itens the itens to set
     */
    public void setItens(List<ItemTema> itens) {
        this.itens = itens;
    }
    
    
}
