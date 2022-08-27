package ex05;

public class CalculaPesoIdeal {

    Double calcPeso(String sexo, Double alturaUser) {
        Double pesoIdeal = 0.0;

        if (sexo.equals("M")) {
            pesoIdeal = (72.7 * alturaUser) - 58;
        } else {
            pesoIdeal = (62.1 * alturaUser) - 44.7;
        }

        return pesoIdeal;
    }
}
