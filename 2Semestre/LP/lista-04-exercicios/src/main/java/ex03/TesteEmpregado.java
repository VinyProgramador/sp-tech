package ex03;

import java.util.Scanner;

public class TesteEmpregado {


    public static void main(String[] args) {
        Empregado empregado01 = new Empregado();
        Empregado empregado02 = new Empregado();
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        empregado01.nome = "João";
        empregado01.cargo = "Analista de Sistemas";
        empregado01.salario =  5400.00;
        
        System.out.println("Digite seu nome:");
        empregado02.nome = sc.nextLine();
        System.out.println("Digite seu Cargo:");
        empregado02.cargo = sc2.nextLine();
        System.out.println("Digite seu Salario:");
        empregado02.salario = sc.nextDouble();
        
        empregado01.reajustarSalario();
        empregado02.reajustarSalario();
    }
    
}
