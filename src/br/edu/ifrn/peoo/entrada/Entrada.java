/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.peoo.entrada;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author joaon
 */
public class Entrada {

    public static void main(String[] args) {
        int valorInt;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um valor inteiro: ");
        valorInt = entrada.nextInt();
        System.out.println(valorInt);
        String valorString;
        valorString = JOptionPane.showInputDialog("Inteiro: ");

    }

}
