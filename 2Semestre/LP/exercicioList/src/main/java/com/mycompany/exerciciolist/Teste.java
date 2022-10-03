package com.mycompany.exerciciolist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        Scanner scNum = new Scanner(System.in);
        Scanner scText = new Scanner(System.in);

        Integer numeroDigitado = 0;
        Integer id = 0;
        String nomeMedicamento = "";
        Integer quantidadeEstoque = 0;
        Double valorVenda = 0.0;
        List<Medicamento> medicamentos = new ArrayList();

        do {
            System.out.println("Digite 1 para cadastrar medicamento");
            System.out.println("Digite 2 para exibir medicamentos");
            System.out.println("Digite 3 para buscar por nome");
            System.out.println("Digite 4 para sair");
            System.out.println("");
            numeroDigitado = scNum.nextInt();

            if (numeroDigitado == 1) {
                System.out.println("Digite o ID do remedio");
                id = scNum.nextInt();
                System.out.println("Digite o nome do medicamento: ");
                nomeMedicamento = scText.nextLine();
                System.out.println("Digite a quantidade do estoque: ");
                quantidadeEstoque = scNum.nextInt();
                System.out.println("Digite o valor do remedio: ");
                valorVenda = scNum.nextDouble();
                Medicamento novoMedicamento = new Medicamento(id, nomeMedicamento, quantidadeEstoque, valorVenda);
                medicamentos.add(novoMedicamento);

            } else if (numeroDigitado == 2) {
                System.out.println("Medicamentos em estoque");
                for (int i = 0; i < medicamentos.size(); i++) {
                    Medicamento medicamentoDaVez = medicamentos.get(i);

                    System.out.println(medicamentoDaVez);
                }
            } else if (numeroDigitado == 3) {
                String nomeProcurado;
                System.out.println("Digite o nome do medicamento: ");
                nomeProcurado = scText.nextLine();

                for (int i = 0; i < medicamentos.size(); i++) {
                    Medicamento medicamentoDavez = medicamentos.get(i);
                    if (medicamentoDavez.getNomeMedicamento().equals(nomeProcurado)) {
                        System.out.println("Está na lista");
                        System.out.println(medicamentoDavez);
                    } else {
                        System.out.println("Medicamento nao etá na lista.");
                    }

                }
            } else if (numeroDigitado == 4) {
                System.out.println("Obrigada por utilizar!");
            }

        } while (numeroDigitado != 4);

    }

}
