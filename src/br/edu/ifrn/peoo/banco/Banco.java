/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.peoo.banco;

import java.util.ArrayList;

/**
 *
 * @author joaon
 */
public class Banco {
    
    private String nome;
    private int numero;
    private ArrayList<Agencia> agencias = new ArrayList();

    public Banco(int numero){
        this.numero = numero;
    }
    
    public void adicionaAgencia(Agencia agencia){
        this.agencias.add(agencia);
    }
    
    public Agencia buscarAgencia(int numero){
        for (Agencia agencia : agencias){
            if (agencia.getNumero() == numero){
                return agencia;
            }
        }
        return null;
    }
    
    public ArrayList<Agencia> getAgencias() {
        return agencias;
    }

    public void setAgencias(ArrayList<Agencia> agencias) {
        this.agencias = agencias;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }        
    
}
