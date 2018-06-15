/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.peoo.metodos;

/**
 *
 * @author joaon
 */
public class TesteStatic {
    public static void main(String[] args) {
        Static.imprimir();
        Static.nome = "João";
        Math.sin(2.9);
        Static exemploStatic = new Static();
        System.out.println(exemploStatic.nome);
    }
}
