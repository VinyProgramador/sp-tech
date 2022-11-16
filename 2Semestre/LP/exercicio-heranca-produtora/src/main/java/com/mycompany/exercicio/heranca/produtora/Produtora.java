/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio.heranca.produtora;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aluno
 */
public class Produtora {

    private String nome;
    private Integer vagas;
    private List<Ator> atores;

    public Produtora(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
        this.atores = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getVagas() {
        return vagas;
    }

    public List<Ator> getAtores() {
        return atores;
    }

    public void setAtores(List<Ator> atores) {
        this.atores = atores;
    }

    public Boolean existePorNome(String nomeDev) {
        for (int i = 0; i < atores.size(); i++) {
            if (atores.get(i).nome.equalsIgnoreCase(nomeDev)) {
                System.out.println("Ator foi encontrado!");
                return true;
            }
        }
        return false;
    }

    public void contratar(Ator ator) {
        if (vagas <= 0) {
            System.out.println("Vagas indisponiveis!");
        } else {
            atores.add(ator);
        }
    }

    public Integer getQuantidadeAtores() {
        return atores.size();
    }

    public Integer getQuantidadeProtagonista() {
        Integer qtdProtagonista = 0;
        for (Ator ator : atores) {
            if (ator instanceof Protagonista) {
                qtdProtagonista++;
            }
        }
        return qtdProtagonista;
    }

    public Double getTotalSalarios() {
        Double valorTdsSalarios = 0.0;

        for (int i = 0; i < atores.size(); i++) {
            valorTdsSalarios += atores.get(i).getSalario();
        }

        return valorTdsSalarios;
    }
    
        
    public Ator buscarAtorPorNome(String NomeAtor){
        for (int i = 0; i < atores.size(); i++) {
            if (atores.get(i).nome.equalsIgnoreCase(nome)) {
                System.out.println("Ator está na Produtora");
                return atores.get(i);
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Produtora{" + "nome=" + nome + ", vagas=" + vagas + ", atores=" + atores + '}';
    }

    
    
}
