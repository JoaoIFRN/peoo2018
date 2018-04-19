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
public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de linhas: ");
        int numeroLinhas = scanner.nextInt();
        int numero = 1;
        for (int i=numeroLinhas;i>0;i--){
            for (int j=0;j<numeroLinhas-i;j++){
                System.out.print(" ");
            }
            for (int j=0;j<i;j++){
                System.out.print("*");                
            }
            System.out.println();
        }
    }
}
