package org.example;
import java.util.Scanner;
//Nome: Vinicius A Nunes
//RA: 01221125
public class Main {
    public static void main(String[] args) {
        Repositorio repositorio = new Repositorio();
        Scanner scanner = new Scanner(System.in);

        int opcao = 0;

        while (opcao != 7) {
            System.out.println("\nMenu de opções:");
            System.out.println("1- Salvar");
            System.out.println("2- Deletar pelo id");
            System.out.println("3- Desfazer");
            System.out.println("4- Agendar salvar");
            System.out.println("5- Executar agendamento");
            System.out.println("6- Exibir");
            System.out.println("7- Finalizar");

            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do tema: ");
                    String nomeTema = scanner.next();

                    // Gera o ID
                    int id = 200 + repositorio.getTamanho();

                    Tema tema = new Tema(id, nomeTema);
                    repositorio.salvar(tema);
                    System.out.println("Tema salvo com sucesso.");
                    break;
                case 2:
                    System.out.print("Digite o ID do tema a ser deletado: ");
                    int idDeletar = scanner.nextInt();
                    repositorio.deletarPeloId(idDeletar);
                    break;
                case 3:
                    repositorio.desfazer();
                    break;
                case 4:
                    System.out.print("Digite o nome do tema a ser agendado para salvar: ");
                    String nomeAgendado = scanner.next();

                    // Gera o ID
                    int idAgendado = 200 + repositorio.getTamanho();

                    Tema temaAgendado = new Tema(idAgendado, nomeAgendado);
                    repositorio.agendarSalvar(temaAgendado);
                    break;
                case 5:
                    System.out.print("Digite a quantidade de operações agendadas a serem executadas: ");
                    int qtdOperacoes = scanner.nextInt();
                    repositorio.executarAgendado(qtdOperacoes);
                    break;
                case 6:
                    repositorio.exibirRepositorio();
                    break;
                case 7:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                    break;
            }
        }

        scanner.close();
    }
}
