package com.sptech.aula.encapsulamento;

public class ContaBancaria {

    private Double saldo = 0.0;
    private String NomeTitular;

    void depositar(Double valorDeposito) {
        if (valorDeposito <= 0) {
            System.out.println("Valoe inválido.");
        } else {
            saldo += valorDeposito;
        }
    }

    void sacar(Double valorSaque) {
        saldo -= valorSaque;
    }


    public Double getSaldo() {
        return saldo;
    }

    public String getNomeTitular() {
        return NomeTitular;
    }

    public void setNomeTitular(String NomeTitular) {
        this.NomeTitular = NomeTitular;
    }
}
