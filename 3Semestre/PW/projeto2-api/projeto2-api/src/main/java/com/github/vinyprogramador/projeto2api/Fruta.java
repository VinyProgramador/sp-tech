package com.github.vinyprogramador.projeto2api;

//Nome: Vinicius de Almeida Nunes;
//RA: 01221125

public class Fruta {
    private String nome;
    private Double preco;
    private Integer quantidade;
    private boolean comSemente;

    public Fruta() {

    }

    public Fruta(String nome, Double preco, Integer quantidade, boolean comSemente) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.comSemente = comSemente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public boolean isComSemente() {
        return comSemente;
    }

    public void setComSemente(boolean comSemente) {
        this.comSemente = comSemente;
    }


    //Campo calculado
    //Ou
    //Campo virtual
    public String getDescricao(){
        return preco > 10.0 ? "Caro.." : "No precinho";
    }
}
