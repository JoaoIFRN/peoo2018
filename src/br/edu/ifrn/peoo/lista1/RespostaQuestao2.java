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
public class RespostaQuestao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double raio, circunferencia;
        System.out.print("Digite o raio: ");
        raio = scanner.nextDouble();
        circunferencia = 2.0 * Math.PI * raio;
        System.out.printf("%.2f\n", circunferencia);
        System.out.println("Circunferência: " + 
                circunferencia);
    }
}
