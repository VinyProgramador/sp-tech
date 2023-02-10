package org.example;

public abstract class  Funcionario {
    //Atributos
    private String cpf;
    private String nome;

    //construtor

    public Funcionario(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    //métodos
    //metodo abstrato
    public abstract Double calcSalario();

    //toString
    @Override
    public String toString() {
        return "Funcionario" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\''+
                "salário=" +calcSalario();
    }
}
