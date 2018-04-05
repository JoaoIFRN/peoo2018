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
public class MaisFor {
    
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            System.out.println(i);        
        }
        
        int j = 0;
        while (j < 100){
            System.out.println("J = " + j);
            int i = 100;
            while (i < 200){
                System.out.println("I = " + i);
                i++;
            }
            j++;
        }
        
        
    }
    
}
