package com.sptech.lista.de.exercicios.lp;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer filhosde0a3;
        Integer filhosde4a16;
        Integer filhosde17a18;

        System.out.println("Diga quantos filhos voce tem de 03: ");
        filhosde0a3 = sc.nextInt();
        System.out.println("Diga quatos filhos voce tem de 4 a 16");
        filhosde4a16 = sc.nextInt();
        System.out.println("Diga quantos filhos voce tem de 17 a 18");
        filhosde17a18 = sc.nextInt();

        Integer totalFilhos = filhosde0a3 + filhosde17a18 + filhosde4a16;
        Double valorARecber = (25.12 * filhosde0a3) + (15.88 * filhosde4a16) + (12.44 * filhosde17a18);

        System.out.println("Você tem um total de " + totalFilhos + " filhos e vai receber R$ " + valorARecber + " de bolsa");
        sc.close();

    }
}
