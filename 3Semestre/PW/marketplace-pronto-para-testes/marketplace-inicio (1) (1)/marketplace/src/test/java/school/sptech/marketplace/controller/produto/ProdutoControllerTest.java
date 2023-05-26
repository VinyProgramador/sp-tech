package school.sptech.marketplace.controller.produto;
//Nome: Vinicius A Nunes
//RA: 01221125
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import school.sptech.marketplace.controller.produto.builder.ProdutoBuilder;
import school.sptech.marketplace.domain.exception.EntidadeNaoEncontradaException;
import school.sptech.marketplace.domain.produto.Produto;
import school.sptech.marketplace.domain.produto.data.ProdutoRepository;
import school.sptech.marketplace.service.produto.ProdutoService;
import school.sptech.marketplace.service.produto.dto.ProdutoAtualizacaoDto;
import school.sptech.marketplace.service.produto.dto.ProdutoConsultaDto;
import school.sptech.marketplace.service.produto.dto.ProdutoCriacaoDto;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ProdutoControllerTest {
    @Mock
    private ProdutoRepository produtoRepository;
    @InjectMocks
    private ProdutoService produtoService;

    @Test
    @DisplayName("Returns to empty list if there is no product")
    void returnsToEmptyListIfThereisNoProduct() {
        //given
        //when
        Mockito.when(produtoRepository.findAll()).thenReturn(new ArrayList<>());
        //then
        List<ProdutoConsultaDto> produtoList = produtoService.listar();
        //assert
        assertTrue(produtoList.isEmpty());
    }

    @Test
    @DisplayName("returns product with search by id if id exists")
    void returnsProductWithSearchByIdIfIdExists() {
        //given
        Produto product = ProdutoBuilder.criarProduto();
        // when
        Mockito.when(produtoRepository.findById(1L)).thenReturn(Optional.of(product));
        //then
        ProdutoConsultaDto productResponse = produtoService.buscarPorId(1L);
        //assert
        assertNotNull(productResponse);
        assertEquals(product.getId(), productResponse.getId());
        assertEquals(product.getNome(), productResponse.getNome());
        assertEquals(product.getDescricao(), productResponse.getDescricao());
        assertEquals(product.getPreco(), productResponse.getPreco());
        assertEquals(product.getQuantidade(), productResponse.getQuantidade());
    }

    @Test
    @DisplayName("return exception when searching for product by id and the id does not exist")
    void exceptionWhenSearchingForProductByIdAndTheIdDoesNotExist() {
        //given
        Long id = 1L;
        //when
        Mockito.when(produtoRepository.findById(id)).thenReturn(Optional.empty());
        //then
        RuntimeException exception = assertThrows(RuntimeException.class,
                () ->{
                    produtoService.buscarPorId(id);
                });
        //assert
        assertEquals("Produto de id: 1 não encontrado", exception.getMessage());
    }
    @Test
    @DisplayName("must return exception when updating product and there is no product with informed id")
    void mustReturnExceptionWhenUpdatingProductAndThereIsNoProductWithInformedId() {
        //given
        Long id = 2L;
        ProdutoAtualizacaoDto produtoAtualizacaoDto = ProdutoBuilder.criarProdutoAtualizacaoDto();
        //when
        Mockito.when(produtoRepository.existsById(Mockito.anyLong())).thenReturn(false);
        //then
        EntidadeNaoEncontradaException exception = assertThrows(EntidadeNaoEncontradaException.class, () -> {
            produtoService.atualizar(id, produtoAtualizacaoDto);
        });
        //assert
        assertEquals("Produto de id: 2 não encontrado", exception.getMessage());
    }

    @Test
    @DisplayName("create product only if data is valid")
    void createProductOnlyIfDataIsvalid(){
        //given
        Produto product = ProdutoBuilder.criarProduto();
        ProdutoCriacaoDto ProductCreationDto = ProdutoBuilder.criarProdutoCriacaoDto();
        //when
        Mockito.when(produtoRepository.save(Mockito.any(Produto.class))).thenReturn(product);
        //then
        ProdutoConsultaDto response = produtoService.cadastrar(ProductCreationDto);
        //assert
        assertNotNull(response);
        assertEquals(product.getId(), response.getId());
    }

}