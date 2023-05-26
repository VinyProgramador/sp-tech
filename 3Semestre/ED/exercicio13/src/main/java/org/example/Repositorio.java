package org.example;
import java.util.ArrayList;
import java.util.List;
//Nome: Vinicius A Nunes
//RA: 01221125
public class Repositorio {
    private List<Tema> lista;
    private PilhaObj<Tema> pilha;
    private FilaObj<Tema> fila;

    public Repositorio() {
        lista = new ArrayList<>();
        pilha = new PilhaObj<>(10);
        fila = new FilaObj<>(10);
    }

    public void salvar(Tema obj) {
        lista.add(obj);
    }

    public void deletarPeloId(int id) {
        Tema temaRemovido = null;

        for (Tema tema : lista) {
            if (tema.getId() == id) {
                temaRemovido = tema;
                break;
            }
        }

        if (temaRemovido != null) {
            pilha.push(temaRemovido);
            lista.remove(temaRemovido);
            System.out.println("Tema removido com sucesso.");
        } else {
            System.out.println("ID inválido.");
        }
    }

    public void desfazer() {
        if (!pilha.isEmpty()) {
            Tema temaDesfazer = pilha.pop();
            lista.add(temaDesfazer);
            System.out.println("Operação desfeita.");
        } else {
            System.out.println("Nenhuma operação a desfazer.");
        }
    }

    public void agendarSalvar(Tema obj) {
        fila.insert(obj);
        System.out.println("Tema agendado para salvar.");
    }

    public void executarAgendado(int qtdOperacoes) {
        if (qtdOperacoes <= 0 || qtdOperacoes > fila.getTamanho()) {
            System.out.println("Quantidade de operações inválida.");
        } else if (fila.isEmpty()) {
            System.out.println("Nenhuma operação agendada.");
        } else {
            for (int i = 0; i < qtdOperacoes; i++) {
                Tema temaAgendado = fila.poll();
                salvar(temaAgendado);
            }
            System.out.println("Operações agendadas executadas.");
        }
    }

    public void exibirRepositorio() {
        System.out.println("Conteúdo da lista:");
        for (Tema tema : lista) {
            System.out.println(tema.getId() + " - " + tema.getNome());
        }

        System.out.println("Conteúdo da pilha:");
        pilha.exibe();

        System.out.println("Conteúdo da fila:");
        fila.exibe();
    }

    public int getTamanho() {
        return lista.size();
    }
}
