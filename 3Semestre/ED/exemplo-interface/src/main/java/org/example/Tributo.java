package org.example;

import java.util.ArrayList;
import java.util.List;

public class Tributo {
    List<Tributavel> lista;

    public Tributo() {
        lista = new ArrayList<>();
    }

    public void adicionaTributavel(Tributavel t){
        lista.add(t);
    }

    public void exibeTodos(){
        for (Tributavel t: lista){
            System.out.println(t);
        }
    }

    public Double calculaTotalTributo(){
        Double valorTotal = 0.0;

        for (int i = 0; i < lista.size(); i++) {
            valorTotal+= lista.get(i).getValorTributo();
        }
        return valorTotal;
    }
}

