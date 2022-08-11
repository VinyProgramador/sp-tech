package com.sptech.primeiro.projeto.nivelamento;

import java.util.Locale;
import java.util.Scanner;

public class LeituraEscrita {
    public static void main(String[] args) {
        //Quando usamos o new estamos instanciando
        Scanner sc = new Scanner(System.in); 
        String nome;
        Integer idade;
        Double altura;
        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();
        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();
        System.out.println("Digite sua altura: ");
        altura = sc.nextDouble();
        System.out.println("Verifiquei aqui e seu nome é: "+nome+",\n Sua altura é de:"+altura+" e "
                + "sua idade é: "+idade);
        sc.close();
    }
}
