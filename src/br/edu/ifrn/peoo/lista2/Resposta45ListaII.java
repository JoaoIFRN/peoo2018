/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.peoo.lista2;

import javax.swing.JOptionPane;

/**
 *
 * @author joaon
 */
public class Resposta45ListaII {
    public static void main(String[] args) {
        int numero = 0;
        numero = 
        Integer.parseInt(JOptionPane.showInputDialog("N: "));
        for (int i=1;i<=numero;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
