/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.peoo.revisao.bimestre3.lista2;

import java.util.Scanner;

/**
 *
 * @author joaon
 */
public class LocadoraUI implements ILocadora {
    
    private Locadora locadora = new Locadora();
    private Scanner scanner = new Scanner(System.in);
    
    @Override
    public void cadastrarCD() {
        CD cd = new CD();
        System.out.print("Título: ");
        cd.setTitulo(scanner.nextLine());
        System.out.print("Categoria: ");
        cd.setCategoria(scanner.nextLine());
        System.out.print("Gravadora: ");
        cd.setGravadora(scanner.nextLine());
        locadora.inserir(cd);
    }

    @Override
    public void cadastrarDVD() {
        DVD dvd = new DVD();
        System.out.print("Título: ");
        dvd.setTitulo(scanner.nextLine());
        System.out.print("Categoria: ");
        dvd.setCategoria(scanner.nextLine());
        System.out.print("Região: ");
        dvd.setRegiao(scanner.nextInt());
        locadora.inserir(dvd);
    }

    @Override
    public void listarMidiasDisponiveis() {
        System.out.println(locadora.listar());
    }

    @Override
    public void alugarMidia() {
        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        try {
            locadora.alugar(titulo);
        } catch (Exception ex) {
            System.out.println(ex.getMessage()); 
        } 
    }

    @Override
    public void devolverMidia() {
        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        try {
            locadora.devolver(titulo);
        } catch (Exception ex) {
            System.out.println(ex.getMessage()); 
        }
    }

    @Override
    public void exibirNumeroCDs() {
        System.out.println(locadora.getNumeroCDs());
    }

    @Override
    public void exibirNumeroDVDs() {
        System.out.println(locadora.getNumeroDVDs());
    }
    
    public void exibirTratarMenu(){
        System.out.println("Menu de opções");
        System.out.println("1 - Cadastrar CD");
        System.out.println("2 - Cadastrar DVD");
        System.out.println("3 - Alugar mídia");
        System.out.println("4 - Devolver mídia");
        System.out.println("5 - Exibir mídias disponíveis");
        System.out.println("6 - Exibir número de CDs");
        System.out.println("7 - Exibir número de DVDs");
        System.out.println("8 - Sair");
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();
        switch(opcao){
            case 1:
                cadastrarCD();
                break;
            case 2:
                cadastrarDVD();
                break;
            case 3:
                alugarMidia();
                break;
            case 4:
                devolverMidia();
                break;
            case 5:
                listarMidiasDisponiveis();
                break;
            case 6:
                exibirNumeroCDs();
                break;
            case 7:
                exibirNumeroDVDs();
                break;
            case 8:
                System.exit(0);
                break;
        }
    }
    
    public void rodar(){
        while (true)
            exibirTratarMenu();
    }
    
    public static void main(String[] args) {
        new LocadoraUI().rodar();
    }
    
}
