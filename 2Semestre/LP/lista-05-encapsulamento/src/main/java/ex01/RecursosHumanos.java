package ex01;

public class RecursosHumanos {

    Integer totalPromovidos = 0;
    Integer totalSalariosAjustados = 0;

    void reajustarSalario(Colaborador funcionario, Double valorReajuste) {
        valorReajuste = valorReajuste / 100;
        valorReajuste = funcionario.getSalario() * valorReajuste;
        funcionario.setSalario(valorReajuste + funcionario.getSalario());
        totalSalariosAjustados++;
    }

    Double promoverColaborador(Colaborador funcionario, String novoCargo, Double novoSalario) {
        if (novoSalario < funcionario.getSalario()) {
            System.out.println("Operação inválida");
        } else {
            funcionario.setSalario(novoSalario);
            totalPromovidos++;
        }
        return novoSalario;
    }

    void exibirInformacoesRh() {
        System.out.println(String.format("Total de promovidos: %d \n"
                + "Total de salários reajustados: %d",
                totalPromovidos, totalSalariosAjustados));
    }

}
