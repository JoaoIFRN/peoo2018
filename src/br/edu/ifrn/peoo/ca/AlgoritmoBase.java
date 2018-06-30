/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.peoo.ca;

/**
 *
 * @author joaon
 */
public class AlgoritmoBase {

    public static int maiorValor(int[] conjunto) throws Exception {
        if (conjunto.length <= 0){
            throw new Exception("Conjunto vazio!!!");
        }
        int maior = Integer.MIN_VALUE;
        for (int i = 0; i < conjunto.length; i++) {
            if (conjunto[i] > maior){
                maior = conjunto[i];
            }
        }
        return maior;
    }
    
    public static int menorValor(int [] conjunto){
        int menor = Integer.MAX_VALUE;
        for (int i = 0; i < conjunto.length; i++) {
            if (conjunto[i] < menor){
                menor = conjunto[i];
            }
        }
        return menor;
    }
    
    public static int somarValores(int [] conjunto){
        int soma = 0;
        for (int valor : conjunto){
            soma = soma + valor;
        }
        return soma;
    }

}
