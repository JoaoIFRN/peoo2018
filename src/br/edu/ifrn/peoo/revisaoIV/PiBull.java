/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.peoo.revisaoIV;

/**
 *
 * @author joaon
 */
abstract class Animal {
    public abstract void comer();
}

abstract class Cachorro extends Animal {   
    
}

public class PiBull extends Cachorro {

    @Override
    public void comer() {
        System.out.println("Comendo...");
    }
    
    public void serBrabo(){
        System.out.println("Mordendo alguém");
    }

    public static void main(String[] args) {
        Animal animal = new PiBull();
        
        if (animal instanceof PiBull){
            PiBull pibull = (PiBull) animal;
        }
    }
    
    
}
