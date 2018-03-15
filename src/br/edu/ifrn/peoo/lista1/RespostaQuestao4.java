/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.peoo.lista1;

import java.util.Scanner;

/**
 *
 * @author joaon
 */
public class RespostaQuestao4 {
    
    public static void main(String[] args) {
        //Declaração de variáveis
        int a, b, c;        
        //Objeto que permite uso do teclado
        Scanner scanner = new Scanner(System.in);
        //Leitura dos valores
        System.out.print("Valor de A: ");
        a = scanner.nextInt();
        System.out.print("Valor de B: ");
        b = scanner.nextInt();
        System.out.print("Valor de C: ");
        c = scanner.nextInt();        
        //Operações matemáticas do problema
        double r = Math.pow((a + b),2);
        double s = Math.pow((b + c),2);
        double d = (r + s)/2.0;
        System.out.println("Resposta: " + d);
    }
    
}
