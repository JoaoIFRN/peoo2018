/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.peoo.prova1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author joaon
 */
public class CorrecaoProva {
    public static void main(String[] args) {
int linhas, limite = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de linhas: ");
        linhas = scanner.nextInt();
        for (int i = 1; i <= linhas; i++) {
            for (int j = 1; j <= i; j++) {
                limite = limite + 1;
                System.out.print(limite);
            }
            System.out.println();
        }
    }
    
}
