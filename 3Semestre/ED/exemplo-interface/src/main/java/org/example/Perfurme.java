package org.example;

public class Perfurme extends Produto{
    private String fragrancia;

    public Perfurme(Integer codigo, String descricao, Double preco, String fragrancia) {
        super(codigo, descricao, preco);
        this.fragrancia = fragrancia;
    }

    @Override
    public Double getValorTributo() {
        return getPreco() * 0.27;
    }

    @Override
    public String toString() {
        return "Perfurme{" +
                "fragrancia='" + fragrancia + '\'' +
                "} " + super.toString();
    }
}
