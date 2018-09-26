/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.peoo.heranca;

import java.lang.reflect.Field;
import java.util.ArrayList;

/**
 *
 * @author joaon
 */
public class Principal {
    public static void main(String[] args) {
        
        Carro carro = new Carro();
        
        System.out.println(carro.hashCode());
        
        Carro carro2 = new Carro();
        
        System.out.println(carro2.hashCode());
        
        /*Field[] declaredFields = 
                carro.getClass().getDeclaredFields();
        for (Field field : declaredFields){
            System.out.println(field.getName());
        }*/
                
                /*Veiculo veiculo;
                veiculo = new Carro();
                Carro carro = (Carro) veiculo;
                carro.buzinar();
                ((Carro) veiculo).buzinar();
                
                ArrayList<Veiculo> veiculos = new ArrayList();
                veiculos.add(new Carro());
                veiculos.add(new Moto());
                veiculos.add(new Lancha());
                veiculos.add(new Carro());
                for (Veiculo veiculoAuxiliar : veiculos){
                if (veiculoAuxiliar instanceof Carro){
                ((Carro) veiculoAuxiliar).buzinar();
                }
                }
                
                ArrayList lista = new ArrayList();
                lista.add(new Veiculo());
                lista.add(new Object());
                lista.add(new Carro());
                lista.add(new Integer(0));
                lista.add("Joao");
                for (Object object : lista){
                System.out.println(object);
                }*/;
    }
}

