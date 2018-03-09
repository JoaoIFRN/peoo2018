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
public class RespostaQuestao1 {
    public static void main(String[] args) {
        double base, altura, areaTriangulo;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor da base: ");
        base = scanner.nextDouble();
        System.out.print("Digite um valor da altura: ");
        altura = scanner.nextDouble();
        areaTriangulo = (base * altura)/2;
        System.out.println("Área: " + areaTriangulo);
    }
}
