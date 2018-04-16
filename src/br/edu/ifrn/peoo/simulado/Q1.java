/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.peoo.simulado;

import java.util.Scanner;



/**
 *
 * @author joaon
 */
public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int soma = 0;
        int valor = 0;
        for (int i=0;i<5;i++){
            System.out.print("Valor " + (i+1) + ": ");
            valor = scanner.nextInt();
            soma = soma + valor;
        }        
        double media = soma/5.0;
        
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
    }
 
}
