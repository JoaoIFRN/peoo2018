/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.peoo.simulado;

import java.util.Scanner;

/**
 *
 * @author joaon
 */
public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
               
        System.out.print("Altura (m): ");
        double altura = scanner.nextDouble();
        System.out.print("Massa (kg): ");
        double massa = scanner.nextDouble();
        
        double imc = massa / (altura * altura);
        
        System.out.printf("IMC: %.2f\n",imc);
        System.out.print("Classificação: ");
        if (imc < 10.0){
            System.out.println("Desnutrição Grau V");
        }else if (imc >= 10 && imc <= 12.9){
            System.out.println("Desnutrição Grau IV");
        }else if (imc >= 13 && imc <= 15.9){
            System.out.println("Desnutrição Grau III");
        }else if (imc >= 16 && imc <= 16.9){
            System.out.println("Desnutrição Grau II");
        }else if (imc >= 17 && imc <= 18.4){
            System.out.println("Desnutrição Grau I");
        }else if (imc >= 18.5 && imc <= 24.9){
            System.out.println("Normal");
        }else if (imc >= 25 && imc <= 29.9){
            System.out.println("Pré-obesidade");
        }else if (imc >= 30 && imc <= 34.5){
            System.out.println("Obesidade Grau I");
        }else if (imc >= 35 && imc <= 39.9){
            System.out.println("Obesidade Grau II");
        }else if (imc >= 40){
            System.out.println("Obesidade Grau III");
        }
        
    }
  
}
