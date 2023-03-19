package com.github.vinyprogramador.exercisesspring.exercicio01.model.exercicio02;

import com.fasterxml.jackson.annotation.JsonProperty;



public class Product {
    private String nome;
    @JsonProperty (access = JsonProperty.Access.READ_ONLY)
    private int id;
    private String marca;
    private int quantidadeEstoque;
    private Double preco;
    private boolean promocao;


    public Product(String nome, String marca, int quantidadeEstoque, Double preco, boolean promocao) {
        this.nome = nome;
        this.marca = marca;
        this.quantidadeEstoque = quantidadeEstoque;
        this.preco = preco;
        this.promocao = promocao;
    }

    public Product() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public boolean isPromocao() {
        return promocao;
    }

    public void setPromocao(boolean promocao) {
        this.promocao = promocao;
    }
}
