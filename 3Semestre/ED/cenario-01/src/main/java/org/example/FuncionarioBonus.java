package org.example;

public abstract class FuncionarioBonus extends Funcionario{

    public FuncionarioBonus(String nome, Double salario) {
        super(nome, salario);
    }

    public abstract Double pagarBonus();
}
