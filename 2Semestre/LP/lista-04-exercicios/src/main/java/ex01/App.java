package ex01;

public class App {

    public static void main(String[] args) {
        Bolo bolo01 = new Bolo();
        Bolo bolo02 = new Bolo();
        Bolo bolo03 = new Bolo();

        bolo01.sabor = "Doce de leite com Coco";
        bolo01.valor = 48.90;
        bolo01.comprarBolo(20);
        bolo01.comprarBolo(50);
        bolo01.comprarBolo(20);
        bolo01.comprarBolo(10);
        bolo01.comprarBolo(9);
        bolo01.exibirRelatorio();

        bolo02.sabor = "Ninho com Nutela";
        bolo02.valor = 45.50;
        bolo02.comprarBolo(10);
        bolo02.exibirRelatorio();

        bolo03.sabor = "Morango";
        bolo03.valor = 15.00;
        bolo03.comprarBolo(13);
        bolo03.exibirRelatorio();
    }
}
