package com.sptech.lista.de.exercicios.lp;

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double salarioBruto = 0.0;
        Double descontoDiario = 0.0;
        System.out.println("Digite seu salario bruto: ");
        salarioBruto = sc.nextDouble();
        Double descInss = (salarioBruto * 10) / 100;
        Double descIr = (salarioBruto * 20) / 100;
        System.out.println("Quanto custa sua ida e volta para casa: ");
        descontoDiario = sc.nextDouble();

        descontoDiario = descontoDiario * 22;
        Double descontos = descontoDiario + descIr + descInss;

        System.out.println("Seu salário bruto é R$ " + salarioBruto + " ,tem um total de R$" + (descontos) + " em descontos\n"
                + "e receberá um líquido de R$" + (salarioBruto - descontos));
        sc.close();
    }
}
