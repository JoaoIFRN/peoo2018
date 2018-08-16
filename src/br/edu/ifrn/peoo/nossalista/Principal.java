/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.peoo.nossalista;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author joaon
 */
public class Principal {
    public static void main(String[] args) {
        Lista<Pet> pets = new Lista();
        pets.add(new Pet("Rex"));
        pets.add(new Pet("Kobe"));
        pets.add(new Pet("Lebrom"));
        System.out.println(pets.get(0).getNome());
        System.out.println(pets.get(1).getNome());
        System.out.println(pets.get(2).getNome());
    }
 
}
