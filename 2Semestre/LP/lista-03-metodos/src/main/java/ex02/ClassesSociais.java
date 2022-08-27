package ex02;

public class ClassesSociais {

    Double qtdSalarios(Double salarioUser) {
        Double salariosRecebidos = (salarioUser / 1090.00);
        if (salariosRecebidos <=2) {
            System.out.println("Voce pertence a classe E");
        } else if (salariosRecebidos <=4) {
            System.out.println("Voce pertence a classe D");
        } else if (salariosRecebidos <=10) {
            System.out.println("Voce pertence a classe C");
        } else if (salariosRecebidos <=20) {
            System.out.println("Voce pertence a classe B");
        } else {
            System.out.println("Voce pertence a classe A");
        }
        return salariosRecebidos;
    }
}
