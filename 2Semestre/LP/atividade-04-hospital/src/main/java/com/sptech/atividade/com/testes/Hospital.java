package com.sptech.atividade.com.testes;

public class Hospital {
    
    private String nome;
    private Integer quantidadeDePagamentos;
    private Integer quantidadeDeHoraExtra;
    
    public Hospital(String nome) {
        this.nome = nome;
        this.quantidadeDePagamentos = 0;
        this.quantidadeDeHoraExtra = 0;
    }
    
    public void realizarPagamento(Medico medico, Double valorPago) {
        if (medico != null && valorPago != null) {
            if (medico.getAtivo()) {
                if (valorPago > 0.0) {
                    medico.setSalario(medico.getSalario() + valorPago);
                    this.quantidadeDePagamentos++;
                }
            }
        }
    }
    
    public void realizarPagamento(Medico medico, Double valorPago, Double horaExtra) {
        if (medico != null && valorPago != null && horaExtra != null) {
            if (medico.getAtivo()) {
                if (valorPago > 0.0) {
                    if (horaExtra > 0) {
                        medico.setSalario(medico.getSalario() + valorPago + horaExtra);
                        this.quantidadeDePagamentos++;
                        this.quantidadeDeHoraExtra++;
                    }
                    
                }
            }
        }
    }
    
    public void desligarMedico(Medico medico) {
        if (medico != null) {
            if (medico.getAtivo()) {
                medico.setAtivo(false);
            }
        }
    }
    
    public String getNome() {
        return nome;
    }
    
    public Integer getQuantidadeDePagamentos() {
        return quantidadeDePagamentos;
    }
    
    public Integer getQuantidadeDeHoraExtra() {
        return quantidadeDeHoraExtra;
    }
    
}
