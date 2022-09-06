package ex02;

public class Encomenda {

     String tamanho;
    String enderecoDoRemetente;
    String enderecoDoDestinatario;
    Double distancia = 0.0;
    Double valorEncomenda = 0.0;

    Double calcularFrete() {
        Double tamanhoDoAcrescimo = 0.0;
        Double distanciaAcrescimo = 0.0;

         if (tamanho.equals("P")) {
             tamanhoDoAcrescimo = valorEncomenda * 0.01;
           } else if (tamanho.equals("M")) {
            tamanhoDoAcrescimo = valorEncomenda * 0.03;
        } else if (tamanho.equals("G")) {
              tamanhoDoAcrescimo = valorEncomenda * 0.05;
        } else {
            System.out.println("Digite um tamanho válido");
         }

          if (distancia <= 50.0) {
            distanciaAcrescimo = 3.0;
          } else if (distancia <= 200) {
            distanciaAcrescimo = 5.0;
             } else {
            distanciaAcrescimo = 7.0;
          }

        return tamanhoDoAcrescimo + distanciaAcrescimo;
    }

      void emitirEtiqueta() {
        Double frete = calcularFrete();
          Double valorTotal = frete + valorEncomenda;
        System.out.println(String.format("***ETIQUETA PARA ENVIO***\n"
                + "\n"
                + "Endereço do remetente: %s\n"
                + "\n"
                + "Endereço do destinatário: %s\n"
                + "\n"
                + "Tamanho: %s\n"
                + "\n"
                + "-------------------------------\n"
                + "\n"
                + "Valor encomenda: R$ %.2f\n"
                + "\n"
                + "Valor frete: R$ %.2f \n"
                + "\n"
                + "-------------------------------\n"
                + "\n"
                + "Valor total: R$ %.2f\n"
                + "", enderecoDoRemetente, enderecoDoDestinatario, tamanho, valorEncomenda, frete, valorTotal));
    }

}
