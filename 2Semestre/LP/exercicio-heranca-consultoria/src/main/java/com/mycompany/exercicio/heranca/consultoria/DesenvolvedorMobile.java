/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio.heranca.consultoria;

/**
 *
 * @author aluno
 */
public class DesenvolvedorMobile extends Desenvolvedor{
    private Integer qtdHorasTrabalhadasMobile;
    private Double valorHorasTrabalhasMobile;

    public DesenvolvedorMobile(Integer qtdHorasTrabalhadasMobile, Double valorHorasTrabalhasMobile, String nome, Integer qtdHorasTrabalhadas, Double valorHoraTrabalhada) {
        super(nome, qtdHorasTrabalhadas, valorHoraTrabalhada);
        this.valorHorasTrabalhasMobile = valorHorasTrabalhasMobile;
        this.qtdHorasTrabalhadasMobile = qtdHorasTrabalhadasMobile;
    }
     
    
    public DesenvolvedorMobile(String nome, Integer qtdHorasTrabalhadas, Double valorHoraTrabalhada) {
        super(nome, qtdHorasTrabalhadas, valorHoraTrabalhada);
    }

    public Integer getQtdHorasTrabalhadasMobile() {
        return qtdHorasTrabalhadasMobile;
    }

    public void setQtdHorasTrabalhadasMobile(Integer qtdHorasTrabalhadasMobile) {
        this.qtdHorasTrabalhadasMobile = qtdHorasTrabalhadasMobile;
    }

    public Double getValorHorasTrabalhasMobile() {
        return valorHorasTrabalhasMobile;
    }

    public void setValorHorasTrabalhasMobile(Double valorHorasTrabalhasMobile) {
        this.valorHorasTrabalhasMobile = valorHorasTrabalhasMobile;
    }
    
    

    @Override
    public Double getSalario() {
        return super.getSalario()+(this.qtdHorasTrabalhadasMobile * this.valorHoraTrabalhada); 
    }

    @Override
    public String toString() {
        return String.format("%s \n"
                + "Horas trabalhadas mobile %d \n"
                + "Valor horas Trabalhadas mobile \n", 
                super.toString(),qtdHorasTrabalhadasMobile,valorHorasTrabalhasMobile);
    }
    
    
}
