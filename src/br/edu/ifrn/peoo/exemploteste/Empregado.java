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

//Questão 25 da lista
public class Empregado {
    private String primeiroNome;
    private String ultimoNome;
    private long cpf;
    private float salario;

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        if (salario < 0){
            this.salario = 0.0f;
        }
        else {
            this.salario = salario;
        }
    }

    public Empregado(){
        
    }
    
    public Empregado(String primeiroNome, String ultimoNome, long cpf, float salario) {
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
        this.cpf = cpf;
        if (salario < 0){
            this.salario = 0.0f;
        }
        else {
            this.salario = salario;
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + (int) (this.cpf ^ (this.cpf >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empregado other = (Empregado) obj;
        if (this.cpf != other.cpf) {
            return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado();
        empregado1.setCpf(123);        
        Empregado empregado2 = new Empregado("Pedro","Sérgio",123,2789.15f);
        
        empregado1 = empregado2;
        
        if (empregado1 == empregado2){
            System.out.println("Endereços iguais");
        }
        if (empregado1.equals(empregado2)){
            System.out.println("Empregados iguais");
        }
    }
    
    
}
