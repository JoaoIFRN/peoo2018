/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.peoo.controle;

import java.util.Locale;

/**
 *
 * @author joaon
 */
public class PrintFormatado {
    
    public static void main(String[] args) {
        Locale locale = new Locale("pt","BR");
        System.out.printf(locale,"PI:\t%.2f\n",Math.PI);
    }
    
}
