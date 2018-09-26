/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.peoo.revisao.bimestre3.lista2;

/**
 *
 * @author joaon
 */
public class DVD extends Midia {
    
    private int regiao;

    public int getRegiao() {
        return regiao;
    }

    public void setRegiao(int regiao) {
        this.regiao = regiao;
    }

    @Override
    public String toString() {        
        return super.toString() + " - DVD{" + "regiao=" + regiao + '}';
    }
    
    
}
