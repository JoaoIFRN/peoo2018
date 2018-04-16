/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.peoo.simulado;

import java.util.Scanner;

/**
 *
 * @author joaon
 */
public class Q5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        final int TOTAL_MINUTOS_ANO = 365 * 24 * 60;
        final int TOTAL_MINUTOS_DIA = 24 * 60;
        
        System.out.print("Minutos: ");
        int minutos = scanner.nextInt();        
        int anos = minutos / TOTAL_MINUTOS_ANO;
        int resto = anos > 0 ? minutos - (anos * TOTAL_MINUTOS_ANO) : 0;
        int dias = resto / TOTAL_MINUTOS_DIA;
        System.out.println(anos + " anos");
        System.out.println(dias + " dias");
    }
}
