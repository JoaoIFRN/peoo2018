/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.peoo.teste2unidade;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author joaon
 */
public class Principal {

    private Scanner scanner = new Scanner(System.in);
    private List<Operadora> operadoras = new ArrayList();
    
    public static void main(String[] args) {
        new Principal().executar();
    }
    
    public void executar(){
        while(true){
            exibirMenu();
            tratarEscolhaMenu();
        }
    }

    public void exibirMenu() {
        System.out.println("### MENU DE OPÇÕES ###");
        System.out.println("1 - Pesquisar vôo a partir de uma cidade de origem e outra de destino; ");
        System.out.println("2 - Listar todos os vôos de uma operadora selecionada pelo usuário; ");
        System.out.println("3 - Cadastrar vôo em operadora;");
        System.out.println("4 - Cadastrar aeronave;");
        System.out.println("5 - Encerrar;");
        System.out.print("Escolha uma opção: ");
    }

    public void tratarEscolhaMenu() {
        int opcao = scanner.nextInt();
        switch (opcao) {
            case 1:
                pesquisarVoo();
                break;
            case 2:
                listarVoosOperadora();
                break;
            case 3:
                cadastrarVooOperadora(); //##########
                break;
            case 4:
                cadastrarAeronave();
                break;            
            case 5:
                System.exit(0);
                break;
        }
    }

    public void pesquisarVoo() {
        System.out.print("Digite a cidade de origem: ");
        String cidadeOrigem = scanner.next();
        System.out.print("Digite a cidade de destino: ");
        String cidadeDestino = scanner.next();
        ArrayList<Voo> voos = pesquisarVoos(cidadeOrigem, cidadeDestino);
        for (Voo voo : voos) {
            System.out.println(voo);
        }

        if (voos.isEmpty()) {
            System.out.println("Não existe voo para este destino e origem!!!");
        }
    }
    
    public void cadastrarAeronave(){
        System.out.print("Nome: ");
        String nome = scanner.next();
        System.out.print("Fabricante: ");
        String fabricante = scanner.next();
        Aeronave aeronave = new Aeronave();
        aeronave.setNome(nome);
        aeronave.setFabricante(fabricante);
        cadastrarAeronave(aeronave);
    }
    
    public void cadastrarAeronave(Aeronave aeronave){
        Aeronave.aeronaves.add(aeronave);
    }
    
    public void cadastrarEmpresa(){
        System.out.print("Nome: ");
        String nome = scanner.next();
        Empresa empresa = new Empresa();
        empresa.setNome(nome);        
        cadastrarEmpresa(empresa);
    }
    
    public void cadastrarEmpresa(Empresa empresa){
        Empresa.empresas.add(empresa);
    }
    
    public void cadastrarAeroporto(){
        System.out.print("Nome: ");
        String nome = scanner.next();
        System.out.print("Cidade: ");
        String cidade = scanner.next();
        System.out.print("Estado: ");
        String estado = scanner.next();
        Aeroporto aeroporto = new Aeroporto();
        aeroporto.setNome(nome);
        aeroporto.setCidade(cidade);
        aeroporto.setEstado(estado);
        cadastrarAeroporto(aeroporto);                
    }
    
    public void cadastrarAeroporto(Aeroporto aeroporto){
        Aeroporto.aeroportos.add(aeroporto);
    }

    public ArrayList<Voo> pesquisarVoos(String cidadeOrigem, String cidadeDestino) {
        ArrayList<Voo> voos = new ArrayList();
        for (Operadora operadora : operadoras) {
            for (Voo voo : operadora.getVoos()) {
                if (voo.getDestino().getCidade().equals(cidadeDestino)
                        && voo.getOrigem().getCidade().equals(cidadeOrigem)) {
                    voos.add(voo);
                }
            }
        }
        return voos;
    }

    public Operadora buscarOperadora(int codigoOperadora) {
        for (Operadora operadora : operadoras) {
            if (operadora.getId() == codigoOperadora) {
                return operadora;
            }
        }
        return null;
    }

    public void listarVoosOperadora() {
        Operadora operadora = solicitarCodigoOperadora();
        if (operadora == null) {
            System.out.println("Operadora não encontrada!!!");
        } else {
            for (Voo voo : operadora.getVoos()) {
                System.out.println(voo);
            }
        }
    }
    
    public Operadora solicitarCodigoOperadora(){
        System.out.print("Informe o código da operadora: ");
        int codigoOperadora = scanner.nextInt();
        return buscarOperadora(codigoOperadora);
    }
    
    public Empresa solicitarEmpresa(){
        System.out.print("Empresa: ");
        String nome = scanner.next();
        for (Empresa empresa : Empresa.empresas){
            if (empresa.getNome().equals(nome)){
                return empresa;
            }
        }
        return null;
    }
    
    public Aeronave solicitarAeronave(){
        System.out.print("Nome: ");
        String nome = scanner.next();
        for (Aeronave aeronave : Aeronave.aeronaves){
            if (aeronave.getNome().equals(nome)){
                return aeronave;
            }
        }
        return null;
    }
    
    public Aeroporto solicitarAeroporto(){
        System.out.print("Nome: ");
        String nome = scanner.next();
        for (Aeroporto aeroporto : Aeroporto.aeroportos){
            if (aeroporto.getNome().equals(nome)){
                return aeroporto;
            }
        }
        return null;
    }

    public void cadastrarVooOperadora() {
        Operadora operadora = solicitarCodigoOperadora();
        Empresa empresa = solicitarEmpresa();
        if (empresa == null){
            System.out.println("Empresa não encontrada!!!");
            return;
        }
        Aeronave aeronave = solicitarAeronave();
        if (aeronave == null){
            System.out.println("Aeronave não encontrada!!!");
            return;
        }
        System.out.println("Selecionar aeroporto de destino:");
        Aeroporto aeroportoDestino = solicitarAeroporto();
        if (aeroportoDestino == null){
            System.out.println("Aeroporto não encontrado!!!");
            return;
        }
        System.out.println("Selecionar aeroporto de origem:");
        Aeroporto aeroportoOrigem = solicitarAeroporto();
        if (aeroportoOrigem == null){
            System.out.println("Aeroporto não encontrado!!!");
            return;
        }
        System.out.print("Data: ");
        String data = scanner.next();
        System.out.print("Hora: ");
        String hora = scanner.next();
        
        Voo voo = new Voo();
        voo.setAeronave(aeronave);
        voo.setDestino(aeroportoDestino);
        voo.setOrigem(aeroportoOrigem);
        voo.setEmpresa(empresa);
        voo.setData(data);
        voo.setHora(hora);
        cadastrarVooEmOperadora(voo, operadora);
    }
    
    public void cadastrarVooEmOperadora(Voo voo, Operadora operadora){
        operadora.getVoos().add(voo);
    }

}
