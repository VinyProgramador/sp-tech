package org.example;

public class Main {
    public static void main(String[] args) {
        Alimento a1 = new Alimento(1,"barrinha de chocolate",5.0, 0);
        Perfurme p1 = new Perfurme(11, "Um perfume masculino", 200.0, "Malbac");
        Servico s1 = new Servico ("Cobrador", 50.0);

        Tributo t1 = new Tributo();

        //Adicionando

        t1.adicionaTributavel(a1);
        t1.adicionaTributavel(p1);
        t1.adicionaTributavel(s1);

        //testando
        System.out.println("Exibindo todos:");
        t1.exibeTodos();
        System.out.println("Calculando todos");
        System.out.println(t1.calculaTotalTributo());

    }
}