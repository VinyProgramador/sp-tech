package ex05;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        CalculaPesoIdeal pessoa = new CalculaPesoIdeal();
        Scanner scString = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        String sexo;
        Double altura;
        System.out.println("Digite seu sexo F para feminino, M para masculino: ");
        sexo = scString.nextLine();
        System.out.println("Digite sua altura: ");
        altura = sc.nextDouble();
        Double pesoUser = pessoa.calcPeso(sexo.toUpperCase(), altura);
        System.out.println(String.format("Seu peso ideal é de: %.2f", pesoUser));
        
    }
    
}
