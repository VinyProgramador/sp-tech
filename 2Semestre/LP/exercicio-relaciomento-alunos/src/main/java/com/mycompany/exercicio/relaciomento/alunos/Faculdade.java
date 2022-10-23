
package com.mycompany.exercicio.relaciomento.alunos;

import java.util.ArrayList;
import java.util.List;

public class Faculdade {
    private String nome;
    private List<Aluno> alunos;

    public Faculdade(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
    
    
    
    public void matricularAluno(Aluno aluno){
        alunos.add(aluno);
    }
    
    public void cancelarMatricula(String ra){
        for (int i = 0; i <alunos.size(); i++) {
            if (alunos.get(i).getRa().equalsIgnoreCase(ra)) {
                alunos.get(i).setAtivo(false);
                
            }
        }
    }
    
    public void exibirAluno(){
        System.out.println(alunos.toString());
    }
    
    public void exibirAlunoPorSemestre(){
        for (int i = 0; i <alunos.size(); i++) {
            if (alunos.get(i).getRa().equalsIgnoreCase(nome)) {
                System.out.println(alunos.get(i));
            }
        }
    }
    
    public void exibirCancelados(){
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getAtivo()!=true) {
                System.out.println(alunos.get(i));
            }
        }
    }
    

    
}
