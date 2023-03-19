package com.mycompany.exercicios.vetor;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        String[] vector = new String[10];
        Scanner sc = new Scanner(System.in);
        int qtdVolta = 0;
        String nomeDig = "";
        String nomePesquisa = "";
        
        do {            
            for (int i = 0; i < vector.length; i++) {
                System.out.println("Digite um nome para a posição: ["+i+"]");
                nomeDig = sc.nextLine();
                vector[i] = nomeDig;
                qtdVolta++;
            }
        } while (qtdVolta < 10);
        
        System.out.println("Digite um nome qualquer para a pesquisa");
        nomePesquisa = sc.nextLine();
        nomePesquisa = nomePesquisa.toUpperCase();
        
        for (int i = 0; i < vector.length; i++) {
            if (nomePesquisa.equals(vector[i].toUpperCase())) {
                System.out.println("Nome encontrado no índice ["+i+"]");
                return;
            }
        }
        System.out.println("Nome não encontrado");
        
        sc.close();
    }
}
