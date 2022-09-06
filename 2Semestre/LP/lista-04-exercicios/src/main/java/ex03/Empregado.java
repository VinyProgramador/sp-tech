package ex03;


public class Empregado {
    String nome;
    String cargo;
    Double salario = 0.0;
    void reajustarSalario(){
        Double salarioAjustado = (salario * 0.15) + salario;
        System.out.println(String.format("Olá %s, seu cargo é de %s e com seu reajuste de salario voce receberá: %.2f", nome, cargo, salarioAjustado));
    }
}
