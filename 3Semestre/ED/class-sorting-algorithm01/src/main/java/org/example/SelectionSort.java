package org.example;

public class SelectionSort {
    public static void main(String[] args) {
        int[] vector = {65, 387, 837, 88, 99, 8, 5, 7, 1};

        System.out.println("Desordenado: ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]+" ");
        }

        int posicaoMenor;
        int auxiliar;
        int comparacao = 0;
        int troca = 0;

        for (int i = 0; i < vector.length - 1; i++) {
            posicaoMenor = i;

            for (int j = i + 1; j < vector.length; j++) {
                comparacao++;
                if (vector[j] < vector[posicaoMenor]) {
                    posicaoMenor = j;
                }
            }
            auxiliar = vector[posicaoMenor];
            vector[posicaoMenor] = vector[i];
            vector[i] = auxiliar;
            troca++;

        }

        System.out.println("\nOrdenado: ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]+" ");
        }

        System.out.println("\n\nNumero de comparações: "+comparacao);
        System.out.println("Número de trocas: "+troca);
    }


}
