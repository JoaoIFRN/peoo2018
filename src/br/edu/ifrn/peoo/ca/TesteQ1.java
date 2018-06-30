/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.peoo.ca;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author joaon
 */
public class TesteQ1 {
    public static void main(String[] args) {
        int [] vetor = {2,5,7,8};
        try {
            System.out.println(AlgoritmoBase.maiorValor(vetor));
        } catch (Exception ex) {
            Logger.getLogger(TesteQ1.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(AlgoritmoBase.menorValor(new int[]{3,4,5}));
        System.out.println(AlgoritmoBase.menorValor(vetor));
        System.out.println(AlgoritmoBase.somarValores(vetor));
    }
}
