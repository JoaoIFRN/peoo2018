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
public class MaisExemplosFor {
    public static void main(String[] args) {
        //Curiosidade
        /*
        double valorA = 2.0;
        System.out.println(valorA);
        double valorB = 2.0;
        System.out.println(valorB);
        if (valorA == valorB){
            System.out.println("São iguais");
        }else{
            System.out.println("São diferentes");
        }
        */
        
        //0 - 100
        for (int i=0;i<=100;i++){ //01234567891112...19
            if (i == 10)
                continue;
            if (i == 20)
                break;
            System.out.println(i);            
        }
                
        for (int i=0;i<101;i++){
            System.out.println(i);
        }
    }
}
