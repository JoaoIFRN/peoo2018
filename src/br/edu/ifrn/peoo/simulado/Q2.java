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
public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Número de elementos: ");
        int numElementos = scanner.nextInt();
        for (int i=0;i<numElementos;i++){
            for (int j=1;j<=i+1;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
