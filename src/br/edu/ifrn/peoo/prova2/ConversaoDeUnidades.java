/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.peoo.prova2;

/**
 *
 * @author joaon
 */
public class ConversaoDeUnidades {
    public static double metroQuadradoParaPesQuadrado(double metrosQuadrado){
        return metrosQuadrado * 10.76; 
    }
    
    public static double pesQuadradoParaCentimetroQuadrado(double pesQuadrado){
        return pesQuadrado * 929.0; 
    }
    
    public static double litroParaCentimetroCubico(double litros){
        return litros * 1000.0; 
    }
    
    public static double metroCubicoParaLitro(double metrosCubico){
        return metrosCubico * 1000.0; 
    }
}
