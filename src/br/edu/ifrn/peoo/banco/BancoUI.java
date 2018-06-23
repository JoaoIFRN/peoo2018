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
    
    public static void main(String[] args) {
        new BancoUI().executar();
    }
    
    public void executar(){
        while(true){
            exibirMenu();
            tratarEscolhaMenu();
        }
    }
    
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
            case 4:
                realizarDeposito();
            break;   
            case 5:
                realizarSaque();
            break;
            case 6:
                verSaldo();
            break;
            case 7:
                mudarLimiteConta();
            break;
            case 8:
                cancelarConta();
            break;
            case 9:
                System.exit(0);
            break;
        }
    }
    
    public void cancelarConta(){
        Conta conta = buscarConta();
        if (conta == null){
            System.out.println("Conta não encontrada!!!");
            return;
        }
        conta.cancelar();
    }
    
    public void mudarLimiteConta(){
        Conta conta = buscarConta();
        if (conta == null){
            System.out.println("Conta não encontrada!!!");
            return;
        }
        System.out.print("Novo limite: ");
        double valor = scanner.nextDouble();
        conta.setLimite(valor);        
    }
    
    public void verSaldo(){
        Conta conta = buscarConta();
        if (conta == null){
            System.out.println("Conta não encontrada!!!");
            return;
        }
        System.out.println("Saldo: " + conta.getSaldo());
    }
    
    public void realizarDeposito(){
        Conta conta = buscarConta();
        if (conta == null){
            System.out.println("Conta não encontrada!!!");
            return;
        }
        System.out.print("Valor: ");
        double valor = scanner.nextDouble();
        conta.depositar(valor);
    }
    
    public void realizarSaque(){
        Conta conta = buscarConta();
        if (conta == null){
            System.out.println("Conta não encontrada!!!");
            return;
        }
        System.out.print("Valor: ");
        double valor = scanner.nextDouble();
        conta.sacar(valor);
    }
    
    public Conta buscarConta(){
        Agencia agencia = buscarAgencia();
        if (agencia == null){
            System.out.println("AGÊNCIA NÃO ENCONTRADA");
            return null;
        }
        System.out.print("Número da conta: ");
        int numeroConta = scanner.nextInt();        
        for (Conta conta : agencia.getContas()){
            if (conta.getNumero() == numeroConta){
                return conta;
            }
        }
        return null;
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
            String nome = scanner.next();
            Cliente cliente = agencia.buscarCliente(nome);
            if (cliente != null){
                return cliente;
            }else{
                System.out.print("Cliente não encontrado, deseja continuar (S/N): ");
                String escolha = scanner.next();
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
        String nome = scanner.next();
        System.out.print("Digite o email do cliente: ");
        String email = scanner.next();
        System.out.print("Digite o telefone do cliente: ");
        String telefone = scanner.next();
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
                String escolha = scanner.next();
                if (escolha.toLowerCase().equals("n"))
                    break;
            }            
        }
        return null;
    }
}
