package com.arquitetura.hexagonal.adapters.out.repository;

import com.arquitetura.hexagonal.adapters.out.repository.mapper.ClienteEntityMapper;
import com.arquitetura.hexagonal.application.core.domain.Cliente;
import com.arquitetura.hexagonal.application.ports.out.AtualizarClienteOutputPort;
import org.springframework.beans.factory.annotation.Autowired;

public class BuscarClienteAdapter implements AtualizarClienteOutputPort {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ClienteEntityMapper clienteEntityMapper;

    @Override
    public void atualizar(Cliente cliente) {
        var clienteEntity = clienteEntityMapper.toClienteEntity(cliente);
        clienteRepository.save(clienteEntity);
    }
}
