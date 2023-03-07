package org.example;

public class Professor extends FuncionarioBonus {

    public Professor(String nome, Double salario, Integer qtdAulasSemana, Double valorHoraAula) {
        super(nome, salario, qtdAulasSemana, valorHoraAula);
    }

    @Override
    public Double pagarBonus() {
        Double renda = getQtdAulasSemana() * getValorHoraAula();
        return renda * 0.10;
    }

}
