/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.peoo.petshop;

/**
 *
 * @author joaon
 */
public class TestePetShop {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        System.out.println(cliente1.getNome());
        
        Cliente cliente2 = new Cliente("Simon");
        System.out.println(cliente2.getNome());
        
        Cliente cliente3 = new Cliente("Jáfia","jjj@gmail");
        System.out.println(cliente3.getNome());
        
        Pet pet = new Pet();
    }
}
