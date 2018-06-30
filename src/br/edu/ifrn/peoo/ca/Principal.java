/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.peoo.ca;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author joaon
 */
public class Principal {
    
    private ArrayList<Operadora> operadoras = new ArrayList();
    
    public static void main(String[] args) {
        new Principal().executar();
    }
    
    public void executar(){
        while (true){
            exibirMenu();
            tratarMenu();
        }
    }
    
    public void exibirMenu(){
        System.out.println("Pesquisar voo");
        System.out.println("Listar voos");
        System.out.print("Opção: ");
    }
    
    private void tratarMenu(){
        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();
        switch(opcao){
            case 1:
            break;
            case 2:
            break;
            case 3:
            break;
            case 5:
                System.exit(0);
            break;
        }
        
    }
    
    
}
