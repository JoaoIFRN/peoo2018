/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.peoo.prova1;

/**
 *
 * @author joaon
 */
public class Q8 {
    public static void main(String[] args) {
        for (int i=1;i<=100;i++){
            if (i % 3 == 0){
                System.out.println(i + " - " + 3);
            }
        }
        
        for (int i=1;i<=100;i++){
            if (i % 5 == 0){
                System.out.println(i + " - " + 5);
            }
        }
        
        for (int i=1;i<=100;i++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println(i + " - " + 3 + " - " + 5);
            }
        }
    }
}
