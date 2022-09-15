package ex01;

public class TesteColaborador {

    public static void main(String[] args) {
        RecursosHumanos rh = new RecursosHumanos();
        Colaborador func01 = new Colaborador();
        Colaborador func02 = new Colaborador();

        func01.setNomeColaborador("Viny");
        func01.setcargoColaborador("Estágiario");
        func01.setSalario(1500.0);

        func02.setNomeColaborador("Manuel");
        func02.setcargoColaborador("Dev Senior");
        func02.setSalario(7000.0);

        System.out.println(func01.toString());
        System.out.println(func02.toString());

        rh.promoverColaborador(func01, "Dev jr", 3000.0);
        rh.promoverColaborador(func01, "Dev Pleno", 1000.0);

        rh.reajustarSalario(func02, 3.0);
        System.out.println(func01.toString());
        System.out.println(func02.toString());

        rh.exibirInformacoesRh();

    }

}
