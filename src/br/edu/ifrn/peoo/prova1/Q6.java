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
public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite x1: ");
        double x1 = scanner.nextDouble(); 
        System.out.print("Digite y1: ");
        double y1 = scanner.nextDouble(); 
        System.out.print("Digite x2: ");
        double x2 = scanner.nextDouble(); 
        System.out.print("Digite y2: ");
        double y2 = scanner.nextDouble(); 
        final double RAIO_TERRA = 6371.01;
        double d = RAIO_TERRA * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
        System.out.println("Distância: " + d);
    }
}
