package com.sptech.sugundo.nivelamento;

/**
 *
 * @author miniguiti
 */
public class Interpolacao {
    public static void main(String[] args) {
        //No JavaScrit ${}
        
        String nome = "Giuliana Miniguiti";
        Integer idade = 42;
        Double altura = 1.555;
               
        // %s para String
        // %d para Integer
        // %.2f para Double (pode ser qualquer quantidade de casas decimais)
        
        // Os parâmetros devem ser passados na ordem da string
        String frase = String.format("Meu nome é %s, tenho %d anos, e %.2f de altura.\nO nome do meu pet é %s", 
                                        nome,
                                        idade,
                                        altura,
                                        "Snoop");
                
        // A classe Math tem métodos para arredondamento
        // Math.ceil() Math.floor() Math.round()
        
        System.out.println(frase);
        
    }
}
