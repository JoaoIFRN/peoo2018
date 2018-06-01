/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.peoo.controle;

import java.util.Scanner;

/**
 *
 * @author joaon
 */
public class TesteSwitch {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dia da semana(1-7): ");
        String nome = "joao";
        //int diaSemana = scanner.nextInt();
        DiaSemana diaSemana = DiaSemana.DOMINGO;
        switch(diaSemana){
            case DOMINGO:
                System.out.println("Domingo");
            break;
            case SEGUNDA:
                System.out.println("Segunda");
            break;
            case TERCA:
                System.out.println("Terça");
            break;
            //...
            case SEXTA:
            case SABADO:
                System.out.println("Final de semana");
            break;
            default:
                System.out.println("Não existe");
        }
    }
}
