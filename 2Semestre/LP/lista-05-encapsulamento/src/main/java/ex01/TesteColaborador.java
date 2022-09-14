package ex01;

public class TesteColaborador {

    public static void main(String[] args) {

        RecursosHumanos rh = new RecursosHumanos();

        String cargo = "Estágiario";
        String nome = "Vinicius Nunes";
        Double salario = 1800.00;

        String cargo02 = "Analista Jr";
        String nome02 = "Cristhian";
        Double salario02 = 2900.00;

        Colaborador funcionario01 = new Colaborador(nome, cargo, salario);
        Colaborador funcionario02 = new Colaborador(nome02, cargo02, salario02);

        System.out.println(String.format("Nome: %s\n"
                + "Cargo: %s\n"
                + "Salário: %.2f",
                funcionario01.nome, funcionario01.cargo, funcionario01.salario));

        System.out.println("");

        System.out.println(String.format("Nome: %s\n"
                + "Cargo: %s\n"
                + "Salário: %.2f",
                funcionario02.nome, funcionario02.cargo, funcionario02.salario));
        System.out.println("");

        rh.promoverColaborador(funcionario01.nome, funcionario01.cargo = "Estagiario Nível 02", funcionario01.salario, 2000.00);
        System.out.println("");

        rh.promoverColaborador(funcionario02.nome, funcionario02.cargo = "Analista Pleno", funcionario01.salario, 1000.00);
        rh.reajustarSalario(funcionario02.nome, funcionario02.salario, 3.00);

        System.out.println("");
        System.err.println("Dados Atualizados:");
        

        rh.exibirInformacoesRhsRh();
    }

}
