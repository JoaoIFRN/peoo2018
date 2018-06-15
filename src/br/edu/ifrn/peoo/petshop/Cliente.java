/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.peoo.petshop;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author joaon
 */
public class Cliente {
    
    //- nome : String
    private String nome;
    private String email;
    private boolean malPagador;
    //private Pet [] pets = new Pet[3];
    //private Pet pets [] = new Pet[3];
    private List<Pet> pets = new ArrayList();
         
    public void adicionarPet(Pet pet){
        pets.add(pet);
    }
    
    public void removerPet(Pet pet){
        pets.remove(pet);
    }
    
    public int getNumeroPets(){
        return pets.size();
    }
    
    public void imprimirListaPets(){
        for (Pet pet : pets){
            System.out.println(pet);
        }
    }
    
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
    
    /*
    public int getNumeroPets(){
        int contador = 0;
        for (int i = 0; i < pets.length;i++){
            if (pets[i] != null){
                contador++;
            }
        }
        return contador;
    }
    */
    
}
