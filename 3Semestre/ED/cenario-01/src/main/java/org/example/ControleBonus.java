package org.example;

import java.util.ArrayList;
import java.util.List;

public class ControleBonus {
    private List<FuncionarioBonus> listaDeBonus;

    public ControleBonus() {
        this.listaDeBonus = new ArrayList<>();
    }

    public void adicionaFuncionario(FuncionarioBonus f){
        listaDeBonus.add(f);
    }

    public Double calculaBonus(){
        Double totalBonus = 0.0;
        for (FuncionarioBonus f : listaDeBonus){
            totalBonus += f.pagarBonus();
        }
        return totalBonus;
    }

    public void exibeFuncionarios(){
        for (FuncionarioBonus f : listaDeBonus){
            System.out.println(f.toString());
        }
    }






}
