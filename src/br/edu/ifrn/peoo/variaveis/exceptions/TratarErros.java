/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.peoo.variaveis.exceptions;

/**
 *
 * @author joaon
 */
public class TratarErros {
    
    class Aluno {
        String nome;
        void exibirNome(){
            exibirNome();
            System.out.println(nome);
        }
    }
    
    public void testar(){
        Aluno aluno  = new Aluno();
        aluno.exibirNome();
    }
    
    public static void main(String[] args) {
        int a = 2/0;
    }
}
