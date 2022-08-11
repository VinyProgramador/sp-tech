package com.sptech.lista.de.exercicios.lp;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String login;
        String senha;
        Integer qtdErros = 0;
        System.out.println("Digite seu login: ");
        login = sc.nextLine();
        System.out.println("Digite sua senha: ");
        senha = sc.nextLine();
        System.out.println("Quantas vezes voce aceita errar sua senha sem ser bloqueado?");
        qtdErros = sc.nextInt();

        sc.close();

        if (qtdErros == 0) {
            System.err.println("Voce não pode errar zero vezes pois assim não haverá tentativas.");
        } else {
            System.out.println("Seu login é " + login + " e sua senha é " + senha + ".\n"
                    + "Você tem " + qtdErros + " tentativas antes de ser bloqueado");
        }
    }
}
