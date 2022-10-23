/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio.relacionamento;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aluno
 */
public class Carrinho {

    private String cliente;
    private List<Produto> produtos;

    public Carrinho(String cliente) {
        this.cliente = cliente;
        this.produtos = new ArrayList<>();
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Integer getQuantidade(Produto p) {
        if (produtos.size() > 0) {
            return produtos.size();
        }
        return 0;
    }

    public void adicionar(Produto p) {
        produtos.add(p);
    }

    public Boolean existsPorNome(String nome) {

        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getNome().equalsIgnoreCase(nome)) {
                return true;
            }

        }
        return false;
    }

    public Integer quantidadePorCategoria(String nome) {
        int qtdCategoria = 0;
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getCategoria().equalsIgnoreCase(nome)) {
                qtdCategoria++;
            }

        }
        return qtdCategoria;
    }

    public void limpar() {
        produtos.clear();
    }

    public void removePorNome(String nome) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getCategoria().equalsIgnoreCase(nome)) {
                produtos.remove(i);
            }

        }
    }

    public Produto getPorNome(String nome) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getNome().equalsIgnoreCase(nome)) {
                return produtos.get(i);
            }

        }
        return null;
    }

    public Double getValorTotal() {
        Double valorTotal = 0.0;
        for (int i = 0; i < produtos.size(); i++) {
            valorTotal += produtos.get(i).getPreco();
        }

        return valorTotal;
    }
}
