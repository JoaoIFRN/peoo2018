/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.peoo.ultima.lista.q1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author joaon
 */
public class Banco {

    public static List<Cliente> clientes = new ArrayList();
    public static List<Tema> temas = new ArrayList();
    public static List<Festa> festas = new ArrayList();

    public static void gravarEmArquivo() throws FileNotFoundException, IOException {
        FileOutputStream arquivo = new FileOutputStream("clientes.dat");
        ObjectOutputStream gravador = new ObjectOutputStream(arquivo);
        gravador.writeObject(clientes);
        gravador.flush();
        gravador.close();
        arquivo.flush();
        arquivo.close();
        
        arquivo = new FileOutputStream("festas.dat");
        gravador = new ObjectOutputStream(arquivo);
        gravador.writeObject(festas);
        gravador.flush();
        gravador.close();
        arquivo.flush();
        arquivo.close();
        
        arquivo = new FileOutputStream("temas.dat");
        gravador = new ObjectOutputStream(arquivo);
        gravador.writeObject(temas);
        gravador.flush();
        gravador.close();
        arquivo.flush();
        arquivo.close();                
    }

    public static void lerEmArquivo() throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream arquivo = new FileInputStream("clientes.dat");
        ObjectInputStream leitor = new ObjectInputStream(arquivo);
        clientes = (List<Cliente>) leitor.readObject();
        leitor.close();
        arquivo.close();
        
        arquivo = new FileInputStream("festas.dat");
        leitor = new ObjectInputStream(arquivo);
        festas = (List<Festa>) leitor.readObject();
        leitor.close();
        arquivo.close();
        
        arquivo = new FileInputStream("temas.dat");
        leitor = new ObjectInputStream(arquivo);
        temas = (List<Tema>) leitor.readObject();
        leitor.close();
        arquivo.close();
    }

    /*
    public static void main(String[] args) {
        
        
        clientes.add(new Cliente("Erick"));
        clientes.add(new Cliente("Cibele"));
        clientes.add(new Cliente("Emmily"));
        
        try {
            gravarEmArquivo();
            
        } catch (IOException ex) {
            Logger.getLogger(Banco.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            lerEmArquivo();
        } catch (IOException ex) {
            Logger.getLogger(Banco.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Banco.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println(clientes);
        
    }
     */
}
