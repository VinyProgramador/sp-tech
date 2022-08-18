package com.sptech.sugundo.nivelamento;

import java.util.Scanner;

/**
 *
 * @author miniguiti
 */
public class SwitchCase {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um dia da semana:");
        Integer dia = leitor.nextInt();
        
        //Também da pra fazer com String!
        switch (dia){
            case 1:                
                System.out.println("Segundou!");
                // Um código longo e complexo
                break;
            case 2:
                System.out.println("Terçou!");
                break;
            case 3:
                System.out.println("Quartou!");
                break;
            case 4:
                System.out.println("Quintou!");
                break;
            case 5:
                System.out.println("Sextou! :D");
                break;
            default:
                System.out.println("Número Inválido, é de 1 a 5!");
                   
        }
    }
}
