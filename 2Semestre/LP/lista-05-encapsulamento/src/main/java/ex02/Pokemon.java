package ex02;

public class Pokemon {

    private String nome;
    private String tipo;
    private Double forca = 0.0;
    private Integer doces = 0;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getForca() {
        return forca;
    }

    public void setForca(Double forca) {
        this.forca = forca;
    }

    public Integer getDoces() {
        return doces;
    }

    public void setDoces(Integer doces) {
        this.doces = doces;
    }

    @Override
    public String toString() {
        return "Pokemon: " + "nome: " + nome + ", tipo: " + tipo + ", força: " + forca + ", doces: " + doces;
    }

 
    
}
