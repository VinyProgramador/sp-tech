package ex01;

public class Colaborador {

    private String nomeColaborador;
    private String cargoColaborador;
    private Double salario = 0.0;

    public void getNomeColaborador() {
        this.nomeColaborador = nomeColaborador;
    }

    public String setNomeColaborador(String nomeColaborador) {
        this.nomeColaborador = nomeColaborador;
        return nomeColaborador;
    }

    public String getcargoColaborador() {
        this.cargoColaborador = cargoColaborador;
        return nomeColaborador;
    }

    public String setcargoColaborador(String cargoColaborador) {
        this.cargoColaborador = cargoColaborador;
        return cargoColaborador;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Colaborador: " + "nome do Colaborador: " + nomeColaborador + ",\n cargo do Colaborador: " + cargoColaborador + ",\n salario do colaborador: " + salario;
    }

}
