/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.peoo.prova1;

import java.util.Scanner;

/**
 *
 * @author joaon
 */
public class Resposta4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Número: ");
        int numero = scanner.nextInt();
        int cubo = (int) Math.pow(numero, 1.0/3.0);
        if (numero == (int) Math.pow(cubo, 3)){
            System.out.println("É cubo");
        }else{
            System.out.println("Não é cubo");
        }
    }
}
