package school.sptech.projeto1.heranca;

import java.util.ArrayList;
import java.util.List;

/*
    NÃO ESQUEÇA DE ALTERAR O NOME DO SEU PROJETO PARA:
    
    SEURA-SEUNOME-PROVA2

    COMO FAZER ISSO?

    1. CLIQUE COM O BOTÃO DIREITO EM CIMA DO PROJETO (ICONE DE CANECA)
    2. SELECIONE A OPÇÃO RENOMEAR OU "RENAME"
    3. ALTERE OS TRES NOMES PARA O PADRÃO MENCIONADO ACIMA
        - DISPLAY NAME
        - ARTIFACT
        - FOLDER
 */
public class Carrinho {

    List<Produto> produtos;

    public Carrinho() {
        this.produtos = new ArrayList();
    }

    /**
     * Adiciona um {@link Produto} novo no carrinho. Caso o valor seja
     * {@link null} o {@link Produto} não deve ser adicionado
     *
     * @param produto Novo {@link Produto} a ser adicionado
     */
    public void adicionarProduto(Produto produto) {
        if (produto != null) {
            produtos.add(produto);
        }
    }

    /**
     * Remove um {@link Produto} do carrinho pelo índice. Caso o índice do
     * produto for inválido o método não deve lançar um erro de execução
     *
     * @param indice Índice do {@link Produto} que será removido
     */
    public void removerProduto(int indice) {
        if (indice >= 0 && indice <= produtos.size()) {
            produtos.remove(indice);
        }
    }

    /**
     * Calcula o valor total de todos os itens do carrinho.
     *
     * @return valor total do carrinho
     */
    public Double calcularTotal() {
        Double valorFinal = 0.0;
        for (int i = 0; i < produtos.size(); i++) {
            valorFinal += produtos.get(i).getPreco();
        }
        return valorFinal;
    }

    /**
     * Calcula o valor das parcelas de acordo com o número de vezes que o
     * usuário deseja parcelar.
     *
     * @param vezes Número de vezes que o usuário deseja parcelar
     * @return total do carrinho parcelado
     */
    public Double parcelarCompra(Integer vezes) {
        Double valorDaParcela = calcularTotal() / vezes;
        return valorDaParcela;
    }

    /**
     * Encontra um {@link Produto} com o índice desejado. Caso o índice não seja
     * encontrado retorne {@link null}
     *
     * @param index Índice do {@link Produto}
     * @return {@link Produto} encontrado
     */
    public Produto findProdutoPeloIndice(Integer index) {

        if (index >= 0 && index < produtos.size()) {
            return produtos.get(index);
        } else {
            return null;
        }
    }

    /**
     * Encontra um {@link Produto} com o nome desejado ignorando letras
     * maiúsculas e minúsculas.
     *
     * Caso um {@link Produto} não seja encontrado retorne {@link null}
     *
     * @param nome Nome do {@link Produto}
     * @return {@link Produto} encontrado
     */
    public Produto findProdutoPeloNome(String nomePdt) {
        if (nomePdt != null) {
            for (int i = 0; i < produtos.size(); i++) {
                String produtoDaVez = produtos.get(i).getNome();
                if (produtoDaVez.equalsIgnoreCase(nomePdt)) {
                    return produtos.get(i);
                }
            }
        }
        return null;
    }

    /**
     * Encontra todos os {@link Produto} de uma determinada categoria ignorando
     * letras maiúsculas e minúsculas.
     *
     * Caso não encontre nenhum {@link Produto} devolva uma lista vazia
     *
     * @param categoria Categoria desejada
     * @return Produtos encontrados
     */
    public List<Produto> findProdutoPorCategoria(String categoria) {
        List<Produto> produtosPorCategoria = new ArrayList();
        if (categoria != null) {
            for (int i = 0; i < produtos.size(); i++) {
                String produtoDaVez = produtos.get(i).getCategoria();
                if (produtoDaVez.equalsIgnoreCase(categoria)) {
                    produtosPorCategoria.add(produtos.get(i));
                }
            }
            return produtosPorCategoria;
        }
        return null;
    }

    /**
     * Encontra todos os {@link ProdutoInternacional} presentes no
     * {@link Carrinho}. Caso não encontre nenhum {@link ProdutoInternacional}
     * devolva uma lista vazia
     *
     * @return Produtos internacionais encontrados
     */
    public Integer countProdutosInternacionais() {
        Integer qtdPdtInternacionais = 0;

        for (Produto produtoDaVez : produtos) {
            if (produtoDaVez instanceof ProdutoInternacional) {
                qtdPdtInternacionais++;
            }
        }
        return qtdPdtInternacionais;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }
}
