package org.example;
//Nome: Vinicius A Nunes
//RA: 01221125
public class Banco {

    // Atributos
    PilhaObj<Operacao> pilhaOperacao = new PilhaObj(10);
    FilaObj<Operacao> filaOperacao = new FilaObj(10);
    // Contador de operações empilhadas
    Integer contadorOperacao = 0;

    // Métodos

    /* Método debitar - recebe o valor a ser debitado e o objeto conta bancária
       Se o débito ocorreu com sucesso, cria um objeto Operacao com os valores adequados
       e empilha a operação para poder ser desfeita. Atualiza contadorOperacao.
     */
    public void debitar(Double valor, ContaBancaria conta) {
        if (conta.debitar(valor)) {
            try {
                pilhaOperacao.push(new Operacao(conta, "Débito", valor));
                contadorOperacao++;
            } catch (IllegalArgumentException e) {
                System.out.println("invalid operation.");
            }
        }
    }

    /* Método creditar - recebe o valor a ser depositado e o objeto conta bancária
       Executa o depósito, cria um objeto Operacao com os valores adequados
       e empilha a operação para poder ser desfeita. Atualiza contadorOperacao.
     */
    public void creditar(Double valor, ContaBancaria conta) {
        conta.creditar(valor);
        try {
            pilhaOperacao.push(new Operacao(conta, "Depósito", valor));
            contadorOperacao++;
        } catch (IllegalArgumentException e) {
            System.out.println("invalid operation.");
        }
    }

    /* Método desfazerOperacao - recebe a quantidade de operações a serem desfeitas
       Se essa quantidade for inválida, lança IllegalArgumentException
       Senão, "desfaz" a quantidade de operações passadas como argumento
       e atualiza o contadorOperacao
     */
    public void desfazerOperacao(Integer qtdOperacaoDesfeita) {
        if (qtdOperacaoDesfeita > contadorOperacao || qtdOperacaoDesfeita == 0) {
            throw new IllegalArgumentException("This amount is invalid!");
        }

        contadorOperacao -= qtdOperacaoDesfeita;

        while (qtdOperacaoDesfeita != 0) {
            Operacao operacao = pilhaOperacao.pop();
            ContaBancaria conta = operacao.getContaBancaria();
            if (operacao.getTipoOperacao().equalsIgnoreCase("Débito")) {
                conta.creditar(operacao.getValor());
            } else {
                conta.debitar(operacao.getValor());
            }
            qtdOperacaoDesfeita--;
        }
    }


    /* Método agendarOperacao - recebe o tipo da operaçõa, o valor e o objeto conta bancária
       Se um dos argumentos for inválido, lança IllegalArgumentException.
       Senão, cria um objeto Operacao e insere esse objeto na fila.
    */
    public void agendarOperacao(String tipoOperacao, Double valor, ContaBancaria conta) {
        if (
                tipoOperacao.equalsIgnoreCase("Depósito") ||
                        tipoOperacao.equalsIgnoreCase("Débito") &&
                                valor > 0 &&
                                conta != null
        ) {
            try {
                filaOperacao.insert(new Operacao(conta, tipoOperacao, valor));
            } catch (IllegalArgumentException e) {
                System.out.println("invalid operation");
            }
        } else {
            throw new IllegalArgumentException("One of the values \u200B\u200Bis wrong.");
        }
    }

    /* Método executarOperacoesAgendadas
       Se não houver operações na fila, exibe mensagem de que não há operações agendadas.
       Senão, esvazia a fila, executando cada uma das operações agendadas.
    */
    public void executarOperacoesAgendadas() {
        if (filaOperacao.isEmpty()) System.out.println("There are no operations scheduled.");
        while (!filaOperacao.isEmpty()) filaOperacao.poll();
    }

    // Gettens
    public PilhaObj<Operacao> getPilhaOperacao() {
        return pilhaOperacao;
    }

    public FilaObj<Operacao> getFilaOperacao() {
        return filaOperacao;
    }

    public Integer getContadorOperacao() {
        return contadorOperacao;
    }
}
