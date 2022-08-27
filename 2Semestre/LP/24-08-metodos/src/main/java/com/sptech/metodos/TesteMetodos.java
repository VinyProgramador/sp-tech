package com.sptech.metodos;

import java.util.Scanner;

/**
 *
 * @author miniguiti
 */
public class TesteMetodos {
    public static void main(String[] args) {
     
        // Instânciando um objeto
        // Criando um objeto do tipo Utilitaria
        Utilitaria util = new Utilitaria();
        
        //Invocando um método (chamando)
        util.exibirLinha();
        
        //Invocando um método que recebe argumento
     
        String nome = "Giuliana";
           
        // Podemos passar uma variável com nome diferente do argumento
        // O que importa é o tipo!
        util.exibirNome(nome);
        util.exibirNome("Maria");
              
        System.out.println("Exibindo nome decorado: ");
        util.exibirNomeDecorado(nome);
        util.exibirNomeDecorado("Juninho");
        
        
        System.out.println("---> Testando Cálculadora <---");
        
        //Criando um objeto
        Calculadora calc = new Calculadora();
        
        //Desafio: usar o Scanner para pedir os números:    
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite 2 números: ");
        Double numeroDigitado01 = leitor.nextDouble();
        Double numeroDigitado02 = leitor.nextDouble();
        
        //Se retorna um Double, devemos usar o retorno para algo:
        Double soma = calc.somar(numeroDigitado01, numeroDigitado02);
        System.out.println("A soma é: " + soma);   
        
        System.out.println("Vendo o se número é par: ");
        
        Boolean isPar = calc.isNumeroPar(soma);
        
        System.out.println(String.format("O número %.2f é par: %s",
                                    soma, (isPar ? "Sim" : "Não")));
        if(isPar){
            // Faça algo se for par
        }else{
            // Faça algo se for impar                             
        }
            
    }
}
