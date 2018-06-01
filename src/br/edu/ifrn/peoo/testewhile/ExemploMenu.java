/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.peoo.testewhile;

import java.util.Scanner;

/**
 *
 * @author joaon
 */
public class ExemploMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        do {            
            System.out.println("### Loja do Grêmio ###");
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Produtos");
            System.out.println("2 - Informações");
            System.out.println("3 - Carteira de estudante");
            System.out.println("4 - Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();   
            if (opcao < 1 || opcao > 4)
                System.out.println("Opção inválida");
        } while (opcao != 4);
    }
}
