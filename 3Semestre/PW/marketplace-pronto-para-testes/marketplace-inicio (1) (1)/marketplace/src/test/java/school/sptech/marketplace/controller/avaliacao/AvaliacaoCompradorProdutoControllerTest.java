package school.sptech.marketplace.controller.avaliacao;
//Nome: Vinicius A Nunes
//RA: 01221125
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import school.sptech.marketplace.controller.avaliacao.builder.AvaliacaoBuilder;
import school.sptech.marketplace.controller.cliente.builder.ClienteBuilder;
import school.sptech.marketplace.controller.produto.builder.ProdutoBuilder;
import school.sptech.marketplace.domain.cliente.Cliente;
import school.sptech.marketplace.domain.cliente.data.ClienteRepository;
import school.sptech.marketplace.domain.exception.EntidadeNaoEncontradaException;
import school.sptech.marketplace.domain.produto.Produto;
import school.sptech.marketplace.domain.produto.avaliacao.AvaliacaoClienteProduto;
import school.sptech.marketplace.domain.produto.avaliacao.data.AvaliacaoClienteProdutoRepository;
import school.sptech.marketplace.domain.produto.data.ProdutoRepository;
import school.sptech.marketplace.service.avaliacao.AvaliacaoService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class AvaliacaoCompradorProdutoControllerTest {
    @Mock
    private AvaliacaoClienteProdutoRepository avaliacaoClienteProdutoRepository;
    @InjectMocks
    private AvaliacaoService avaliacaoService;

    @Mock
    private ClienteRepository clienteRepository;

    @Mock
    private ProdutoRepository produtoRepository;
    @Test
    @DisplayName("When activated and there are no items, it should return an empty list.")
    void whenTriggeredWhenThereAreNoItemsItShouldReturnEmptylist() {
        //given
        //when
        when(avaliacaoClienteProdutoRepository.findAll()).thenReturn(List.of());
        //then
        List<AvaliacaoClienteProduto> avaliacoes = avaliacaoService.listar();
        //assert
        assertTrue(avaliacoes.isEmpty());
    }

    @Test
    @DisplayName("Test Fetch Review by Valid ID")
    public void testSearchReviewByValidId() {
        //given
        long id = 1L;
        AvaliacaoClienteProduto avaliacao = new AvaliacaoClienteProduto();
        //when
        when(avaliacaoClienteProdutoRepository.findById(id)).thenReturn(Optional.of(avaliacao));
        //then
        AvaliacaoClienteProduto resultado = avaliacaoService.buscarPorId(id);
        //assert
        assertEquals(avaliacao, resultado);
    }

    @Test
    @DisplayName("test list reviews")
    public void testListRatings() {
        //given
        List<AvaliacaoClienteProduto> avaliacoes = new ArrayList<>();
        avaliacoes.add(new AvaliacaoClienteProduto());
        //when
        when(avaliacaoClienteProdutoRepository.findAll()).thenReturn(avaliacoes);
        //then
        List<AvaliacaoClienteProduto> resultado = avaliacaoService.listar();
        //assert
        assertEquals(avaliacoes, resultado);
    }

    @Test
    @DisplayName("When valid data is entered, a new evaluation must be saved.")
    void WhenInformedValidDataMustSaveAssessment() {
        //given
        long id = 1L;
        Cliente cli = ClienteBuilder.criarCliente();
        Produto pdt = ProdutoBuilder.criarProduto();
        AvaliacaoClienteProduto avaliacao = AvaliacaoBuilder.criarAvaliacao();
        //when
        Mockito.when(clienteRepository.findById(id)).thenReturn(Optional.of(cli));
        Mockito.when(produtoRepository.findById(id)).thenReturn(Optional.of(pdt));
        Mockito.when(avaliacaoClienteProdutoRepository.save(Mockito.any(AvaliacaoClienteProduto.class))).thenReturn(avaliacao);
        //then
        AvaliacaoClienteProduto avaliacaoNova = avaliacaoService.cadastrar(AvaliacaoBuilder.criarAvaliacaoCriacaoDto(avaliacao));
        //assert
        assertNotNull(avaliacaoNova);
    }
}