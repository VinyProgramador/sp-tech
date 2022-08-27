package ex06;

public class VerificarPrimo {

    void VerficarNumero(Integer numDigitado) {
        Integer NumeroDeDivisoes = 0;
        for (int i = 1; i <= numDigitado; i++) {
            if (numDigitado % i == 0) {
                NumeroDeDivisoes++;
            }
        }
        if (NumeroDeDivisoes == 2) {
            System.out.println("é primo");
        } else {
            System.out.println("não é primo");
        }
    }
}
