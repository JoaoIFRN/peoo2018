/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.peoo.prova1;

/**
 *
 * @author joaon
 */
public class Resposta3Vetor {
    public static void main(String[] args) {
        Integer [] vetor = new Integer[15];
        vetor[0] = 0;
        vetor[1] = 1;
        for (int i=0;i<13;i++){
            vetor[i+2] = 2*vetor[i+1] + vetor[i];       
            break;
        }
        
        for (int elemento : vetor){
            System.out.println(elemento);
        }

    }
}
