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
public class Retangulo extends Forma {
    
    @Override
    public void desenhar(){
        System.out.println("Retângulo desenhando");
    }
    
    public static void main(String [] args){
        Forma [] formas = new Forma[5];
        formas[0] = new Circulo();
        //formas[1] = new Forma();
        formas[2] = new Retangulo();
        formas[3] = new Circulo();
        formas[4] = new Retangulo();
        for (Forma forma : formas){
            forma.desenhar();
        }
    }
    
}
