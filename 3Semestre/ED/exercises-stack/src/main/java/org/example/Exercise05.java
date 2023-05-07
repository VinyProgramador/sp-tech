package org.example;
//Nome: Vinicius A Nunes
//RA: 01221125
import java.util.Stack;
public class Exercise05 {
    public static boolean ehPalindromo(String cadeia) {
        String caracteres = cadeia.replaceAll("[^a-zA-Z]", "").toLowerCase();
        Stack<Character> pilha = new Stack<>();

        for (int i = 0; i < caracteres.length(); i++) {
            char c = caracteres.charAt(i);
            pilha.push(c);
        }

        for (int i = 0; i < caracteres.length(); i++) {
            char c = caracteres.charAt(i);
            if (c != pilha.pop()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String frase = "Anotaram a data da maratona";
        boolean palindromo = ehPalindromo(frase);

        if (palindromo) {
            System.out.println("A frase é um palíndromo.");
        } else {
            System.out.println("A frase não é um palíndromo.");
        }
    }
}

