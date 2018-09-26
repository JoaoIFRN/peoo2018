/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.peoo.revisao.bimestre3.lista1;

import javax.swing.JOptionPane;

/**
 *
 * @author joaon
 */
public class TesteAgenda {
    public static void main(String[] args) {
        int numeroPessoa = 
        Integer.parseInt(JOptionPane.showInputDialog("Número de pessoas:"));
        Agenda agenda = new Agenda(numeroPessoa);
        System.out.println("Número de amigos: " + agenda.getNumeroAmigos());
        System.out.println("Número de conhecidos: " + agenda.getNumeroConhecidos());
        agenda.addInformacoes();
        agenda.imprimirAniversarios();
        agenda.imprimirEmail();
    }
}
