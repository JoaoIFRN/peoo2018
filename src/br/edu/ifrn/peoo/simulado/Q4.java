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
public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Valor1: ");
        double valor1 = scanner.nextDouble();
        System.out.print("Valor2: ");
        double valor2 = scanner.nextDouble();
        int val1 =  (int) (valor1*100.0);
        int val2 =  (int) (valor2*100.0);
        if (val1 == val2){
            System.out.println("Iguais");
        }else{
            System.out.println("Diferentes");
        }
    }       
}
