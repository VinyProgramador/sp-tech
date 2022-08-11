package com.sptech.lista.de.exercicios.lp;

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Double num1 = 0.0;
        Double num2 = 0.0;

        System.out.println("Digite um número: ");
        num1 = sc.nextDouble();
        System.out.println("Dgite novamente outro núnmero: ");
        num2 = sc.nextDouble();

        System.out.println("Resultado da soma: " + (num1 + num2));
        System.out.println("Resultado da subtração: " + (num1 - num2));
        System.out.println("Resultado da multiplicação: " + (num1 * num2));
        System.out.println("Resuçtado da divisão: " + (num1 / num2));
        sc.close();
    }
}
