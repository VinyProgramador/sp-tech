package ex02;

import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        Scanner sc01 = new Scanner(System.in);
        Scanner sc02 = new Scanner(System.in);

        Encomenda encomenda = new Encomenda();

        System.out.println("Digite o tamanho da encomenda");
        String tamanho = sc02.nextLine();
        
        encomenda.tamanho = tamanho;

        System.out.println("Digite o endereço do remetente");
        String remetente = sc02.nextLine();
        
        encomenda.enderecoDoRemetente = remetente;

        System.out.println("Digite o endereço do destinatário");
        String destinatario = sc02.nextLine();
        
        encomenda.enderecoDoDestinatario = destinatario;

        System.out.println("Digite a distância");
        Double distancia = sc01.nextDouble();
        
        encomenda.distancia = distancia;

        System.out.println("Digite o valor da encomenda");
        Double valorEncomenda = sc01.nextDouble();
        
        encomenda.valorEncomenda = valorEncomenda;

        encomenda.emitirEtiqueta();
        sc01.close();
        sc02.close();;
    }
}