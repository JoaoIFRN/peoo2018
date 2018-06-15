/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.peoo.listapoo;

import java.util.ArrayList;

/**
 *
 * @author joaon
 */
public class Curso {
    
    private String nome;
    private String descricao;
    private ArrayList<Aluno> alunos = new ArrayList();

    public void inserirAluno(Aluno aluno){
        this.alunos.add(aluno);
    }
    
    public Aluno buscarAluno(String nome){
        for (Aluno aluno : alunos){
            if (aluno.getNome().equals(nome)){
                return aluno;
            }
        }
        return null;
    }
    
    public void listarAlunos(){
        /*
        for (int i=0;i<this.alunos.size();i++){
            System.out.println(this.alunos.get(i));
        }
        */
        for (Aluno aluno : this.alunos){
            System.out.println(aluno);
        }
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }
    
    
    
}
