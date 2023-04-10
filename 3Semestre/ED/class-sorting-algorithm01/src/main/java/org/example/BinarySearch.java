package org.example;

import java.util.Scanner;



public class BinarySearch {

    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


        int numBuscado;
        System.out.println("Qual numero voce quer buscar?");
        Scanner sc = new Scanner(System.in);
        numBuscado = sc.nextInt();

        boolean heExists = false;

        int inicio = 0;
        int fim = vetor.length - 1;
        int meio;

        while (inicio <= fim) {
            meio = ((inicio + fim) / 2);
            if (vetor[meio] == numBuscado) {
                System.out.println(meio);
                return;
            } else if (vetor[meio] < numBuscado) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        if (heExists) {
            System.out.println("Achei seu numero na lista!");
        } else {
            System.out.println("numero não encontrado..");
        }

    }

}