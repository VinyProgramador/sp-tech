/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sptech.exercicio.heranca;

/**
 *
 * @author aluno
 */
public class VendedorComissaoMaisFixo extends VendedorComissao {

    private Double salario;

    public VendedorComissaoMaisFixo(Integer codigo, String nome, Double vendas, Double taxa) {
        super(codigo, nome, vendas, taxa);
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public Double calcularSalario() {
        return salario + super.calcularSalario();
    }

    @Override
    public String toString() {
        return String.format("\nNome: %s"
                + "Salario %.2f",
                getNome(), calcularSalario());
    }

    
}
