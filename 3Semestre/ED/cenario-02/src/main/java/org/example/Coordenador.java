package org.example;

public class Coordenador extends Professor{
    private Double qtdAulasCoordenacaoSemana;
    private Double valorHoraCoordenacao;

    public Coordenador(String nome, Double salario, Integer qtdAulasSemana, Double valorHoraAula, Double qtdAulasCoordenacaoSemana, Double valorHoraCoordenacao) {
        super(nome, salario, qtdAulasSemana, valorHoraAula);
        this.qtdAulasCoordenacaoSemana = qtdAulasCoordenacaoSemana;
        this.valorHoraCoordenacao = valorHoraCoordenacao;
    }

    public Double getQtdAulasCoordenacaoSemana() {
        return qtdAulasCoordenacaoSemana;
    }

    public void setQtdAulasCoordenacaoSemana(Double qtdAulasCoordenacaoSemana) {
        this.qtdAulasCoordenacaoSemana = qtdAulasCoordenacaoSemana;
    }

    public Double getValorHoraCoordenacao() {
        return valorHoraCoordenacao;
    }

    public void setValorHoraCoordenacao(Double valorHoraCoordenacao) {
        this.valorHoraCoordenacao = valorHoraCoordenacao;
    }

    @Override
    public String toString() {
        return "Coordenador{" +
                "qtdAulasCoordenacaoSemana=" + qtdAulasCoordenacaoSemana +
                ", valorHoraCoordenacao=" + valorHoraCoordenacao +
                "} " + super.toString();
    }

}
