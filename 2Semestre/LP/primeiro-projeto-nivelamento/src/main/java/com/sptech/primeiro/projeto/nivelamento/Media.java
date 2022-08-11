package com.sptech.primeiro.projeto.nivelamento;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Integer nota1;
        Integer nota2;
        
        System.out.println("Digite sua primeira nota: ");
        nota1 = sc.nextInt();
        System.out.println("Digite sua segunda nota: ");
        nota2 = sc.nextInt();
        
        if((nota1+nota2)/2>6){
            System.out.println("Passou de ano!");
        }
        else{
            System.out.println("Se fudeu! não passou.");
        }
        sc.close();
    }
}
