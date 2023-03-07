package org.example;

public abstract class FuncionarioBonus extends Funcionario {

    private Integer qtdAulasSemana;

    private Double valorHoraAula;

    public FuncionarioBonus(String nome, Double salario, Integer qtdAulasSemana, Double valorHoraAula) {
        super(nome, salario);
        this.qtdAulasSemana = qtdAulasSemana;
        this.valorHoraAula = valorHoraAula;
    }

    public Integer getQtdAulasSemana() {
        return qtdAulasSemana;
    }

    public void setQtdAulasSemana(Integer qtdAulasSemana) {
        this.qtdAulasSemana = qtdAulasSemana;
    }

    public Double getValorHoraAula() {
        return valorHoraAula;
    }

    public void setValorHoraAula(Double valorHoraAula) {
        this.valorHoraAula = valorHoraAula;
    }

    public abstract Double pagarBonus();
    @Override
    public String toString() {
        return "FuncionarioBonus{" +
                "qtdAulasSemana=" + qtdAulasSemana +
                ", valorHoraAula=" + valorHoraAula +
                "} " + super.toString();
    }
}
