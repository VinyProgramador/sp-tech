package ex03;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        ClassificaIdade pessoa = new ClassificaIdade();
        Scanner sc = new Scanner(System.in);
        Integer idadeUser;
        System.out.println("Digite sua idade: ");
        idadeUser = sc.nextInt();
        pessoa.saberIdade(idadeUser);
    }
    
}
