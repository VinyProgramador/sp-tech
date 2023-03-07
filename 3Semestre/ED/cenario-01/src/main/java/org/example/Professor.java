package org.example;

public class Professor extends FuncionarioBonus {
    private Integer qtdAulasSemena;
    private Double valorHoraAula;

    public Professor(String nome, Double salario, Integer qtdAulasSemena, Double valorHoraAula) {
        super(nome, salario);
        this.qtdAulasSemena = qtdAulasSemena;
        this.valorHoraAula = valorHoraAula;
    }

    public Integer getQtdAulasSemena() {
        return qtdAulasSemena;
    }

    public void setQtdAulasSemena(Integer qtdAulasSemena) {
        this.qtdAulasSemena = qtdAulasSemena;
    }

    public Double getValorHoraAula() {
        return valorHoraAula;
    }

    public void setValorHoraAula(Double valorHoraAula) {
        this.valorHoraAula = valorHoraAula;
    }

    @Override
    public Double pagarBonus() {
        Double renda = qtdAulasSemena * valorHoraAula;
        return renda * 0.10;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "qtdAulasSemena=" + qtdAulasSemena +
                ", valorHoraAula=" + valorHoraAula +
                "} " + super.toString();
    }
}
