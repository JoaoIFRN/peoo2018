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
public class Q3 {
    public static void main(String[] args) {
        int primeiro = 0;
        int segundo = 1;
        System.out.print(primeiro + ", " + segundo + ", ");
        for (int i=0;i<13;i++){
            int novoNumero = 2*segundo + primeiro;
            System.out.print(novoNumero + ", ");
            primeiro = segundo;
            segundo = novoNumero;
        }
        System.out.println();
    }
}
