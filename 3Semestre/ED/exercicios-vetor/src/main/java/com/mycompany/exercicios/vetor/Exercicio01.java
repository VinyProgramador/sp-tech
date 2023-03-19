package com.mycompany.exercicios.vetor;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numDig = 0;
        int qtdVolta = 0;
        int[] vector = new int[7];
        do {
            for (int i = 0; i < 7; i++) {
                System.out.println("Digite um numero para ser adicionado ao"
                        + "vetor na posição [" + i + "]");
                numDig = sc.nextInt();
                vector[i] = numDig;
                qtdVolta++;
            }
        } while (qtdVolta < 7);

        System.out.println("Mostrando vetor na ordem que foram inseridos:");
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }

        System.out.println("Mostrando vetor de trás para frente:");
        for (int i = vector.length - 1; i >= 0; i--) {
            System.out.println(vector[i]);
        }
        sc.close();
    }
}
