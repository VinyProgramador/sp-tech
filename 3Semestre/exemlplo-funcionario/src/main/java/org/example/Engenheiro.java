package org.example;

public class Engenheiro extends Funcionario {

    //Atributo
    private Double salario;

    //construtor

    public Engenheiro(String cpf, String nome, Double salario) {
        super(cpf, nome);
        this.salario = salario;
    }

    //métodos
    //implementação do método calcSalario
    @Override
    public Double calcSalario() {
        return this.salario;
    }

    @Override
    public String toString() {
        return "Engenheiro" +
                "salario=" + salario +
                 super.toString();
    }
}
