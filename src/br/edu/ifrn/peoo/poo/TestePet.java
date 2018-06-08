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
public class TestePet {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente("Pedro"); 
        cliente2.animais[0] = new AnimalEstimacao();
        cliente2.animais[1] = new AnimalEstimacao();
        System.out.println(cliente2.getNome());
        System.out.println(cliente2.getNumeroAnimais());
    }
}
