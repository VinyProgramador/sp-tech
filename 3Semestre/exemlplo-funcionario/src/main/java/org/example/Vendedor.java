package org.example;

public class Vendedor extends Funcionario {

    private Double taxa;
    private Double vendas;

    public Vendedor(String cpf, String nome, Double taxa, Double vendas) {
        super(cpf, nome);
        this.taxa = taxa;
        this.vendas = vendas;
    }

    @Override
    public Double calcSalario() {
       return this.taxa * this.vendas;
    }

    @Override
    public String toString() {
        return "Vendedor" +
                "taxa=" + taxa +
                ", Vendas=" + vendas +
                super.toString();
    }
}
