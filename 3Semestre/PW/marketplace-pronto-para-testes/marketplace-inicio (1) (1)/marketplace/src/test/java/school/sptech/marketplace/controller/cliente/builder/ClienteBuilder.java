package school.sptech.marketplace.controller.cliente.builder;

import school.sptech.marketplace.domain.cliente.Cliente;
import school.sptech.marketplace.service.cliente.dto.ClienteAtualizacaoDto;
import school.sptech.marketplace.service.cliente.dto.ClienteConsultaDto;
import school.sptech.marketplace.service.cliente.dto.ClienteCriacaoDto;

import java.util.List;

public class ClienteBuilder {
    private ClienteBuilder(){
        throw new IllegalStateException("Utility Class\n");
    }

    public static Cliente criarCliente(){
        return new Cliente();
    }
    public static ClienteConsultaDto criarClienConsultaDto(){
        return new ClienteConsultaDto();
    }
    public static ClienteCriacaoDto criarClienteCriacaoDto(){
        return new ClienteCriacaoDto();
    }
    public static ClienteAtualizacaoDto criarClienteAtualizacaoDto() {
        return new ClienteAtualizacaoDto();
    }
    public static ClienteAtualizacaoDto criarProdutoAtualizacaoDto(){
        return new ClienteAtualizacaoDto();
    }

}
