package com.arquitetura.hexagonal.application.core.usecase;

import com.arquitetura.hexagonal.application.core.domain.Cliente;
import com.arquitetura.hexagonal.application.ports.in.BuscarClientePeloIdInputPort;
import com.arquitetura.hexagonal.application.ports.out.BuscarClientePorIdOutputPort;

public class BuscarClientePeloIdUseCase implements BuscarClientePeloIdInputPort {

    private final BuscarClientePorIdOutputPort buscarClientePorIdOutputPort;

    public BuscarClientePeloIdUseCase(BuscarClientePorIdOutputPort buscarClientePorIdOutputPort) {
        this.buscarClientePorIdOutputPort = buscarClientePorIdOutputPort;
    }

    @Override
    public Cliente buscar(String id) {
        return buscarClientePorIdOutputPort.buscar(id)
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado"));
    }
}
