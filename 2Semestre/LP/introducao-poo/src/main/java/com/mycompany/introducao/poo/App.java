package com.mycompany.introducao.poo;

public class App {

    public static void main(String[] args) {
        //Instanciando 2 objetos.
        BilheteUnico bilhete01 = new BilheteUnico();
        BilheteUnico bilhete02 = new BilheteUnico();

        //Alterando os valores dos atributos/caracteristicas.
        bilhete01.nomeTitular = "Vinicius";
        bilhete01.isBloqueado = true;
        bilhete01.isEstudante = true;
        bilhete01.saldo = 0.0;
        

        bilhete02.nomeTitular = "Crysthian";
        bilhete02.isBloqueado = false;
        bilhete02.isEstudante = false;
        bilhete02.saldo = 400.00;
        
        System.out.println("Usando bilhete 02");
        bilhete02.usar();
        System.out.println("Mostrando o objeto");
        System.out.println(bilhete02);
        System.out.println(bilhete02.toString());
        
    }
}
