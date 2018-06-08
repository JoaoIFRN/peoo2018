/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.peoo.petshop;

import br.edu.ifrn.peoo.poo.VariaveisInstancia;

/**
 *
 * @author joaon
 */
public class Cliente {
    
    //- nome : String
    private String nome;
    private String email;
    private boolean malPagador;
       
    public Cliente(){
        this.nome = "Nome indefinido";
        this.email = "Email indefinido";
        this.malPagador = false;
    }
    
    public Cliente(String nome){
        this.nome = nome;
        this.email = "Email indefinido";
        this.malPagador = false;
    }
    
    public Cliente(String nome, String email){
        this.nome = nome;
        this.email = email;        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isMalPagador() {
        return malPagador;
    }

    public void setMalPagador(boolean malPagador) {
        this.malPagador = malPagador;
    }
    
    
    
}
