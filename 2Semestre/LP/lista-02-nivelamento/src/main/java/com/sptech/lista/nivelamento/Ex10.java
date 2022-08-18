package com.sptech.lista.nivelamento;

import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer votoUsuario;
        Integer mussarela = 0;
        Integer calabresa = 0;
        Integer quatroQueijos = 0;
        System.out.println("__PIZZA__\n"
                + "Para votar no sabor mussarela, deve-se digitar o valor 5\n"
                + "Para votar no sabor calabresa, deve-se digitar o valor 25\n"
                + "Para votar no sabor quatro queijos, deve- se digitar o valor 50.");
        votoUsuario = sc.nextInt();

        for (int i = 0; i <= 10; i++) {
            switch (votoUsuario) {
                case 5:
                    mussarela++;
                    break;
                case 25:
                    calabresa++;
                    break;
                case 50:
                    quatroQueijos++;
                    break;
                default:
                    System.out.println("Número Inválido.");
            }
            System.out.println("Vote novamente: ");
            votoUsuario = sc.nextInt();
        }

        System.out.println(String.format("Mussarela: %d, "
                + "Calabresa: %d, "
                + "Quatro Queijos: %d",
                mussarela,
                calabresa,
                quatroQueijos));

        String maisVotado;
        
        if (calabresa>mussarela && calabresa>quatroQueijos) {
            maisVotado = "calabresa";
        }
        else if (mussarela>calabresa && mussarela>quatroQueijos) {
            maisVotado = "mussarela";
        }
        else{
            maisVotado = "quatroQueijos";
        }
        
        System.out.println(String.format("Pizza mais votada é a de %s: ", maisVotado));
    }

}
