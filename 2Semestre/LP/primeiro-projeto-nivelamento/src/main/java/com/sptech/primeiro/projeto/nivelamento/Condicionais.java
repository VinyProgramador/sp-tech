package com.sptech.primeiro.projeto.nivelamento;

public class Condicionais {

    public static void main(String[] args) {
        Integer num1 = 80;
        Integer num2 = 10;

        if (num1 > num2) {
            System.out.println("num1 maior que o num2.");
        } else if (num2 > num1) {
            System.out.println("num2 maior que o num1.");
        } else {
            System.out.println("São iguais!");
        }
        
        String nome1="Viny";
        String nome2="Viny";
        if(nome1.equals(nome2)){
            System.out.println("São iguais");
        }
        else{
            System.out.println("Não são iguais!");
        }
        
        //ISENsitivecase ele ignora cse palavras iguais tem letras maíusculas ou minusculas!
        
        if(nome1.equalsIgnoreCase(nome2)){
            System.out.println("São iguais!");
        }
        else{
            System.out.println("São diferentes!!");
        }
    }

}
