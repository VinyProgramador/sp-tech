package com.sptech.lista.de.exercicios.lp;

import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer tempoAquecimento;
        Integer tempoAerobicos;
        Integer tempoMusculao;

        System.out.println("Tempo em minutos que passou se aquecendo: ");
        tempoAquecimento = sc.nextInt();
        System.out.println("Tempo em minutos Aerobicos: ");
        tempoAerobicos = sc.nextInt();
        System.out.println("Tempo em minutos que passou na muculação: ");
        tempoMusculao = sc.nextInt();

        Integer tempoGasto = tempoAerobicos + tempoAquecimento + tempoMusculao;

        Integer calAqc = tempoAquecimento * 12;
        Integer calAer = tempoAerobicos * 20;
        Integer calMusc = tempoMusculao * 25;

        Integer gastoCalororias = (calAqc + calAer + calMusc);

        System.out.println("Olá, Jorge.\n"
                + "Você fez um total de " + tempoGasto + " minutos de exercícios e perdeu cerca de " + gastoCalororias + " calorias");

        sc.close();
    }
}
