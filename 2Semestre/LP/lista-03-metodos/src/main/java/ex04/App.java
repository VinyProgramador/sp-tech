package ex04;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        DescontoProgressivo compra = new DescontoProgressivo();
        Scanner sc = new Scanner(System.in);
        Double valorPdt;
        Integer qtdPdt;
        System.out.println("Digite o valor unitatio do produto: ");
        valorPdt = sc.nextDouble();
        System.out.println("Digite a quantidade: ");
        qtdPdt = sc.nextInt();
        Double desconto = compra.Desconto(valorPdt, qtdPdt);
    }
    
}
