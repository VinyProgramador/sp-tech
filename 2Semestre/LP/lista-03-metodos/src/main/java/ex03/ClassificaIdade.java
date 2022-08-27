package ex03;

public class ClassificaIdade {
    void saberIdade(Integer idadeUser){
        if(idadeUser<3){
            System.out.println("Bebê");
        }
        else if(idadeUser<11){
            System.out.println("Criança");
        }
        else if(idadeUser<19){
            System.out.println("Adolescente");
        }
        else if(idadeUser<30){
            System.out.println("Jovem");
        }
        else if(idadeUser<60){
            System.out.println("Adulto");
        }
        else{
            System.out.println("Idoso");
        }
    }
}
