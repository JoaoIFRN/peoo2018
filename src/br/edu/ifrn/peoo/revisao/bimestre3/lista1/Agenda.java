/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.peoo.revisao.bimestre3.lista1;

import javax.swing.JOptionPane;

/**
 *
 * @author joaon
 */
public class Agenda {
    
    private Pessoa [] pessoas;
    private int numeroAmigos;
    private int numeroConhecidos;
    
    public Agenda(int numeroPessoas){
        pessoas = new Pessoa[numeroPessoas];
        for (int i=0;i<pessoas.length;i++){
            if ((1 + (int) (Math.random() * 2)) == 1){
                pessoas[i] = new Amigo();
                numeroAmigos++;
            }else {
                pessoas[i] = new Conhecido();
                numeroConhecidos++;
            }
        }
    }
    
    public void addInformacoes(){
        for (Pessoa pessoa : pessoas){
            if (pessoa instanceof Amigo){
                String nome = JOptionPane.showInputDialog("[Amigo] Nome:");
                int idade = Integer.parseInt(JOptionPane.
                        showInputDialog("[Amigo] Idade:"));
                String data = JOptionPane.showInputDialog("[Amigo] Data:");
                pessoa.setNome(nome);
                pessoa.setIdade(idade);
                ((Amigo) pessoa).setDataNascimento(data);
            }
            if (pessoa instanceof Conhecido){
                String nome = JOptionPane.showInputDialog("[Conhecido] Nome:");
                int idade = Integer.parseInt(JOptionPane.
                        showInputDialog("[Conhecido] Idade:"));
                String email = JOptionPane.showInputDialog("[Conhecido] Email:");
                pessoa.setNome(nome);
                pessoa.setIdade(idade);
                ((Conhecido) pessoa).setEmail(email);
            }
        }
    }
    
    public void imprimirAniversarios(){
        for (Pessoa pessoa : pessoas){
            if (pessoa instanceof Amigo){
                System.out.println(((Amigo) pessoa).getNome());
                System.out.println(((Amigo) pessoa).getDataNascimento());
                System.out.println("========================");
            }
        }
    }
    
    public void imprimirEmail(){
        for (Pessoa pessoa : pessoas){
            if (pessoa instanceof Conhecido){
                System.out.println(pessoa.getNome());
                System.out.println(((Conhecido) pessoa).getEmail());
                System.out.println("========================");
            }
        }
    }

    public Pessoa[] getPessoas() {
        return pessoas;
    }

    public void setPessoas(Pessoa[] pessoas) {
        this.pessoas = pessoas;
    }

    public int getNumeroAmigos() {
        return numeroAmigos;
    }

    public void setNumeroAmigos(int numeroAmigos) {
        this.numeroAmigos = numeroAmigos;
    }

    public int getNumeroConhecidos() {
        return numeroConhecidos;
    }

    public void setNumeroConhecidos(int numeroConhecidos) {
        this.numeroConhecidos = numeroConhecidos;
    }
    
    
    
}
