/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.peoo.poo;

/**
 *
 * @author joaon
 */
public class Cliente {
    
    private String nome;
    private String email;
    public AnimalEstimacao [] animais = new AnimalEstimacao[3];
    
    public int getNumeroAnimais(){
        int contadorAnimais = 0;
        for (int i = 0; i < animais.length; i++){
            if (animais[i] != null){
                contadorAnimais++;
            }
        }
        return contadorAnimais;
    }
        
    public Cliente(){
        System.out.println("Construtor foi chamado");
    }
    
    public Cliente(String nome){
        System.out.println("Construtor II foi chamado");
        this.nome = nome;
    }    
            
    public String getNome(){
        return this.nome;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    
}
