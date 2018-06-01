/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.peoo.poo;

import java.util.Date;

/**
 *
 * @author joaon
 */
public class JogoTenisMesa {
    
    private Date data;
    private Jogador jogador1;
    private Jogador jogador2;
    private Endereco localJogo;

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Jogador getJogador1() {
        return jogador1;
    }

    public void setJogador1(Jogador jogador1) {
        this.jogador1 = jogador1;
    }

    public Jogador getJogador2() {
        return jogador2;
    }

    public void setJogador2(Jogador jogador2) {
        this.jogador2 = jogador2;
    }

    public Endereco getLocalJogo() {
        return localJogo;
    }

    public void setLocalJogo(Endereco localJogo) {
        this.localJogo = localJogo;
    }
    
    
    
}
