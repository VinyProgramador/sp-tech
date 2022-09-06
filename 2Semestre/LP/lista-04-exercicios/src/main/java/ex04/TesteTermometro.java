package ex04;


public class TesteTermometro {

    public static void main(String[] args) {
        Termometro termometroTeste = new Termometro();
        termometroTeste.temperaturaAtual = 10.0;
        termometroTeste.temperaturaMax = 12.0;
        termometroTeste.temperaturaMin = 3.0;
        
        termometroTeste.AumentarTemperatura(10.0);
        termometroTeste.diminuiTemperatura(60.0);
        termometroTeste.exibeFahreinheit();
    }
    
}
