package org.example;

public class BubbleSort {
    public static void main(String[] args) {
        int[] vector = {65, 387, 837, 88, 99, 8, 5, 7, 1};

        System.out.println("\n\nDesordenado: ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]+" ");
        }

        int auxiliar;
        for (int i = 0; i < vector.length - 1; i++) {
            for (int j = 1; j < vector.length - i; j++) {
                if (vector[j-1] > vector[j]){
                    auxiliar = vector[j];
                    vector[j] = vector[j-1];
                    vector[j-1] = auxiliar;
                }
            }
        }

        System.out.println("\n\nOrdenado: ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]+" ");
        }
    }

}
