package ex04;

public class Termometro {

    Double temperaturaAtual;
    Double temperaturaMax;
    Double temperaturaMin;

    void AumentarTemperatura(Double valorParaAumentar) {
        temperaturaAtual += valorParaAumentar;
        if (temperaturaAtual > temperaturaMax) {
            temperaturaMax = temperaturaAtual;
            System.out.println(String.format("Anova temperatura maxima mudou! agora ela é de %.2f", temperaturaMax));
        }
    }

    void diminuiTemperatura(Double valorParaDiminuir) {
        temperaturaAtual -= valorParaDiminuir;
        if (temperaturaAtual<temperaturaMin) {
            temperaturaMin = temperaturaAtual;
            System.out.println(String.format("Anova temperatura minima mudou! agora ela é de %.2f", temperaturaMin));
        }
    }

    void exibeFahreinheit() {
        Double fahrenheit = (temperaturaAtual * 1.8) + 32;
        System.out.println(String.format("Valor da temperatura atual em fahrenheit: %.2f", fahrenheit));
    }
}
