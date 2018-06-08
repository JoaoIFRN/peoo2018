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
public class TesteCarro {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro("Fiat","Siena");
        System.out.println(carro.getFabricante());
        System.out.println(carro2.getFabricante());
    }
}
