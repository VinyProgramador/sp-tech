package com.mycompany.desafio.conta.corrente;

/**
 *
 * @author Vini
 */
public class TesteContaCorrente {

    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente("Carlos", 0.0);
        ContaCorrente c2 = new ContaCorrente("Giuliana", 0.0);

        c1.depositar(25.0, 23, 8, 2022);
        c1.depositar(27.90, 13, 7, 2022);
        c1.sacar(12.30, 22, 9, 2022);
        c1.exibirExtrato();
        
        c2.depositar(2970.0, 19, 4, 2022);
        c2.sacar(90.0, 20, 4, 2022);
        c2.sacar(-10.0, 24, 4, 2022);
        c2.exibirExtrato();
    }
    
}
