package com.arquitetura.hexagonal.application.core.usecase;

import com.arquitetura.hexagonal.application.ports.in.BuscarClientePeloIdInputPort;
import com.arquitetura.hexagonal.application.ports.out.ExcluirClientePeloIdOutputPort;

public class ExcluirClientePeloIdUseCase {

    private final BuscarClientePeloIdInputPort buscarClientePeloIdInputPort;

    private final ExcluirClientePeloIdOutputPort excluirClientePeloIdOutputPort;

    public ExcluirClientePeloIdUseCase(
            BuscarClientePeloIdInputPort buscarClientePeloIdInputPort,
            ExcluirClientePeloIdOutputPort excluirClientePeloIdOutputPort
    ) {
        this.buscarClientePeloIdInputPort = buscarClientePeloIdInputPort;
        this.excluirClientePeloIdOutputPort = excluirClientePeloIdOutputPort;
    }

    public void excluir(String id) {
        buscarClientePeloIdInputPort.buscar(id);
        excluirClientePeloIdOutputPort.excluir(id);
    }
}
