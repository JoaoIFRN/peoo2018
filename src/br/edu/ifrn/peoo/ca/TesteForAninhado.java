/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.peoo.ca;

import java.util.Scanner;

/**
 *
 * @author joaon
 */
public class TesteForAninhado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        for (;;){
            boolean valido = true;
            
            System.out.print("Nome: ");
            String nome = entrada.nextLine();
            if (nome.length() < 3){
                valido = false;
            }else{
                break;
            }
            
            
            if (valido == false)
                continue;
        }
        //....
    }
}
