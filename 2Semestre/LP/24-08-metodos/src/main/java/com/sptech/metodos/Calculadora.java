package com.sptech.metodos;
public class Calculadora {
    
    //Esse método não é void
    //Ele tem retorno, e o retorno é Double!
    Double somar(Double num1, Double num2){
        Double soma = num1 + num2;             
        return soma;
    }
   
    Boolean isNumeroPar(Double numero){
        
        Boolean isPar = numero % 2 == 0;      
        
        return isPar;   
    }
}
