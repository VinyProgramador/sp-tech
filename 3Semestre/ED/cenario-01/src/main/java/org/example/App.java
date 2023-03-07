package org.example;

public class App {
    public static void main(String[] args) {

        System.out.println("\n" +
                " _____             _             _            _        _                                 _              __                  _                        _           \n" +
                "/  __ \\           | |           | |          | |      | |                               | |            / _|                (_)                      (_)          \n" +
                "| /  \\/ ___  _ __ | |_ _ __ ___ | | ___    __| | ___  | |__   ___  _ __  _   _ ___    __| | ___  ___  | |_ _   _ _ __   ___ _  ___  _ __   __ _ _ __ _  ___  ___ \n" +
                "| |    / _ \\| '_ \\| __| '__/ _ \\| |/ _ \\  / _` |/ _ \\ | '_ \\ / _ \\| '_ \\| | | / __|  / _` |/ _ \\/ __| |  _| | | | '_ \\ / __| |/ _ \\| '_ \\ / _` | '__| |/ _ \\/ __|\n" +
                "| \\__/\\ (_) | | | | |_| | | (_) | |  __/ | (_| |  __/ | |_) | (_) | | | | |_| \\__ \\ | (_| | (_) \\__ \\ | | | |_| | | | | (__| | (_) | | | | (_| | |  | | (_) \\__ \\\n" +
                " \\____/\\___/|_| |_|\\__|_|  \\___/|_|\\___|  \\__,_|\\___| |_.__/ \\___/|_| |_|\\__,_|___/  \\__,_|\\___/|___/ |_|  \\__,_|_| |_|\\___|_|\\___/|_| |_|\\__,_|_|  |_|\\___/|___/\n" +
                "                                                                                                                                                                 \n" +
                "                                                                                                                                                                 ");

        ControleBonus controle = new ControleBonus();
        Professor professor = new Professor("Viny",1800.0,15,200.0);
        Coordenador coordenador = new Coordenador("Renata",2500.0,40.0,250.0);

        controle.adicionaFuncionario(professor);
        controle.adicionaFuncionario(coordenador);

        System.out.println("Imprimindo Relatórios: \n");

        System.out.println("Funcionarios: ");
        controle.exibeFuncionarios();

        System.out.println("\nValor total de Bônus:");
        System.out.println(controle.calculaBonus());
    }


}