/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.peoo.banco;

/**
 *
 * @author joaon
 */
public class Conta {
    
    private double saldo;
    private double limite;
    private boolean ativa;
    private int numero;
    private Cliente cliente;
    private Agencia agencia;
    
    public Conta(int numero, Cliente cliente, Agencia agencia){
       this.numero = numero;
       this.ativa = true;
       this.cliente = cliente;
       this.agencia = agencia;
    }
    
    public void cancelar(){
        this.ativa = false;
    }
    
    public void sacar(double valor){
        if (this.saldo + this.limite >= valor)
            this.saldo -= valor;
    }
    
    public void depositar(double valor){
        if (valor > 0)
            this.saldo = this.saldo + valor;            
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }
    
    public void setLimite(double novoLimite){
        this.limite = novoLimite;
    }

   
    public int getNumero() {
        return numero;
    }

    public Agencia getAgencia() {
        return agencia;
    }
    
}
