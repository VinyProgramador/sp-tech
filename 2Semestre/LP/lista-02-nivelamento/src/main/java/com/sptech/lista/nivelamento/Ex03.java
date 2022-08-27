package com.sptech.lista.nivelamento;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome, senha;
        Integer i = 0;
        do {
            if (i > 0) {
                System.out.println("Login e/ou senha inválidos");
            }
            System.out.println("Digite seu usuário: ");
            nome = sc.next();
            System.out.println("Digite sua senha: ");
            senha = sc.next();
            i++;
        } while (!nome.equals("admin") || !senha.equals("#SPtech2022"));
        System.out.println("Login realizado com sucesso");
    }
}
