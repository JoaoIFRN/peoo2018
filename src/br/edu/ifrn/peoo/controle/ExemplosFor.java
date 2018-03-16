/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.peoo.controle;

/**
 *
 * @author joaon
 */
public class ExemplosFor {
    public static void main(String[] args) {
        //for (inicialização;teste;incremento)
        //Exemplo de for infinito
        /*
        for (;;){
            System.out.println("João");
        }
        */
        
        //1 - 100
        for (int i=1; i<=100 ; i++){
            System.out.println(i);
        }
        
        //1 - 99; Passo 2 
        for (int i=1; i<=100 ;i = i + 2){
            System.out.println(i);
        }
        
        //100 - 0
        for (int i=100;i>=0;i--){
            System.out.println(i);
        }
        
        //Percorrer elementos de um vetor
        int [] vetor = new int[]{2,3,6,7,5};
        for (int i=0;i<vetor.length;i++){
            System.out.println(vetor[i]);
        }
        
        //Foreach
        for (int elemento : vetor){
            System.out.println(elemento);
        }
        
        Carro [] carros = new Carro[3];
        carros[0] = new Carro();
        carros[0].setCor("branco");
        for (Carro carro : carros){
            System.out.println(carro);
        }
        
    }
}
