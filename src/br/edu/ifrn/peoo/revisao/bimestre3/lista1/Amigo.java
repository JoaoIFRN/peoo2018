/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.peoo.revisao.bimestre3.lista1;

/**
 *
 * @author joaon
 */
public class Amigo extends Pessoa {
    
    private String dataNascimento;
    //Date, Calendar, LocalDate
    
    public Amigo(){
        this.dataNascimento = "Indefinido";
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    
    
}
