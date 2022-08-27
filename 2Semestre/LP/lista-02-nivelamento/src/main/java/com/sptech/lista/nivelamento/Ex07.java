package com.sptech.lista.nivelamento;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Ex07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer firstNum = 0;
        Integer numDigitado, j = 0, l = 0, k = 0;
        Integer randomico;
        System.err.println("Digite um numero: ");
        numDigitado = sc.nextInt();

        for (int i = 1; i <= 200; i++) {
            randomico = ThreadLocalRandom.current().nextInt(0, 101);
            if (j < 1) {
                if (randomico == numDigitado) {
                    firstNum = i;
                    j++;
                }
            }
            if (randomico % 2 == 0) {
                l++;
            }
            if (randomico % 2 == 1) {
                k++;
            }
            System.out.println(i + ": " + randomico);
        }
        
        System.out.println("O numero pela primeira vez na: "+firstNum+"° vez."
        +"\nForam sorteados está qtd de numeros pares: "+l+"\n"
        +"E foram sorteados está qtd de numeros impares: "+k);
    }
}
