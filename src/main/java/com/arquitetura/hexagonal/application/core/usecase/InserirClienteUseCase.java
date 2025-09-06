package com.arquitetura.hexagonal.application.core.usecase;

import com.arquitetura.hexagonal.application.core.domain.Cliente;
import com.arquitetura.hexagonal.application.ports.in.InserirClienteInputPort;
import com.arquitetura.hexagonal.application.ports.out.BuscarEnderecoPeloCepOutputPort;
import com.arquitetura.hexagonal.application.ports.out.EnviaCpfParaValidacaoOutputPort;
import com.arquitetura.hexagonal.application.ports.out.InserirClienteOutputPort;

public class InserirClienteUseCase implements InserirClienteInputPort {

    private final BuscarEnderecoPeloCepOutputPort buscarEnderecoPeloCepOutputPort;
    private final InserirClienteOutputPort insertCustomerOutputPort;
    private final EnviaCpfParaValidacaoOutputPort enviaCpfParaValidacaoOutputPort;

    public InserirClienteUseCase(BuscarEnderecoPeloCepOutputPort buscarEnderecoPeloCepOutputPort,
                                 InserirClienteOutputPort insertCustomerOutputPort,
                                 EnviaCpfParaValidacaoOutputPort enviaCpfParaValidacaoOutputPort) {
        this.buscarEnderecoPeloCepOutputPort = buscarEnderecoPeloCepOutputPort;
        this.insertCustomerOutputPort = insertCustomerOutputPort;
        this.enviaCpfParaValidacaoOutputPort = enviaCpfParaValidacaoOutputPort;
    }

    @Override
    public void inserir(Cliente cliente, String cep) {
        var endereco = buscarEnderecoPeloCepOutputPort.buscar(cep);
        cliente.setEndereco(endereco);
        insertCustomerOutputPort.inserir(cliente);
        enviaCpfParaValidacaoOutputPort.enviar(cliente.getCpf());
    }
}
