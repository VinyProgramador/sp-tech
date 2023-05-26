package school.sptech.marketplace.controller.produto.builder;

import school.sptech.marketplace.domain.produto.Produto;
import school.sptech.marketplace.service.produto.dto.ProdutoAtualizacaoDto;
import school.sptech.marketplace.service.produto.dto.ProdutoConsultaDto;
import school.sptech.marketplace.service.produto.dto.ProdutoCriacaoDto;

import java.util.List;

public class ProdutoBuilder {
    private ProdutoBuilder() {
        throw new IllegalStateException("Utility Class\n");
    }

    public static Produto criarProduto() {
        return new Produto(1L, "Hq do Batman", "Após anos lutando nas noites de gotham o morcego morre.", 50.0, 60);
    }

    public static ProdutoConsultaDto criarProdutoConsultaDto() {
        return new ProdutoConsultaDto(1L, "Hq do Batman", "Após anos lutando nas noites de gotham o morcego morre.", 50.0, 60);
    }

    public static ProdutoCriacaoDto criarProdutoCriacaoDto() {
        return new ProdutoCriacaoDto("Hq do Batman", "Após anos lutando nas noites de gotham o morcego morre.", 50.0, 60);
    }

    public static ProdutoAtualizacaoDto criarProdutoAtualizacaoDto() {
        return new ProdutoAtualizacaoDto("Hq do Batman", "Após anos lutando nas noites de gotham o morcego morre.", 50.0, 60);
    }

    public static List<Produto> criarListaProduto(){
        return List.of(
                new Produto(1L,"Hq do Batman", "Após anos lutando nas noites de gotham o morcego morre.", 50.0, 60),
                new Produto(2L,"Hq do Super-Man", "O primeiro encontro com Lex luthor.", 20.0, 90),
                new Produto(3L,"Hq da Mulher-Maravilha", "A guerreira nos tempos modernos.", 50.0, 30)
        );
    }
}