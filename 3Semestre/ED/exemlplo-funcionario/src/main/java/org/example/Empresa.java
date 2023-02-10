package org.example;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    //Atributo implicito
    List<Funcionario> lista;

    //Contrutor


    public Empresa() {
        lista = new ArrayList<>();
    }

    //Métodos

    public void adicionaFunc(Funcionario f){
        lista.add(f);
    }

    public void exibeTodos(){
        for (Funcionario f : lista){
            System.out.println(f);
        }
    }

    public void exibeTotalSalario(){
        Double totalFinal = 0.0;
        for (Funcionario f : lista){
            totalFinal+= f.calcSalario();
        }
        System.out.printf("Total dos salários: "+totalFinal+ "R$");
    }

    public void exibeHoristas(){
        for (Funcionario f : lista){
            if (f instanceof Horista){
                System.out.println(f);
            }
        }
    }
}
