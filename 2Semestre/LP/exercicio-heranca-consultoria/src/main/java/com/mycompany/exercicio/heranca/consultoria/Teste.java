/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.exercicio.heranca.consultoria;

/**
 *
 * @author aluno
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Desenvolvedor dev1 = new Desenvolvedor("Vini",30,80.00);
        Desenvolvedor dev2 = new Desenvolvedor("Bruno",45,200.00);
        DesenvolvedorMobile dev3 = new DesenvolvedorMobile(20, 300.00, "Cristian", 25, 450.00);
        
        Consultoria con1 = new Consultoria("SpTech", 5);
        
        con1.contratar(dev1);
        con1.contratar(dev2);
        con1.contratar(dev3);
        
        con1.existePorNome("Vini");
        con1.contratar(dev2);
        con1.contratar(dev1);
        con1.contratar(dev3);
        con1.existePorNome("Vini");
        
        con1.getQuantidadeDesenvolvedores();
        con1.getQuantidadeDesenvolvedoresMobile();
        con1.getTotalSalarios();
        con1.buscarDesenvolvedorPorNome("Bruno");
        con1.buscarDesenvolvedorPorNome("Carlos");
        con1.toString();
        
        
    }
    
}
