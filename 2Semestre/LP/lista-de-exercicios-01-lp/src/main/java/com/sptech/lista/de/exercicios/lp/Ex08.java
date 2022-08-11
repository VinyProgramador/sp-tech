package com.sptech.lista.de.exercicios.lp;

import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Double nota1;
        Double nota2;
        String nome;
        System.out.println("Digite seu nome");
        nome = sc.nextLine();
        System.out.println("Digite sua primeira nota: ");
        nota1 = sc.nextDouble();
        System.out.println("Digite sua segunda nota: ");
        nota2 = sc.nextDouble();
        Double media = (nota1 + nota2) / 2;

        System.out.println("Olá," + nome + ". Sua média foi de " + media);

        sc.close();
    }
}
