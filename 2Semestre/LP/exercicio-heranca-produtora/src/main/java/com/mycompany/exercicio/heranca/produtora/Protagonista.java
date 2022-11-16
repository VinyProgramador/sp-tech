/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio.heranca.produtora;

/**
 *
 * @author aluno
 */
public class Protagonista extends Ator{
    private Integer qtdHorasTrabalhadasProtagonista;
    private Double valorHorasTrabalhasProtagonista;

    public Protagonista(Integer qtdHorasTrabalhadasProtagonista, Double valorHorasTrabalhasProtagonista, String nome, Integer qtdHorasTrabalhadas, Double valorHoraTrabalhada) {
        super(nome, qtdHorasTrabalhadas, valorHoraTrabalhada);
        this.nome = nome;
        this.qtdHorasTrabalhadasProtagonista = qtdHorasTrabalhadasProtagonista;
        this.valorHorasTrabalhasProtagonista = valorHorasTrabalhasProtagonista;
    }

    public Integer getQtdHorasTrabalhadasProtagonista() {
        return qtdHorasTrabalhadasProtagonista;
    }

    public void setQtdHorasTrabalhadasProtagonista(Integer qtdHorasTrabalhadasProtagonista) {
        this.qtdHorasTrabalhadasProtagonista = qtdHorasTrabalhadasProtagonista;
    }

    public Double getValorHorasTrabalhasProtagonista() {
        return valorHorasTrabalhasProtagonista;
    }

    public void setValorHorasTrabalhasProtagonista(Double valorHorasTrabalhasProtagonista) {
        this.valorHorasTrabalhasProtagonista = valorHorasTrabalhasProtagonista;
    }

    @Override
    public Double getSalario() {
        return super.getSalario()+(this.valorHorasTrabalhasProtagonista * this.valorHorasTrabalhasProtagonista); 
    }

    @Override
    public String toString() {
return String.format("%s \n"
                + "Horas trabalhadas mobile %d \n"
                + "Valor horas Trabalhadas mobile \n", 
                super.toString(),qtdHorasTrabalhadasProtagonista,valorHorasTrabalhasProtagonista);
    }
    
    
    
    
}
