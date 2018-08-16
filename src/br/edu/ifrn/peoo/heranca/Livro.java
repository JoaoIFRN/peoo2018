/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.peoo.heranca;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author joaon
 */
public class Livro extends Produto {
    
    private List<String> autores;
    private int numeroPaginas; 
    
    public Livro(String nome, double preco,
                 List<String> autores,
                 int numeroPaginas){
        super(nome,preco);
        this.autores = autores;
        this.numeroPaginas = numeroPaginas;
    }
    
    public static void main(String[] args) {
        Livro livro = new Livro("Nárnia",50.00,
                new ArrayList(),500);
        
    }
    
}
