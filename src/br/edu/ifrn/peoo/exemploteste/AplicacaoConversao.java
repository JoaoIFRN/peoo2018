/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.peoo.exemploteste;

import java.util.Scanner;

/**
 *
 * @author joaon
 */
public class AplicacaoConversao {
    public static void main(String[] args) {        
        
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.println("### Conversor de temperatura ###");
            System.out.println("Opções: ");
            System.out.println("1 - Celcius para Fahreneheit;");
            System.out.println("2 - Fahreneheit para Celcius;");
            System.out.println("3 - Sair;");
            System.out.print("Opção: ");
            
            int opcao = scanner.nextInt();
            boolean finalizar = false;
            double valor = 0.0;
            switch(opcao){
                case 1:
                    System.out.print("Digite um valor em Celcius: ");
                    valor = scanner.nextDouble();
                    System.out.println("Resultado: " + Conversao.celciusToFahrenheit(valor) + "ºF");
                break;
                case 2:
                    System.out.print("Digite um valor em Fahrenheit: ");
                    valor = scanner.nextDouble();
                    System.out.println("Resultado: " + Conversao.fahrenheitToCelcius(valor) + "ºC");
                break;
                case 3:
                    System.out.println("Programa encerrado!!!");
                    finalizar = true;
                break;
                default:
                    System.out.println("Opção inválida");
            }
            
            if (finalizar){
                break;
            }
            
        }
    }
}
