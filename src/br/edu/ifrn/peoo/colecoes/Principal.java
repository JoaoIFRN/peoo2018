/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.peoo.colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

/**
 *
 * @author joaon
 */
public class Principal {
    
    public static void main(String[] args) {
        List<String> nomes = new ArrayList();
        nomes.add("Joao");
        nomes.add("Simon José");
        nomes.add("Ana Luísa");
        //Ordem alfabética
        Collections.sort(nomes);
        System.out.println(nomes);
        //Ordenar por tamanho
        nomes.sort(new OrdenarPorTamanho());
        System.out.println(nomes);
        
        
        //Passado sombrio
        for (String nome : nomes){
            System.out.println(nome);
        }
        
        //Futuro
        //Com classe consumidora
        nomes.forEach(new ConsumidorStrings());        
        //Com Lambda
        nomes.forEach(nome -> System.out.println(nome));        
        //Método reference
        nomes.forEach(System.out::println);
        
        Set<String> nomesSet = new HashSet();        
        nomesSet.add("a");
        nomesSet.add("a");
        nomesSet.add("b");
        nomesSet.add("b");
        nomesSet.add("b");
        nomesSet.add("b");
        nomesSet.add("b");
        System.out.println(nomesSet.size());
        nomesSet.forEach(nome -> System.out.println(nome) );
        
        Map<String,String> nomesMap = new HashMap();
        nomesMap.put("João", "The best");
        nomesMap.put("Simon", "The little");
        nomesMap.put("Gabriel", "The animal");
        System.out.println(nomesMap.get("Gabriel"));
        for (String valor : nomesMap.values()){
            System.out.println(valor);
        }
        for (String chave : nomesMap.keySet()){
            System.out.println(chave);
        }
    }
    
}


class ConsumidorStrings implements Consumer<String>{

    @Override
    public void accept(String t) {
        System.out.println(t);
    }
    
}

class OrdenarPorTamanho implements Comparator<String>{

    @Override
    public int compare(String s1, String s2) {
        if (s1.length() < s2.length())
            return -1;
        if (s1.length() > s2.length())
            return 1;
        return 0;
    }
    
}
