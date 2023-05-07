package org.example;
//Nome: Vinicius A Nunes
//RA: 01221125
public class Exercise01 {
    public static Boolean ehPalindromo(int[] vetor) {
        Stack stack = new Stack(vetor.length);

        for (int i = 0; i < vetor.length; i++) {
            stack.push(vetor[i]);
        }

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] vet1 = {1, 3, 3, 1};
        int[] vet2 = {10, 20, 30, 40};
        int[] vet3 = {1, 2, 3, 2, 1};

        System.out.println("vet1 eh palindromo? " + ehPalindromo(vet1));
        System.out.println("vet2 eh palindromo? " + ehPalindromo(vet2));
        System.out.println("vet3 eh palindromo? " + ehPalindromo(vet3));
    }
}
