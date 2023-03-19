package com.mycompany.exercicios.vetor;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        int[] vector = new int[10];
        Scanner sc = new Scanner(System.in);
        int qtdVolta = 0;
        int numDig = 0;
        int numPesquisa = 0;
        int qtdVezesEncontrada = 0;

        do {
            for (int i = 0; i < vector.length; i++) {
                System.out.println("Digite o número para a posição [" + i + "]");
                numDig = sc.nextInt();
                vector[i] = numDig;
                qtdVolta++;
            }
        } while (qtdVolta < 10);
        System.out.println("Digite um número para pesquisa: ");
        numPesquisa = sc.nextInt();

        for (int i = 0; i < vector.length; i++) {
            if (numPesquisa == vector[i]) {
                qtdVezesEncontrada++;
            }
        }
        
        if (qtdVezesEncontrada>1) {
            System.out.println("o número "+numPesquisa+" ocorre "+qtdVezesEncontrada+" vezes");
        }
        else{
            System.out.println("o número "+numPesquisa+" não ocorre nenhuma vez");
        }
        
        sc.close();
    }
}
