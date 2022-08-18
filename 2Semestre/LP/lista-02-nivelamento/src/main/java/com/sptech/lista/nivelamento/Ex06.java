package com.sptech.lista.nivelamento;

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer num1;
        Integer num2;

        System.out.println("Digite a base:");
        num1 = sc.nextInt();
        System.out.println("Digite o expoente");
        num2 = sc.nextInt();
        Integer resultado = num1 * num1;

        while (num1 < 0 || num2 < 0) {
            System.out.println("Considere apenas a entrada de valores inteiros e positivos");
            System.out.println("Digite a base:");
            num1 = sc.nextInt();
            System.out.println("Digite o expoente");
            num2 = sc.nextInt();
        }

        for (int i = 2; i <= num2; i++) {
            resultado *= num1;
        }
        System.out.println(resultado / 2);
    }
}
