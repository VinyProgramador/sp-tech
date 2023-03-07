package org.example;

public class Coordenador extends FuncionarioBonus{
    private Double qtdHorasCoordenacaoSemana;
    private Double valorHoraCoordenacao;

    public Coordenador(String nome, Double salario, Double qtdHorasCoordenacaoSemana, Double valorHoraCoordenacao) {
        super(nome, salario);
        this.qtdHorasCoordenacaoSemana = qtdHorasCoordenacaoSemana;
        this.valorHoraCoordenacao = valorHoraCoordenacao;
    }

    @Override
    public Double pagarBonus() {
        Double renda = valorHoraCoordenacao * qtdHorasCoordenacaoSemana;
        return renda * 0.25;
    }

    @Override
    public String toString() {
        return "Coordenador{" +
                "qtdHorasCoordenacaoSemana=" + qtdHorasCoordenacaoSemana +
                ", valorHoraCoordenacao=" + valorHoraCoordenacao +
                "} " + super.toString();
    }
}
