package com.sptech.metodos;

/**
 *
 * @author miniguiti
 */
public class Utilitaria {
    
    //Assinatura do Método;
    //Retorno: nesse caso vazio, é void!
    //Nome: nesse caso exibirLinha
    //Argumentos: dentro dos (), esse não tem
    //Corpo: tudo que tem dentro das {}
    
    void exibirLinha(){
        System.out.println("---------------------------*");        
    }
    
    //Método com Argumento
    void exibirNome(String nomeUsuario){
        System.out.println(String.format("-> Nome: %s", nomeUsuario));
    }
    
    //Um método pode chamar outros métodos
    void exibirNomeDecorado(String nome){
        exibirLinha();
        exibirNome(nome);
        exibirLinha();
    }
}
