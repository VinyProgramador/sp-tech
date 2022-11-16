/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.exercicio.heranca.produtora;

/**
 *
 * @author aluno
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ator a1 = new Ator("Mauro", 30, 2000.00);
        Ator a2 = new Ator("Vini", 30, 3000.00);
        Ator a3 = new Ator("Endryl", 20, 2000.00);
        Protagonista p1 = new Protagonista(20, 4000.00, "Cleber", 40, 500.00);
        
        Produtora Prod1 = new Produtora("Globo", 10);
        
        Prod1.contratar(a1);
        Prod1.contratar(a2);
        Prod1.contratar(a3);
        
        Prod1.existePorNome("Vini");
        Prod1.getQuantidadeAtores();
        Prod1.getQuantidadeProtagonista();
        Prod1.getTotalSalarios();
        Prod1.buscarAtorPorNome("Paulo");
    }
    
}
