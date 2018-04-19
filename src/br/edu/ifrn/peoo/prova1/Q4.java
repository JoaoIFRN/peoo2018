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
public class Q4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número: ");
        int numero = scanner.nextInt();        
        int raizCubica = (int) Math.pow(numero,1.0/3.0);
        if ((int) Math.pow(raizCubica, 3.0) == numero){
            System.out.println("É Cubo");
        }else{
            System.out.println("Não é Cubo");
        }
    }
}
