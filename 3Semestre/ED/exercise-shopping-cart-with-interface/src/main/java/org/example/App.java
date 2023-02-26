package org.example;

import java.util.Scanner;

//Nome: Vinicius A Nunes
//RA: 01221125
public class App {
    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        Scanner scNl = new Scanner(System.in);
        Scanner scDb = new Scanner(System.in);
        int numTyped;
        Cart c1 = new Cart();

        System.out.println("\n" +
                " __      ___                _____ _                 \n" +
                " \\ \\    / (_)              / ____| |                \n" +
                "  \\ \\  / / _ _ __  _   _  | (___ | |_ ___  _ __ ___ \n" +
                "   \\ \\/ / | | '_ \\| | | |  \\___ \\| __/ _ \\| '__/ _ \\\n" +
                "    \\  /  | | | | | |_| |  ____) | || (_) | | |  __/\n" +
                "     \\/   |_|_| |_|\\__, | |_____/ \\__\\___/|_|  \\___|\n" +
                "                    __/ |                           \n" +
                "                   |___/                            \n");

        do {
            System.out.println("1. Adicionar Livro");
            System.out.println("2. Adicionar DVD");
            System.out.println("3. Adicionar Serviço");
            System.out.println("4. Exibir itens do carrinho");
            System.out.println("5. Exibir Vanda Total");
            System.out.println("6. Fim");

            numTyped = sc1.nextInt();

            switch (numTyped) {
                case 1:
                    System.out.println("Digite o código:");
                    Integer code = sc1.nextInt();
                    System.out.println("Digite o preço:");
                    Double priceCost = scDb.nextDouble();
                    System.out.println("Digite o nome do livro:");
                    String name = scNl.nextLine();
                    System.out.println("Digite o nome do autor:");
                    String author = scNl.nextLine();
                    System.out.println("Digite o isbn:");
                    String isbn = scNl.nextLine();

                    c1.addSaleable(new Book(code, priceCost, name, author, isbn));
                    System.out.println("Livro cadastrado com Sucesso!");
                    break;
                case 2:
                    System.out.println("Digite o código:");
                    Integer code2 = sc1.nextInt();
                    System.out.println("Digite o preço:");
                    Double priceCost2 = scDb.nextDouble();
                    System.out.println("Digite o nome do DVD:");
                    String name2 = scNl.nextLine();
                    System.out.println("Digite o nome da Gravadora:");
                    String recordCompany = scNl.nextLine();
                    c1.addSaleable(new Dvd(code2, priceCost2, name2, recordCompany));
                    System.out.println("DVD cadastrado com Sucesso!");
                    break;
                case 3:
                    System.out.println("Digite a descição do serviço:");
                    String description = scNl.nextLine();
                    System.out.println("Digite o código:");
                    Integer code3 = sc1.nextInt();
                    System.out.println("Digite a quantidadede horas:");
                    Double amountHours = scDb.nextDouble();
                    System.out.println("Digite o valor da hora:");
                    Double hourValue = scDb.nextDouble();
                    c1.addSaleable(new Service(description, code3, amountHours, hourValue));
                    System.out.println("Serviço adionado com Sucesso!");
                    break;
                case 4:
                    System.out.println("Exibindo itens do carrinho:");
                    c1.displayItemsCarts();
                    break;
                case 5:
                    System.out.println("Exibindo total das vendas:");
                    System.out.println(c1.calculateTotalSale());
                    ;
                    break;
                case 6:
                    System.out.println("Até mais volte sempre!");
                    break;
                default:
                    System.out.println("Opção Inválida..");
            }

        }
        while (numTyped != 6);
    }
}