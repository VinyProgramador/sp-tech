package com.mycompany.introducao.poo;

public class BilheteUnico {

    //Atributos == Caracteristicas
    Double saldo;
    String nomeTitular;
    Boolean isBloqueado;
    Boolean isEstudante;

    //Métodos == comportamentos
    void usar() {
        if (isBloqueado) {
            System.out.println(nomeTitular+" Está Bloqueado!");
        } else {
            if (isEstudante) {
                saldo -= 2.20;
            } else {
                saldo -= 4.40;
                System.out.println(nomeTitular+" Voce usou seu bilhete!");
                System.out.println(String.format("%s Novo saldo %.2f", nomeTitular,saldo));
            }
        }
    }

    void carregar(Double valor) {
        if (isBloqueado) {
            System.out.println(nomeTitular+" Está Bloqueado!");
        } else {
            if (valor <= 0) {
                System.out.println("Valor invalido.");
            } else {
                saldo += valor;
            }
        }
    }

    @Override
    public String toString() {
        return "BilheteUnico{" + "saldo=" + saldo + ", nomeTitular=" + nomeTitular + ", isBloqueado=" + isBloqueado + ", isEstudante=" + isEstudante + '}';
    }
    
    
}
