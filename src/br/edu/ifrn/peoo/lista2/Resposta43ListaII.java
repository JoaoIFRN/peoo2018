/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.peoo.lista2;

/**
 *
 * @author joaon
 */
public class Resposta43ListaII {
    public static void main(String[] args) {
        double soma = 0.0; //literal do double ZERO
        for (int i=1;i<=10;i++){
            soma = soma + i/Math.pow(i, 2);
        }
        System.out.println("Soma 1 = " + soma);
        
        soma = 0.0;
        int numerador = 1;
        for (int i = 1;i<=50;i++){
            System.out.println(numerador + "/" + i);
            soma = soma + (double) numerador/i;
            numerador = numerador + 2;
        }
        System.out.println("Soma 2 = " + soma);
    }
}
