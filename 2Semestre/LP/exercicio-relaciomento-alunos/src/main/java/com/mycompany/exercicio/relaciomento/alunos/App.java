/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio.relaciomento.alunos;

/**
 *
 * @author aluno
 */
public class App {

    public static void main(String[] args) {
        Aluno a1 = new Aluno("100", "viny", 1, true);
        Aluno a2 = new Aluno("101", "mauricio", 1, true);
        Aluno a3 = new Aluno("102", "yuri", 1, true);
        Aluno a4 = new Aluno("103", "manoel", 1, true);
        Aluno a5 = new Aluno("104", "cris", 1, true);
        Aluno a6 = new Aluno("105", "patricio", 1, false);

        Faculdade f1 = new Faculdade("Sp-Viny-Tech");
        
        f1.matricularAluno(a1);
        f1.matricularAluno(a2);
        f1.matricularAluno(a3);
        f1.matricularAluno(a4);
        f1.matricularAluno(a5);
        f1.matricularAluno(a6);
        
        f1.cancelarMatricula("102");
        
        f1.exibirAluno();
        f1.exibirAlunoPorSemestre();
        f1.exibirCancelados();
        
    }

}
