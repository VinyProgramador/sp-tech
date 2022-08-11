package com.sptech.lista.de.exercicios.lp;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double valorPdtUnitario = 0.0;
        Double valorPagoCli = 0.0;

        System.out.println("Digite o valor unitario do produto: ");
        valorPdtUnitario = sc.nextDouble();
        System.out.println("Valor pago pelo cliente:");
        valorPagoCli = sc.nextDouble();
        System.out.println("Seu troco será de R$" + (valorPagoCli - valorPdtUnitario));
        sc.close();
    }
}
