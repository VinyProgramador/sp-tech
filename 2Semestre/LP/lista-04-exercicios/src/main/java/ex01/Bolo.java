package ex01;

public class Bolo {

    String sabor;
    Double valor;
    Integer quantidadeVendida = 0;

    void comprarBolo(Integer quantidadeBolosVendida) {
        if (quantidadeVendida < 100) {
            if (quantidadeVendida + quantidadeBolosVendida > 100) {
                System.out.println("Seu pedido ultrapassou nosso limite diário para esse bolo.");
            } else {
                quantidadeVendida += quantidadeBolosVendida;
            }
        }
    }

    void exibirRelatorio() {
        Double valorQuantidadeVendida = quantidadeVendida * valor;
        System.out.println(String.format("O bolo sabor %s, foi comprado %d vezes hoje, totalizando R$ %.2f", sabor, quantidadeVendida, valorQuantidadeVendida));
    }

}