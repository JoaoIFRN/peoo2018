/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.peoo.controle;

/**
 *
 * @author joaon
 */
public class IF_IMC {
    public static void main(String[] args) {
        
        boolean teste = false;
        
        if (teste){
            System.out.println("1");
        }
        
        double imc = 26.9;
        if (imc >= 10 && imc <= 15){
            System.out.println("1");
        }
        if (imc >= 15.1 && imc <= 25){
            System.out.println("2");
        }
        
        //OR ||
        
        //!
    }
}
