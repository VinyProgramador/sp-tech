package com.sptech.sugundo.nivelamento;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author miniguiti
 */
public class NumerosAleatorios {
    public static void main(String[] args) {
        
        // Também da pra fazer assim:
        // Math.random
        // Random random = new Random();
                
        Integer numeroAleatorio = ThreadLocalRandom.current().nextInt(0, 101);
        
        Double numeroAleatorioQuebrado = ThreadLocalRandom.current().nextDouble(1.5, 30.5);
        
        System.out.println("Integer Aleatório");
        System.out.println(numeroAleatorio);
        
        System.out.println("Double Aleatório");
        System.out.println(numeroAleatorioQuebrado);
        
        
    }
   
}
