/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.peoo.variaveis;

/**
 *
 * @author joaon
 */
public class Variaveis {
    public static void main(String[] args) {
        //Tipos inteiros do Java 
        //Tipo + nome + [ = valor] + ;
        byte varByte = 12;
        int varInt = 1278;
        long varLong = 1234L;
        short varShort = 123;
        long somaLong = varInt + varLong;
        
        //Tipos reais
        float varFloat = 13.78F;
        double varDouble = 1234.78;
        double valorNotacaoCientifica = 5e3;
        
        //Operação de cast (conversão explícita)
        //var = (tipo) variável/operação
        varInt = (int) varFloat;
        
        //Tipo caractere
        char varChar = 'a';
        char varCharUnicode = '\u0061';
        varInt = varCharUnicode;
        System.out.println(varInt);
        
        //Caracteres especiais 
        System.out.println("Caractere de tabulação\tno Java");
        System.out.println("Caractere quebra de linha\nJava");
    }
}
