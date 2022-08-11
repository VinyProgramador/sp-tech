package com.sptech.lista.de.exercicios.lp;

import java.util.Scanner;

public class Ex09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        Integer anoNasc;
        System.out.println("Digite seu nome");
        nome = sc.nextLine();
        System.out.println("Olá " + nome + ", Qual o ano de seu nascimento?");
        anoNasc = sc.nextInt();
        System.out.println("Em 2030 você terá " + (2030 - anoNasc) + " anos.");

        sc.close();
    }
}
