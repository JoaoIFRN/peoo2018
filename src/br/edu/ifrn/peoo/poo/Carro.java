/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.peoo.poo;

/**
 *
 * @author joaon
 */
public class Carro {
    private String fabricante;
    private String modelo;
    private int numeroPortas;
    private Motor motor;
    
    public Carro(){
        this.fabricante = "Sem fabricante";
        this.modelo = "Sem modelo";
    }
    
    public Carro(String fabricante, String modelo){
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    
    
    
    public void acelerar(){
        System.out.println("Acelerando...");
    }
    
    public void parar(){
        System.out.println("Parando...");
    }
}
