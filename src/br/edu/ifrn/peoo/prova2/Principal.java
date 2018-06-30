/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.peoo.prova2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author joaon
 */
public class Principal {

    private List<Curso> cursos = new ArrayList();
    private Scanner entrada = new Scanner(System.in);

    public void executar() {
        while (true) {
            exibirControlarEscolhaMenu();
        }
    }

    public void exibirControlarEscolhaMenu() {
        System.out.println("###### Menu principal ######");
        System.out.println("1 - Cadastrar curso;");
        System.out.println("2 - Cadastrar disciplina;");
        System.out.println("3 - Excluir curso;");
        System.out.println("4 - Listar cursos;");
        System.out.println("5 - Listar todos os alunos de todos os cursos;");
        System.out.println("6 - Cadastrar aluno em disciplina de curso;");
        System.out.println("7 - Finalizar;");
        System.out.print("Opção: ");
        int opcao = entrada.nextInt();
        switch (opcao) {
            case 1:
                cadastrarCurso();
                break;
            case 2:
                cadastrarDiscplina();
                break;
            case 3:
                excluirCurso();
                break;
            case 4:
                listarCursos();
                break;
            case 5:
                listarAlunosCursos();
                break;
            case 6:
                cadastrarAlunoEmDisciplinaDoCurso();
                break;            
            case 7:
                System.exit(0);
                break;
        }
    }
    
    private void cadastrarDiscplina(){
        
        System.out.print("Código do curso: ");        
        int codigoCurso = entrada.nextInt();
        if (!cursos.contains(new Curso(codigoCurso))){
            System.out.println("Curso não encontrado!!!");
            return;
        }
        Curso curso = cursos.get(cursos.indexOf(new Curso(codigoCurso)));
        
        System.out.print("Código da discilina: ");
        int codigoDisciplina = entrada.nextInt();
        System.out.print("Código da discilina: ");
        String nomeDisciplina = entrada.next();
        System.out.print("Carga horária da discilina: ");
        int cargaHoraria = entrada.nextInt();
        System.out.print("Número de alunos máximo da discilina: ");
        int numeroMaximo = entrada.nextInt();
        
        Disciplina disciplina = new Disciplina();
        disciplina.setCodigo(codigoDisciplina);
        disciplina.setNome(nomeDisciplina);
        disciplina.setCargaHoraria(cargaHoraria);
        disciplina.setNumeroMaximo(numeroMaximo);
        
        curso.getDisciplinas().add(disciplina);
    }
    
    private void cadastrarAlunoEmDisciplinaDoCurso(){
        System.out.print("Código do curso: ");        
        int codigoCurso = entrada.nextInt();
        if (!cursos.contains(new Curso(codigoCurso))){
            System.out.println("Curso não encontrado!!!");
            return;
        }
        Curso curso = cursos.get(cursos.indexOf(new Curso(codigoCurso)));
        
        System.out.print("Código da disciplina: ");        
        int codigoDisciplina = entrada.nextInt();
        if (!curso.getDisciplinas().contains(new Disciplina(codigoDisciplina))){
            System.out.println("Disciplina não encontrada!!!");
            return;
        }
        
        Disciplina disciplina = curso.getDisciplinas().get(curso.getDisciplinas().indexOf(codigoDisciplina));
        
        System.out.print("Código do aluno: ");
        int codigoAluno = entrada.nextInt();
        System.out.print("Nome do aluno: ");
        String nomeAluno = entrada.next();
        System.out.print("Email do aluno: ");
        String emailAluno = entrada.next();
        
        Aluno aluno = new Aluno();
        aluno.setCodigo(codigoAluno);
        aluno.setNome(nomeAluno);
        aluno.setEmail(emailAluno);
        
        cadastrarAlunoEmDisciplinaDoCurso(aluno, curso, disciplina);        
    }
    
    private void cadastrarAlunoEmDisciplinaDoCurso(Aluno aluno, Curso curso, Disciplina disciplina){
        if (cursos.contains(curso)){
            if (curso.getDisciplinas().contains(disciplina)){
                disciplina.getAlunos().add(aluno);
            }
        }
    }

    private void listarAlunosCursos() {
        for (Curso curso : cursos) {
            for (Disciplina disciplina : curso.getDisciplinas()) {
                for (Aluno aluno : disciplina.getAlunos()) {
                    System.out.println(aluno);
                }
            }
        }
    }

    private void listarCursos() {
        for (Curso curso : cursos) {
            System.out.println(curso);
        }
    }

    private void excluirCurso() {
        System.out.print("Código curso: ");
        int codigoCurso = entrada.nextInt();
        excluirCurso(codigoCurso);
    }

    private void excluirCurso(int codigoCurso) {
        cursos.remove(new Curso(codigoCurso));
    }

    private void cadastrarCurso() {
        System.out.print("Código do curso: ");
        int codigoCurso = entrada.nextInt();
        System.out.print("Nome do curso: ");
        String nomeCurso = entrada.next();
        System.out.print("Carga horária do curso: ");
        int cargaHoraria = entrada.nextInt();
        Curso curso = new Curso();
        curso.setCodigo(codigoCurso);
        curso.setNome(nomeCurso);
        curso.setCargaHoraria(cargaHoraria);
        cursos.add(curso);
    }
}
