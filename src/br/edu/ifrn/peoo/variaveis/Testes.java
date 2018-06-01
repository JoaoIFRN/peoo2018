/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.peoo.variaveis;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author joaon
 */
public class Testes {

    public static void main(String[] args) {
        int numero = 0;
        char caractere = (char) numero;
        while (numero <= 177){
            System.out.print(caractere);
            System.out.println();
            caractere = (char) (caractere + 1);
            numero = numero +1;
        }
    }

}
