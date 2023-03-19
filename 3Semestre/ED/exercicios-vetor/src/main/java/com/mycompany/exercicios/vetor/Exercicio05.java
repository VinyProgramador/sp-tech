package com.mycompany.exercicios.vetor;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        String[] vector01 = new String[5];
        int[] vector02 = new int[5];
        String carroDigitado;
        int rendimentoDig = 0;
        int qtdVoltas = 0;
        int aux = 0;
        int aux2 = 0;        
        do {            
            for (int i = 0; i < vector01.length; i++) {
                System.out.println("Digite o nome do carro da posição ["+i+"]");
                carroDigitado = sc.nextLine();
                vector01[i] = carroDigitado;
                qtdVoltas++;
            }
        } while (qtdVoltas < 5);
        
        qtdVoltas = 0;
        
        do {            
            for (int i = 0; i < vector02.length; i++) {
                System.out.println("Digite o rendimeno do carro na posição ["+i+"]");
                rendimentoDig = sc.nextInt();
                vector02[i] = rendimentoDig;
                qtdVoltas++;
            }
        } while (qtdVoltas < 5);
        
        System.out.println("Analisando o carro com maior rendimento...");
        
        for (int i = 0; i < vector02.length; i++) {
            if (aux < vector02[i]) {
                aux = vector02[i];
                aux2++;
            }
        }
        
        aux = aux - 1;
        
        System.out.println("O carro mais economico é o: "+vector01[aux2-1]+","
                + " com valor de rendimento de: "+vector02[aux2-1]);
        
        sc.close();
    }
    
}
