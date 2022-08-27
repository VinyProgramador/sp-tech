package ex01;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CalcularMedia aluno = new CalcularMedia();
        Double n1;
        Double n2;
        System.out.println("Digite a primeira nota: ");
        n1 = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        n2 = sc.nextDouble();

        Double media = aluno.media(n1, n2);
        System.out.println(String.format("Sua media foi de: %.2f ", media));

    }

}
