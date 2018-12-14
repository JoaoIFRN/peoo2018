/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.peoo.ultima.lista.q1;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author joaon
 */
public class InterfaceGrafica {
   
    private Scanner scanner;
    
    public InterfaceGrafica(){
        scanner = new Scanner(System.in);   
        try {
            Banco.lerEmArquivo();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(InterfaceGrafica.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    void executar(){
        while (true){
            exibirMenu();
            escolherTratarEscolha();
        }
    }
    
    void exibirMenu(){
       System.out.println("Escolha uma das opções: ");
       System.out.println("1 - Cadastrar cliente;");
       System.out.println("2 - Cadastrar festa;");
       System.out.println("3 - Cadastrar tema;");       
       System.out.println("4 - Listar clientes;");
       System.out.println("5 - Listar temas;");
       System.out.println("9 - Encerrar;");
       System.out.print("Opção: ");
    }
    
    void escolherTratarEscolha(){
        int escolha = scanner.nextInt();
        switch(escolha){
            case 1:
                cadastrarCliente();
            break;
            case 2:
                cadastrarFesta();
            break;
            case 3:
                cadastrarTema();
            break;
            case 4:
                listarClientes();
            break;
            case 5:
                listarTemas();
            break;
            case 9:
                encerrar();
            break;
        }
    }
    
    void encerrar(){
        try {
            Banco.gravarEmArquivo();
        } catch (IOException ex) {
            Logger.getLogger(InterfaceGrafica.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.exit(0);
    }
        
    void cadastrarCliente(){
        Cliente cliente = new Cliente();
        System.out.print("Digite o nome do cliente: ");
        cliente.setNome(scanner.next());
        System.out.print("Digite o número do telefone: ");
        cliente.setNumeroTelefone(scanner.next());
        salvarCliente(cliente);
    }
    
    void cadastrarFesta(){
        Festa festa = new Festa();
        try {
            System.out.print("Digite o índice do tema: ");
            festa.setTema(Banco.temas.get(scanner.nextInt()));
            System.out.print("Digite a data da festa: ");
            festa.setData(scanner.next());
            System.out.print("Digite a hora de início: ");
            festa.setHoraIncicio(scanner.next());
            System.out.print("Digite a hora fim: ");
            festa.setHoraFim(scanner.next());
            System.out.print("Digite o valor do aluguel: ");
            festa.setValor(scanner.nextDouble());
            System.out.print("Digite o índice do cliente: ");
            festa.setCliente(Banco.clientes.get(scanner.nextInt()));
            salvarFesta(festa);
        }catch(Exception ex){
            System.out.println("Erro");
        }
    }
    
    void salvarCliente(Cliente cliente){
        Banco.clientes.add(cliente);
    }
    
    void salvarFesta(Festa festa){
        Banco.festas.add(festa);
    }
    
    void listarClientes(){
        int indice = 0;
        for (Cliente cliente : Banco.clientes){
            System.out.println(indice + " - " + cliente);
            indice++;
        }
    }

    public void listarTemas() {
        int indice = 0;
        for (Tema tema : Banco.temas){
            System.out.println(indice + " - " + tema);
            indice++;
        }
    }

    public void cadastrarTema() {
        Tema tema = new Tema();
        System.out.print("Digite o nome do tema: ");
        tema.setNome(scanner.next());
        System.out.print("Digite o número do itens do tema: ");
        int numeroItens = scanner.nextInt();
        for (int i=0;i<numeroItens;i++){            
            System.out.print("Digite o nome do item: ");
            String nome = scanner.next();
            tema.getItens().add(new ItemTema(nome));
        }
        salvarTema(tema);
    }
   
    public void salvarTema(Tema tema){
        Banco.temas.add(tema);
    }
   
}
