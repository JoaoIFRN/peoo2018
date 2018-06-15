/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.peoo.listapoo;

/**
 *
 * @author joaon
 */
public class Fatura {
    private int numero;
    private String descricao;
    private int quantidade;
    private float preco;

    public Fatura() {
    }        

    public Fatura(int numero, String descricao, int quantidade, float preco) {
        this.numero = numero;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.preco = preco;
    }
    
    public float getTotal(){
        float total = this.quantidade * this.preco;
        if (preco < 0){
            return 0;
        }else{
            return total;
        }
    }
    
    

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    public static void main(String[] args) {
        Fatura fatura = new Fatura();
        fatura.setQuantidade(10);
        fatura.setPreco(23.45f);
        System.out.println(fatura.getTotal());
    }
}
