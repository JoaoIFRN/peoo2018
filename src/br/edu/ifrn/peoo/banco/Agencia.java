/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.peoo.banco;

import java.util.ArrayList;

/**
 *
 * @author joaon
 */
public class Agencia {
    
    private int numero;
    private String nome;
    private String endereco;
    private String nomeGerente;
    private ArrayList<Cliente> clientes = new ArrayList();
    private ArrayList<Conta> contas = new ArrayList();
    private Banco banco;
    
    public Agencia(int numero){
        this.numero = numero;
    }
    
    public void criarConta(Cliente cliente, int numeroConta, double limiteConta){        
        Conta conta = new Conta(numeroConta,cliente,this);
        conta.setLimite(limiteConta);
        contas.add(conta);
    }
    
    public Cliente buscarCliente(String nome){
        for (Cliente cliente : clientes){
            if (cliente.getNome().equals(nome)){
                return cliente;
            }
        }
        return null;
    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNomeGerente() {
        return nomeGerente;
    }

    public void setNomeGerente(String nomeGerente) {
        this.nomeGerente = nomeGerente;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Conta> getContas() {
        return contas;
    }

    public void setContas(ArrayList<Conta> contas) {
        this.contas = contas;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }
    
}
