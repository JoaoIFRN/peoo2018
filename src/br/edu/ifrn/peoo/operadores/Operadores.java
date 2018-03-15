/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.peoo.operadores;

/**
 *
 * @author joaon
 */
public class Operadores {

    public static void main(String[] args) {
        int a = 1; //Número um
        int resultado;
        resultado = a + a; //soma
        resultado = a - a; //subtração
        resultado = a / a; //Divisão
        resultado = a * a; //Multiplicação
        resultado = a % a; //Resto da divisão
        System.out.println(a++); //Pós incremento
        System.out.println(--a); //Pré incremento
        a += 2; // a = a + 2;
        a *= 2; // a = a * 2;
        a /= 3; // a = a / 3;
        System.out.println(a);

        //Operadores lógicos
        boolean logico1 = true; //Número um
        boolean logico2 = false;
        System.out.println(logico1 && logico2); //AND
        System.out.println(logico1 || logico2); //OR
        System.out.println(!logico1); //NOT

        //Operadores relacionais
        int valorA = 3;
        int valorB = 45;
        if (valorA != valorB) {
            System.out.println("Valores diferentes");
        } else {
            System.out.println("Valores iguais");
        }
        boolean testes;
        testes = valorA == valorB;
        testes = valorA != valorB;
        testes = valorA >= valorB;
        System.out.println(testes);
        
        //Operador ternário
        int respostaTernario = 4 > valorA ? 0 : 23;
        if (4 > valorA){
            respostaTernario = 0;
        }
        else{
            respostaTernario = 23;
        }
    }
}
