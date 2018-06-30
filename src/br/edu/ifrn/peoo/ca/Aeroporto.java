/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.peoo.ca;

/**
 *
 * @author joaon
 */
public class Aeroporto {
    private String nome;
    private String cidade;
    private String estado;

    @Override
    public String toString() {
        return "Aeroporto{" + "nome=" + nome + ", cidade=" + cidade + ", estado=" + estado + '}';
    }        

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
