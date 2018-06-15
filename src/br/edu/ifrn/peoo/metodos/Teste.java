/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.peoo.metodos;

import java.util.Date;

/**
 *
 * @author joaon
 */
public class Teste {
    
    void print1(boolean msg, String ... objs){
        if (msg)System.out.println("Verdade");
        for (int i=0;i<objs.length;i++)
            System.out.println(objs[i]);  
    }    
    void print1(String ... parametros){
        for (int i=0;i<parametros.length;i++)
            System.out.println(parametros[i]);
    }    
    void print1(java.util.Date [] parametros){
        for (int i=0;i<parametros.length;i++)
            System.out.println(parametros[i]);
    }
    
    public static void main(String[] args) {
        Teste teste = new Teste();
        teste.print1(true,"Simon","Emily");
        teste.print1("Oi","Tim");
        teste.print1();
        Date [] datas = new Date[10];
        teste.print1(datas);
    }
    
}
