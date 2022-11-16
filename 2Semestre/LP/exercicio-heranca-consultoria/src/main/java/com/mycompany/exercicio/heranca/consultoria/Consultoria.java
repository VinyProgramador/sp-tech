/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio.heranca.consultoria;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aluno
 */
public class Consultoria {

    private String nome;
    private Integer vagas;
    private List<Desenvolvedor> desenvolvedores;

    public Consultoria(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
        this.desenvolvedores = new ArrayList();

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

    public void setVagas(Integer vagas) {
        this.vagas = vagas;
    }

    public List<Desenvolvedor> getDesenvolvedores() {
        return desenvolvedores;
    }


    public Boolean existePorNome(String nomeDev) {
        for (int i = 0; i < desenvolvedores.size(); i++) {
            if (desenvolvedores.get(i).nome.equalsIgnoreCase(nomeDev)) {
                System.out.println("Dev foi encontrado!");
                return true;
            }
        }
        return false;
    }

    public void contratar(Desenvolvedor dev) {
        if (vagas <= 0) {
            System.out.println("Vagas indisponiveis!");
        } else {
            desenvolvedores.add(dev);
        }
    }

    public Integer getQuantidadeDesenvolvedores() {
        return desenvolvedores.size();
    }

    public Integer getQuantidadeDesenvolvedoresMobile() {
        Integer qtdDevMobile = 0;
        for (Desenvolvedor desenvolvedor : desenvolvedores) {
            if (desenvolvedor instanceof DesenvolvedorMobile) {
                qtdDevMobile++;
            }
        }
        return qtdDevMobile;
    }

    public Double getTotalSalarios() {
        Double valorTdsSalarios = 0.0;

        for (int i = 0; i < desenvolvedores.size(); i++) {
            valorTdsSalarios += desenvolvedores.get(i).getSalario();
        }

        return valorTdsSalarios;
    }
    
    public Desenvolvedor buscarDesenvolvedorPorNome(String NomeDev){
        for (int i = 0; i < desenvolvedores.size(); i++) {
            if (desenvolvedores.get(i).nome.equalsIgnoreCase(nome)) {
                System.out.println("Dev está na consultoria");
                return desenvolvedores.get(i);
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s\n"
                + "Quantidade de vagas: %d\n"
                + "Desenvolvedores %s", nome,vagas,desenvolvedores);
    }
    
    
}
