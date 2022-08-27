package ex02;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        ClassesSociais classeUser = new ClassesSociais();
        Scanner sc = new Scanner(System.in);
        Double rendaUser = 0.0;
        System.out.println("Digite sua renda: ");
        rendaUser = sc.nextDouble();
        Double quantidadeDeSalarios = classeUser.qtdSalarios(rendaUser);
        System.out.println(String.format("Voce recebe aproximadamente: %.2f salarios minimos", quantidadeDeSalarios));
    }

}
