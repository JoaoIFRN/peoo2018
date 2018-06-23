/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.peoo.teste2unidade;

/**
 *
 * @author joaon
 */
public class AlgoritmoBasico {
    
    public static int maiorValor(int [] conjunto){
        int maior = Integer.MIN_VALUE;       
        for (int elemento : conjunto){
            if (elemento > maior)
                maior = elemento;
        }
        return maior;
    }
    
    public static int menorValor(int [] conjunto){
        int menor = Integer.MAX_VALUE;        
        for (int elemento : conjunto){
            if (elemento < menor)
                menor = elemento;
        }
        return menor;
    }
    
    public static int somarValores(int [] conjunto){
        int soma = 0;
        for (int elemento : conjunto){
            soma += elemento;
        }
        return soma;
    }
}
