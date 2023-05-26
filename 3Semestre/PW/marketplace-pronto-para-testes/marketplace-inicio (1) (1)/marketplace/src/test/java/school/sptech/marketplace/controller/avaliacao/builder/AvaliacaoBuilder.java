package school.sptech.marketplace.controller.avaliacao.builder;
//Nome: Vinicius A Nunes
//RA: 01221125
import school.sptech.marketplace.controller.cliente.builder.ClienteBuilder;
import school.sptech.marketplace.controller.produto.builder.ProdutoBuilder;
import school.sptech.marketplace.domain.produto.avaliacao.AvaliacaoClienteProduto;
import school.sptech.marketplace.service.avaliacao.dto.avaliacao.AvaliacaoClienteProdutoAlteracaoDto;
import school.sptech.marketplace.service.avaliacao.dto.avaliacao.AvaliacaoClienteProdutoCriacaoDto;

import java.util.List;

public class AvaliacaoBuilder {
    public AvaliacaoBuilder() {
        throw new IllegalStateException("Utility Class");
    }

    public static AvaliacaoClienteProduto criarAvaliacao() {
        return new AvaliacaoClienteProduto(ClienteBuilder.criarCliente(), ProdutoBuilder.criarProduto(), 3, "Comment");
    }

    public static AvaliacaoClienteProdutoCriacaoDto criarAvaliacaoCriacaoDto() {
        return new AvaliacaoClienteProdutoCriacaoDto("Comment", 4, 1L, 1L);
    }

    public static AvaliacaoClienteProdutoCriacaoDto criarAvaliacaoCriacaoDto(AvaliacaoClienteProduto avaliacao) {
        return new AvaliacaoClienteProdutoCriacaoDto(avaliacao.getComentario(), avaliacao.getNota(), avaliacao.getComprador().getId(), avaliacao.getProduto().getId());
    }

    public static AvaliacaoClienteProdutoAlteracaoDto criarAvaliacaoAlteracaoDto() {
        return new AvaliacaoClienteProdutoAlteracaoDto("updated comment", 4);
    }

    public static List<AvaliacaoClienteProduto> listaAvaliacao() {
        return List.of(
                new AvaliacaoClienteProduto(ClienteBuilder.criarCliente(), ProdutoBuilder.criarProduto(), 3, "Comment ipsum"),
                new AvaliacaoClienteProduto(ClienteBuilder.criarCliente(), ProdutoBuilder.criarProduto(), 4, "Comment lorem"),
                new AvaliacaoClienteProduto(ClienteBuilder.criarCliente(), ProdutoBuilder.criarProduto(), 5, "Comment xpto")
        );
    }
}
