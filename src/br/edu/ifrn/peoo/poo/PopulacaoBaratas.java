/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.peoo.poo;

/**
 *
 * @author joaon
 */
public class PopulacaoBaratas {
    
    private long quantidade;
    
    public PopulacaoBaratas(long quantidade){
        this.quantidade = quantidade;
    }
    
    public void aguardar(){
        this.quantidade = this.quantidade * 2;
    }
    
    public void pulverizar(){
        this.quantidade = (long) (this.quantidade * 0.9);
    }
    
    public long getBaratas(){
        return this.quantidade;
    }
    
    public static void main(String[] args) {
        PopulacaoBaratas baratas = new PopulacaoBaratas(100);
        baratas.aguardar();
        baratas.pulverizar();
        System.out.println(baratas.getBaratas());
    }
}
