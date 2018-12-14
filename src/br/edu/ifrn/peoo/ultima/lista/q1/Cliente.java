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
public class Cliente implements Serializable {
    
    private String nome;
    private String numeroTelefone;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public Cliente() {
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the numeroTelefone
     */
    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    /**
     * @param numeroTelefone the numeroTelefone to set
     */
    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", numeroTelefone=" + numeroTelefone + '}';
    }
    
    
    
}
