package com.sptech.lista.nivelamento;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer numDigitado;
        
        System.out.println("Digite um numero: ");
        numDigitado = sc.nextInt();
        
        while(numDigitado != 0){
            System.out.println("Continue digitando o programa ainda não fechou.");
            numDigitado = sc.nextInt();
            
        }
        System.out.println("Programa parou.");
    }
}
