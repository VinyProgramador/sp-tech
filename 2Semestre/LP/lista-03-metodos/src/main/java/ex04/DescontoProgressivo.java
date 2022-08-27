package ex04;

public class DescontoProgressivo {

    Double Desconto(Double valorPdt, Integer qtdPdt) {
        System.out.println("Bem-vindo ao sistema de desconto progressivo");
        Double descPdt = 0.0;
        System.out.println("-----------------");
        System.out.println(String.format("Valor do produto: %.2f", valorPdt));
        System.out.println(String.format("Quantidade: %d", qtdPdt));
        System.out.println("-----------------");

        if (qtdPdt == 1) {
            descPdt = (valorPdt * qtdPdt) - ((valorPdt * qtdPdt) * 0.10);
            System.out.println(String.format("Valor com o desconto %.2f", descPdt));
        } else if (qtdPdt == 2) {
            descPdt = (valorPdt * qtdPdt) - ((valorPdt * qtdPdt) * 0.20);
            System.out.println(String.format("Valor com o desconto %.2f", descPdt));
        } else {
            descPdt = (valorPdt * qtdPdt) - ((valorPdt * qtdPdt) * 0.30);
            System.out.println(String.format("Valor com o desconto %.2f", descPdt));
        }
        return descPdt;
    }
}
