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
public class Lista<T> {
    
    private No<T> raiz;
    private int numeroElementos = 0;
    
    public void add(T valor){
        if (raiz == null){
            raiz = new No(valor,null);
        }else{
            No no = raiz;
            while (no.getNoProximo() != null){
                no = no.getNoProximo();
            }
            no.setNoProximo(new No(valor,null));
        }
        numeroElementos++;
    }
    
    public int size(){
        return numeroElementos;
    }
    
    public boolean isEmpty(){
        return numeroElementos == 0;
    }
    
    public void clear(){
        raiz = null;
        numeroElementos = 0;
    }
    
    public T get(int index){
        if (isEmpty()) 
            return null;
        if (index < 0 || index > numeroElementos-1)
            return null;
        if (index == 0)
            return raiz.getValor(); 
        
        No<T> no = raiz.getNoProximo();
        int contador = 1;
        do{
            if (index == contador){
                return no.getValor();
            }
            no = no.getNoProximo();            
            contador++;
        }while(no.getNoProximo() != null);            
            
        
        return no.getValor();
    }
    
}
