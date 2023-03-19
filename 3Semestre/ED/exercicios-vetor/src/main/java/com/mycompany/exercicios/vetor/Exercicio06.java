package com.mycompany.exercicios.vetor;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numDia = 0;
        int numMes = 0;
        int numFinal = 0;
        int[] vector = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        do {
            System.out.println("Digite um número do dia de 1 a 31");
            numDia = sc.nextInt();
            if (numDia <= 0 || numDia > 31) {
                System.out.println("Número invalido..");
            }
        } while (numDia <= 0 || numDia > 31);

        do {
            System.out.println("Digite o número do mês de 1 a 12");
            numMes = sc.nextInt();
            if (numMes <= 0 || numMes > 12) {
                System.out.println("Número invalido..");
            }
        } while (numMes <= 0 || numMes > 12);

        for (int i = 0; i < (numMes - 1); i++) {
            numFinal += vector[i];
        }
        numFinal += numDia;
        
        System.out.println("O dia "+numDia+"/"+numMes+" corresponde ao dia "+numFinal+" do ano. ");
        
        sc.close();
    }
}
