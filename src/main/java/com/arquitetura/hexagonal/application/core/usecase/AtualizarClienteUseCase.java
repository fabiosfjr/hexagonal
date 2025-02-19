package com.arquitetura.hexagonal.application.core.usecase;

import com.arquitetura.hexagonal.application.core.domain.Cliente;
import com.arquitetura.hexagonal.application.ports.in.BuscarClientePeloIdInputPort;
import com.arquitetura.hexagonal.application.ports.out.AtualizarClienteOutputPort;
import com.arquitetura.hexagonal.application.ports.out.BuscarEnderecoPeloCepOutputPort;

public class AtualizarClienteUseCase {

    private final BuscarClientePeloIdInputPort buscarClientePeloIdInputPort;

    private final BuscarEnderecoPeloCepOutputPort buscarEnderecoPeloCepOutputPort;

    private final AtualizarClienteOutputPort atualizarClienteOutputPort;

    public AtualizarClienteUseCase(BuscarClientePeloIdInputPort buscarClientePeloIdInputPort,
                                   BuscarEnderecoPeloCepOutputPort buscarEnderecoPeloCepOutputPort,
                                   AtualizarClienteOutputPort atualizarClienteOutputPort) {
        this.buscarClientePeloIdInputPort = buscarClientePeloIdInputPort;
        this.buscarEnderecoPeloCepOutputPort = buscarEnderecoPeloCepOutputPort;
        this.atualizarClienteOutputPort = atualizarClienteOutputPort;
    }

    public void atualizar(Cliente cliente, String cep) {
        buscarClientePeloIdInputPort.buscar(cliente.getId());
        var endereco = buscarEnderecoPeloCepOutputPort.buscar(cep);
        cliente.setEndereco(endereco);
        atualizarClienteOutputPort.atualizar(cliente);
    }
}
