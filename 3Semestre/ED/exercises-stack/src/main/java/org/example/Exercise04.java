package org.example;
//Nome: Vinicius A Nunes
//RA: 01221125
public class Exercise04 {
    public static void main(String[] args) {
        String phrase = "A pilha do gato";
        StackObj<Character> pilha = new StackObj<>(phrase.length());

        for (int i = 0; i < phrase.length(); i++) {
            char c = phrase.charAt(i);
            pilha.push(c);
        }

        while (!pilha.isEmpty()) {
            char c = pilha.pop();
            System.out.print(c);
        }
    }
}


