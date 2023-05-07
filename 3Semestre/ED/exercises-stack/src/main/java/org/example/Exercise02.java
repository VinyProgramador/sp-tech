package org.example;
//Nome: Vinicius A Nunes
//RA: 01221125
public class Exercise02 {
    public static void converteParaBinario(int decimal) {
        Stack stack = new Stack(decimal);

        while (decimal > 0) {
            int resto = decimal % 2;
            stack.push(resto);
            decimal /= 2;
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }

    public static void main(String[] args) {
        int numero = 9;
        System.out.print("Número " + numero + " - representação em binário: ");
        converteParaBinario(numero);
        System.out.println();

        numero = 12;
        System.out.print("Número " + numero + " - representação em binário: ");
        converteParaBinario(numero);
        System.out.println();

        numero = 32;
        System.out.print("Número " + numero + " - representação em binário: ");
        converteParaBinario(numero);
        System.out.println();
    }
}
