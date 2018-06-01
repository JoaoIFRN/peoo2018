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
public class ProgamaJogoTenisMesa {
    public static void main(String[] args) {
        JogoTenisMesa jogoTenisMesa = new JogoTenisMesa();
        
        Endereco endereco = new Endereco();
        endereco.setEstado("RN");
        
        jogoTenisMesa.setLocalJogo(endereco);       
        
        jogoTenisMesa.getLocalJogo().setRua("Rua Conceição");
        jogoTenisMesa.getLocalJogo().setNumero(10);
        jogoTenisMesa.getLocalJogo().setBairro("Cajupiranga");
        
        System.out.println(jogoTenisMesa.getLocalJogo().getEstado());
        
    }
}
