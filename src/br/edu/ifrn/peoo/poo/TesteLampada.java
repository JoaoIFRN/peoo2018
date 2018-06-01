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
public class TesteLampada {
    public static void main(String[] args) {
        Lampada lampada1 = null;
        Lampada lampada2 = new Lampada();
        lampada2.setFabricante("Osram");
        lampada2.setModelo("A1");
        lampada1 = lampada2;
        System.out.println(lampada1);
    }
}
