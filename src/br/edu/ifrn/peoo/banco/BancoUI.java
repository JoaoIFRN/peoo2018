/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.peoo.banco;

import java.util.Scanner;

/**
 *
 * @author joaon
 */
public class BancoUI {
    
    private Banco banco;
    private Scanner scanner;
    
    public BancoUI(){
        this.banco = new Banco(1);
        scanner = new Scanner(System.in);
    }
    
    public void exibirMenu(){
        System.out.println("#### BANCO DO IFRN ####");
        System.out.println("MENU DE OPÇÕES:");
        System.out.println("1 - Cadastrar agência");
        System.out.println("2 - Cadastrar cliente");
        System.out.println("3 - Criar conta");
        System.out.println("4 - Realizar depósito");
        System.out.println("5 - Realizar saque");
        System.out.println("6 - Ver saldo");
        System.out.println("7 - Mudar limite de conta");
        System.out.println("8 - Cancelar conta");
        System.out.println("9 - Sair");
        System.out.print("Escolha uma opção: ");
    }
    
    public void tratarEscolhaMenu(){        
        int opcao = scanner.nextInt();
        switch(opcao){
            case 1:
                cadastrarAgencia();
            break;    
            case 2:
                cadastrarCliente();
            break;
            case 3:
                cadastrarConta();
            break;
        }
    }
    
    public void cadastrarConta(){
        Agencia agencia = buscarAgencia();
        if (agencia == null)
            return;
        Cliente cliente = buscarCliente(agencia);
        if (cliente == null)
            return;
        System.out.print("Número da conta: ");
        int numeroConta = scanner.nextInt();
        System.out.print("Limite da conta: ");
        double limiteConta = scanner.nextDouble();
        agencia.criarConta(cliente, numeroConta, limiteConta);
    }
    
    public Cliente buscarCliente(Agencia agencia){
        while (true){
            System.out.print("Digite o nome do cliente: ");
            String nome = scanner.nextLine();
            Cliente cliente = agencia.buscarCliente(nome);
            if (cliente != null){
                return cliente;
            }else{
                System.out.print("Cliente não encontrado, deseja continuar (S/N): ");
                String escolha = scanner.nextLine();
                if (escolha.toLowerCase().equals("n"))
                    break;
            }                
        }
        return null;
    }
    
    public void cadastrarAgencia(){
        System.out.print("Digite o número da nova agência: ");
        int numeroAgencia = scanner.nextInt();
        banco.adicionaAgencia(new Agencia(numeroAgencia));
    }
    
    public void cadastrarCliente(){
        System.out.print("Digite o nome do cliente: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o email do cliente: ");
        String email = scanner.nextLine();
        System.out.print("Digite o telefone do cliente: ");
        String telefone = scanner.nextLine();
        Cliente cliente = new Cliente();
        cliente.setNome(nome);
        cliente.setEmail(email);
        cliente.setTelefone(telefone);
        Agencia agencia = buscarAgencia();
        if (agencia != null)
            agencia.getClientes().add(cliente);
    }
    
    public Agencia buscarAgencia(){
        while (true){
            System.out.print("Digite o número da agência: ");
            int numeroAgencia = scanner.nextInt();                
            Agencia agencia = banco.buscarAgencia(numeroAgencia);
            if (agencia != null){
                return agencia;
            }else{
                System.out.print("Agência não encontrada, deseja continuar (S/N): ");
                String escolha = scanner.nextLine();
                if (escolha.toLowerCase().equals("n"))
                    break;
            }            
        }
        return null;
    }
}
