/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.peoo.exemploteste;

/**
 *
 * @author joaon
 */
public class Conversao {
    
    public static double celciusToFahrenheit(double celcius){
        return celcius * 1.8 + 32;        
    } 
    
    public static double fahrenheitToCelcius(double fahrenheit){
        return (fahrenheit - 32)/1.8;
    }
}
