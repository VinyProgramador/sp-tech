package com.sptech.lista.nivelamento;

import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer numDigitado;
        System.out.println("Digite um numero para ver sua tabuada: ");
        numDigitado = sc.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(numDigitado+"X"+i+"="+numDigitado*i);
        }
    }
}
