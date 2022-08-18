package com.sptech.lista.nivelamento;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Ex01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer numeroDigitado;
        Integer randomico = ThreadLocalRandom.current().nextInt(0, 11);
        System.out.println("Digite um numero entre 0 e 10.");
        numeroDigitado = sc.nextInt();

        for (int i = 0; numeroDigitado != randomico; i++) {
            System.out.println("Errou numero digitado era: " + randomico);
            numeroDigitado = sc.nextInt();
            randomico = ThreadLocalRandom.current().nextInt(0, 11);
            if (numeroDigitado == randomico && i <= 3) {
                System.out.println("Acertou, Você é MUITO sortudo");
            } else if (numeroDigitado == randomico && 1 >=4) {
                System.out.println("Acertou, Você é sortudo");
            } else if (numeroDigitado == randomico && i>10) {
                System.out.println("É melhor você parar de apostar e ir trabalhar, quantidade de vezes tentadas: "+i);
            }
        }

    }
}
