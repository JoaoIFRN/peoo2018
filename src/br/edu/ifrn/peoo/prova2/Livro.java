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
public class Livro {
    private String nome;
    private String isbn;
    private String autor;
    private String editor;

    public Livro(String nome, String isbn, String autor, String editor) {
        this.nome = nome;
        this.isbn = isbn;
        this.autor = autor;
        this.editor = editor;
    }
    
    

    @Override
    public String toString() {
        return "Livro{" + "nome=" + nome + ", isbn=" + isbn + ", autor=" + autor + ", editor=" + editor + '}';
    }

    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }
    
    
}
