package com.sptech.aula.encapsulamento;

public class App {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria();
        ContaBancaria c2 = new ContaBancaria();
        
        c1.depositar(100.0);
        c1.setNomeTitular("Viny");
        c2.depositar(100.0);
        c2.setNomeTitular("Manuel");
        System.out.println("C1: "+c1.getSaldo());
        System.out.println("C1: "+c2.getSaldo());
        System.out.println("Nome portador conta 01: "+c1.getNomeTitular());
        System.out.println("Nome portador conta 02: "+c2.getNomeTitular());
    }
}
