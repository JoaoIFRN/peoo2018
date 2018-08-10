/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.peoo.heranca;

import java.util.ArrayList;

/**
 *
 * @author joaon
 */
public class Principal {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Carro();
        Carro carro = (Carro) veiculo1;
        carro.buzinar();
        ((Carro)veiculo1).buzinar();
        
        ArrayList<Veiculo> veiculos = new ArrayList();
        veiculos.add(new Carro());
        veiculos.add(new Moto());
        veiculos.add(new Lancha());
        veiculos.add(new Carro());
        
        for (Veiculo veiculo : veiculos){
            if (veiculo instanceof Carro){
                ((Carro) veiculo).buzinar();
            }
        }
        
    }
}
