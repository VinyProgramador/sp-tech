package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("EMPRESA DO VINY \n");

        //Criação de objetos da classe.
        Engenheiro eng1 = new Engenheiro("545","Marcos",2500.00);

        Vendedor ven1 = new Vendedor("097","Denis",5.0,1200.00);

        Horista hor1 = new Horista("763", "Bruno", 56,85.0);

        System.out.println(eng1);
        System.out.println(ven1);
        System.out.println(hor1);

        Empresa emp1 = new Empresa();

        emp1.adicionaFunc(eng1);
        emp1.adicionaFunc(hor1);
        emp1.adicionaFunc(ven1);

        emp1.exibeTodos();
        System.out.println();
        emp1.exibeHoristas();
        System.out.println();
        emp1.exibeTotalSalario();
    }
}