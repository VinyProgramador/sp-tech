/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio.relacionamento;

/**
 *
 * @author aluno
 */
public class App {
    public static void main(String[] args) {
        Carrinho c1 = new Carrinho("Viny");
        Produto p1 = new Produto("Banana", "Fruta", 2.50);
        Produto p2 = new Produto("Negresco", "Bolacha", 7.50);
        Produto p3 = new Produto("Doritos", "Slagadinho", 9.50);
        Produto p4 = new Produto("Namorado", "Arroz", 6.50);
        Produto p5 = new Produto("Polenguinho", "Queijo", 1.50);
        
        c1.adicionar(p1);
        c1.adicionar(p2);
        c1.adicionar(p3);
        c1.adicionar(p4);
        c1.adicionar(p5);
        
        System.out.println(c1.getQuantidade(p1));
        System.out.println(c1.existsPorNome("Banana"));
        System.out.println(c1.existsPorNome("Bolo"));
        System.out.println(c1.quantidadePorCategoria("Fruta"));
        System.out.println(c1.quantidadePorCategoria("Limpeza"));
        c1.removePorNome("Banana");
        System.out.println(c1.getPorNome("Polenguinho"));
        System.out.println(c1.getValorTotal());
        
        c1.limpar();
        
        
    }
}
