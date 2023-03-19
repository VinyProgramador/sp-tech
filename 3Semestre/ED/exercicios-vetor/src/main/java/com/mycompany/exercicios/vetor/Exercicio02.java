package com.mycompany.exercicios.vetor;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        int[] vector = new int[10];
        Scanner sc = new Scanner(System.in);
        int qtdVolta = 0;
        int numDig = 0;
        int media = 0;
        
        do {            
            for (int i = 0; i < vector.length; i++) {
                System.out.println("Digite um numero para a posição ["+i+"] do vetor");
                 numDig = sc.nextInt();
                 vector[i] = numDig;
                 qtdVolta++;
            }
        } while (qtdVolta < 10);
                
        for (int i = 0; i < vector.length; i++) {
            media = media += vector[i];
        }
        
        System.out.println("Media: " + media/vector.length);
        media = media/vector.length;
        
        System.out.println("Mostrando números no vector que estão acima da média:");
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > media) {
                System.out.println(vector[i]+"["+i+"]");
            }
        }
        sc.close();
    }
}
