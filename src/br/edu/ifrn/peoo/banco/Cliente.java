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
public class Cliente {
    
    private String nome;
    private String telefone;
    private String email;
    private ArrayList<Conta> contas = new ArrayList();
    private ArrayList<Agencia> agencias = new ArrayList();
    
    public Conta buscarConta(int numero){
        for (Conta conta : contas){
            if (conta.getNumero() == numero){
                return conta;
            }
        }
        return null;
    }
    
    public Agencia buscarAgencia(int numero){
        for (Agencia agencia : agencias){
            if (agencia.getNumero() == numero){
                return agencia;
            }
        }
        return null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Conta> getContas() {
        return contas;
    }

    public void setContas(ArrayList<Conta> contas) {
        this.contas = contas;
    }

    public ArrayList<Agencia> getAgencias() {
        return agencias;
    }

    public void setAgencias(ArrayList<Agencia> agencias) {
        this.agencias = agencias;
    }
    
    
    
}
