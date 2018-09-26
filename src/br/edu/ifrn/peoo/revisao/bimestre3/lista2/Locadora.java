/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.peoo.revisao.bimestre3.lista2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author joaon
 */
public class Locadora {
    
    private List<Midia> midias = new ArrayList();
    
    public void inserir(Midia midia){
        midias.add(midia);
    }
    
    public void alugar(String titulo) throws MidiaNaoExisteException, MidiaNaoDisponivelException{
        boolean existe = false;
        for (Midia midia : midias){
            if (midia.getTitulo().equals(titulo)){                
                if (!midia.isDisponivel())
                    throw new MidiaNaoDisponivelException();
                midia.setDisponivel(false);
                existe = true;
            }
        }
        if (!existe)
            throw new MidiaNaoExisteException();        
    }
    
    public void devolver(String titulo) throws MidiaNaoExisteException{
        boolean existe = false;
        for (Midia midia : midias){
            if (midia.getTitulo().equals(titulo)){                
                midia.setDisponivel(true);
                existe = true;
            }
        }
        if (!existe)
            throw new MidiaNaoExisteException();        
    }
    
    public String listar(){
        String lista = "";
        for (Midia midia : midias){
            if (midia.isDisponivel())
                lista += midia.getTitulo() + ";";
        }
        return lista;
    }
    
    public int getNumeroCDs(){
        int contador = 0;
        for (Midia midia : midias){
            if (midia instanceof CD)
                contador++;
        }
        return contador;
    }
    
    public int getNumeroDVDs(){
        int contador = 0;
        for (Midia midia : midias){
            if (midia instanceof DVD)
                contador++;
        }
        return contador;
    }

    @Override
    public String toString() {
        return "Locadora{" + "midias=" + midias + '}';
    }

}
