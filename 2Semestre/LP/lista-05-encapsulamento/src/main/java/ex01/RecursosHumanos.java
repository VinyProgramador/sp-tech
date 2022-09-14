package ex01;

public class RecursosHumanos {

    Integer totalPromovidos = 0;
    Integer totalSalariosAjustados = 0;

    void reajustarSalario(String coloborador, Double valorSalario, Double valorReajuste) {
        
        valorReajuste = valorReajuste/100;
        valorReajuste = valorSalario * valorReajuste;
        valorSalario = valorReajuste + valorSalario;
        totalSalariosAjustados++;
    }

    void promoverColaborador(String coloborador, String novoCargo, Double salarioAtual, Double novoSalario) {

        if (novoSalario < salarioAtual) {
            System.out.println("Operação inválida");
        } else {
            totalPromovidos++;
        }
    }

    void exibirInformacoesRhsRh() {
        System.out.println(String.format("Total de promovidos: %d \n"
                + "Total de salários reajustados: %d",
                totalPromovidos, totalSalariosAjustados));
    }
}
