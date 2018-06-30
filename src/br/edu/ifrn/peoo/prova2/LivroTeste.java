/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.peoo.prova2;

/**
 *
 * @author joaon
 */
public class LivroTeste {
    public static void main(String[] args) {
        Livro [] livros = new Livro[10];
        for (int i=0;i<livros.length;i++){
            livros[i] = new Livro("Livro XXX","9809798","João","IFRN");
        }
        
        for (int i=0;i<livros.length;i++){
            System.out.println("Livro [" + (i + 1) + "]");
            System.out.println(livros[i].getNome());
            System.out.println(livros[i].getAutor());
            System.out.println("======================");
        }
        
    }
}
