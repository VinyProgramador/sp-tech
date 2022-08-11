package com.sptech.lista.de.exercicios.lp;

import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Double limitePeso = 0.0;
        Integer limitePessoas = 0;
        Double numPriPessoa = 0.0;
        Double numSegPessoa = 0.0;
        Double numTerPessoa = 0.0;

        System.out.println("Limite de peso no elevador: ");
        limitePeso = sc.nextDouble();
        System.out.println("Limite de pessoas no elevador: ");
        limitePessoas = sc.nextInt();
        System.out.println("Peso da primeira pessoa que entrou: ");
        numPriPessoa = sc.nextDouble();
        System.out.println("Peso da segunda pessoa que entrou: ");
        numSegPessoa = sc.nextDouble();
        System.out.println("Peso da terceira pessoa que entrou: ");
        numTerPessoa = sc.nextDouble();
        Double pesoTotal = numPriPessoa + numSegPessoa + numTerPessoa;
        System.out.println("Entraram 3 pessoas no elevador, no qual cabem " + limitePessoas + " pessoas.\n"
                + "O peso total no elevador é de " + pesoTotal + ", sendo que ele suporta " + limitePeso);

        sc.close();
    }

}
