package com.mycompany.desafio.conta.corrente;

import java.util.ArrayList;
import java.util.List;

public class ContaCorrente {

    private String titular;
    private Double saldo;
    private List<Historico> historicos;

    public ContaCorrente(String titular, Double saldo) {
        this.titular = titular;
        this.saldo = saldo;
        this.historicos = new ArrayList<>();
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void depositar(Double valor, Integer dia, Integer mes, Integer ano) {
        saldo += valor;
        historicos.add(new Historico(dia, mes, ano, valor, "Depósito"));
    }

    public void sacar(Double valor, Integer dia, Integer mes, Integer ano) {
        if (valor <= saldo) {
            saldo -= valor;
            historicos.add(new Historico(dia, mes, ano, valor, "Saque"));
        } 
        else {
            System.out.println("Operação de saque inválida.");
        }
    }

    public void exibirExtrato() {
        System.out.println("\n------------ Banco Vincius A Nunes ------------");
        System.out.println("------------ $$$ Extrato $$$ ------------");

        System.out.println("Titular: " + titular);
        System.out.println(String.format("Saldo: R$%.2f", saldo));

        for (Historico historicos : historicos) {
            System.out.println("\n \n");

            System.out.println("Operação: " + historicos.getOperacao());
            System.out.println(String.format("Valor: R$%.2f", historicos.getValor()));

            System.out.println(
                    String.format("Data:{ dia: %d, mes: %d, ano: %d }",
                            historicos.getDia(), historicos.getMes(), historicos.getAno()));
        }
    }

}
