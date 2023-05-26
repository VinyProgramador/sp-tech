package school.sptech.marketplace.controller.cliente;
//Nome: Vinicius A Nunes
//RA: 01221125

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import school.sptech.marketplace.controller.cliente.builder.ClienteBuilder;
import school.sptech.marketplace.domain.cliente.Cliente;
import school.sptech.marketplace.domain.cliente.data.ClienteRepository;
import school.sptech.marketplace.domain.exception.EntidadeNaoEncontradaException;
import school.sptech.marketplace.service.cliente.ClienteService;
import school.sptech.marketplace.service.cliente.dto.ClienteAtualizacaoDto;
import school.sptech.marketplace.service.cliente.dto.ClienteConsultaDto;
import school.sptech.marketplace.service.cliente.dto.ClienteCriacaoDto;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ClienteControllerTest {
    @Mock
    private ClienteRepository clienteRepository;
    @InjectMocks
    private ClienteService clienteService;

    @Test
    @DisplayName("Add 2 customers and see if it returns the correct list size")
    public void add2CustomersAndSeeIfItReturnsTheCorrectListSize() {
        //given
        List<Cliente> clients = new ArrayList<>();
        clients.add(new Cliente());
        clients.add(new Cliente());
        //when
        Mockito.when(clienteRepository.findAll()).thenReturn(clients);
        //then
        List<ClienteConsultaDto> result = clienteService.listar();
        //assert
        assertEquals(2, result.size());
    }

    @Test
    @DisplayName("Test to list empty customers")
    public void Tolistemptycustomers() {
        //given
        List<Cliente> clients = new ArrayList<>();
        //when
        Mockito.when(clienteRepository.findAll()).thenReturn(clients);
        //then
        List<ClienteConsultaDto> result = clienteService.listar();
        //assert
        assertTrue(result.isEmpty());
    }

    @Test
    @DisplayName("When activated and the id is invalid, it should return an EntidadeNotFoundException.")
    void whenTriggeredInvalidIdMustReturnAnException() {
        //given
        Long id = 1L;
        String mensagemEsperada = String.format("Cliente de id: %d não encontrado", id);
        //when
        Mockito.when(clienteRepository.findById(id)).thenReturn(Optional.empty());
        //then
        EntidadeNaoEncontradaException exception = assertThrows(
                EntidadeNaoEncontradaException.class,
                () -> clienteService.buscarPorId(id)
        );
        //assert
        assertEquals(mensagemEsperada, exception.getMessage());
    }

    @Test
    @DisplayName("When valid data is entered, the client must be updated.")
    void whenInformedDataValidMustUpdateCustomer() {
        //given
        long id = 1L;
        Cliente cliente = ClienteBuilder.criarCliente();
        ClienteAtualizacaoDto clienteAtualizacaoDto = ClienteBuilder.criarClienteAtualizacaoDto();
        //when
        Mockito.when(clienteRepository.findById(id)).thenReturn(Optional.of(cliente));
        Mockito.when(clienteRepository.save(Mockito.any(Cliente.class))).thenReturn(cliente);
        //then
        ClienteConsultaDto clienteConsultaDto = clienteService.atualizar(id, clienteAtualizacaoDto);
        ///assert
        assertNotNull(clienteConsultaDto);
    }

    @Test
    @DisplayName("When activated and the id is invalid, it should return an EntidadeNotFoundException.")
    void whenTriggeredInvalidIdMustReturnException() {
        //given
        long id = 1L;
        String mensagem = String.format("Avaliacao de id %d nao encontrada", id);
        //when
        Mockito.when(clienteRepository.findById(id)).thenReturn(Optional.empty());
        //then
        EntidadeNaoEncontradaException exception = assertThrows(EntidadeNaoEncontradaException.class,
                () -> clienteService.buscarPorId(id)
        );
        //assert
        assertEquals(mensagem, exception.getMessage());
    }
}