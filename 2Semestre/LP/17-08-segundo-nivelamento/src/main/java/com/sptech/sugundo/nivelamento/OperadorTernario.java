package com.sptech.sugundo.nivelamento;

/**
 *
 * @author miniguiti
 */
public class OperadorTernario {
    public static void main(String[] args) {
        Boolean bloqueado = false;
        
        String frase;
        
        if(bloqueado){
            frase = "Usuaŕio Bloqueado!";
        }else{
            frase = "Usuário Desbloqueado! :)";
        }
        
        System.out.println(frase);
        
        // pergunta ? se for verdade faz isso : se não faz isso
        
        frase = bloqueado ? "Usuário Bloqueado!" : "Usuário Desbloqueado";
        
        // Se o funcionário ganha mais de 1000 reais
        // O bônus vai ser de 15%
        // Se ganha menos vai ser de 10%
        
        Double salario = 1000.0;
        
        Double bonus = salario > 1000.0 ? 0.15 : 0.10;
        
        if(salario > 1000.0 ){
            bonus = 0.15;
        }else{
            bonus = 0.10;
        }
             
    }
}
