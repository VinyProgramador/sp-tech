package org.example;

import java.util.Scanner;

//Nome: Vinicius A Nunes
//RA: 01221125
public class App {
    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);


        System.out.println("\n" +
                " __      ___                _____ _                 \n" +
                " \\ \\    / (_)              / ____| |                \n" +
                "  \\ \\  / / _ _ __  _   _  | (___ | |_ ___  _ __ ___ \n" +
                "   \\ \\/ / | | '_ \\| | | |  \\___ \\| __/ _ \\| '__/ _ \\\n" +
                "    \\  /  | | | | | |_| |  ____) | || (_) | | |  __/\n" +
                "     \\/   |_|_| |_|\\__, | |_____/ \\__\\___/|_|  \\___|\n" +
                "                    __/ |                           \n" +
                "                   |___/                            \n");

        Integer numTyped = 0;
        Cart c1 = new Cart();

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
                    Double priceCost = sc1.nextDouble();
                    System.out.println("Digite o nome do livro:");
                    String name = sc2.nextLine();
                    System.out.println("Digite o nome do autor:");
                    String author = sc2.next();
                    System.out.println("Digite o isbn:");
                    String isbn = sc1.next();

                    Book b1 = new Book(code, priceCost, name, author, isbn);
                    c1.addSaleable(b1);
                    System.out.println("Livro cadastrado com Sucesso!");
                    break;
                case 2:
                    System.out.println("Digite o código:");
                    Integer code2 = sc1.nextInt();
                    System.out.println("Digite o preço:");
                    Double priceCost2 = sc1.nextDouble();
                    System.out.println("Digite o nome do DVD:");
                    String name2 = sc2.nextLine();
                    System.out.println("Digite o nome da Gravadora:");
                    String recordCompany = sc1.nextLine();
                    Dvd d1 = new Dvd(code2, priceCost2, name2,recordCompany);
                    System.out.println("DVD cadastrado com Sucesso!");
                    break;
                case 4:
                    System.out.println("Exibindo itens do carrinho:");
                    c1.displayItemsCarts();
                    break;

            }

        }
        while (numTyped != 6);
    }
}