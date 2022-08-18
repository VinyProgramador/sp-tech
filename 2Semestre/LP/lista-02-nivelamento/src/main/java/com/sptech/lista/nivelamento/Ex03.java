package com.sptech.lista.nivelamento;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nome = "admin";
        String senha = "#SPtech2022";
        
        while (! nome.equals("admin") || ! senha.contentEquals("#SPtech2022")) {            
            System.out.println("Digite seu usuário: ");
            nome = sc.next();
            System.out.println("Digite sua senha: ");
            senha = sc.next();
            System.out.println("Login e/ou senha inválidos");
        }
        System.out.println("Login realizado com sucesso");
        
        
        
    }
}
