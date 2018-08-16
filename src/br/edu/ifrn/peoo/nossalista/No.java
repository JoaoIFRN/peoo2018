/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.peoo.nossalista;

/**
 *
 * @author joaon
 */
public class No<T> {
    
    private T valor;
    private No<T> noProximo;

    public No(T valor, No<T> noProximo) {
        this.valor = valor;
        this.noProximo = noProximo;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public No<T> getNoProximo() {
        return noProximo;
    }

    public void setNoProximo(No<T> noProximo) {
        this.noProximo = noProximo;
    }
    
    

}
