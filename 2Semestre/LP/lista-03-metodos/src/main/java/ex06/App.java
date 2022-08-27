package ex06;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VerificarPrimo verNum = new VerificarPrimo();
        Integer numDigitado = 0;

        while (numDigitado >= 0) {
            System.out.println("Digite para ver se é primo");
            numDigitado = sc.nextInt();
            verNum.VerficarNumero(numDigitado);
        }
        System.out.println("Programa terminou!");
    }

}
