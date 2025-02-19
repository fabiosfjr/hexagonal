package com.arquitetura.hexagonal.adapters.out;

import com.arquitetura.hexagonal.adapters.out.repository.ClienteRepository;
import com.arquitetura.hexagonal.adapters.out.repository.mapper.ClienteEntityMapper;
import com.arquitetura.hexagonal.application.core.domain.Cliente;
import com.arquitetura.hexagonal.application.ports.out.BuscarClientePorIdOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class BuscarClientePeloIdAdapter implements BuscarClientePorIdOutputPort {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ClienteEntityMapper clienteEntityMapper;

    @Override
    public Optional<Cliente> buscar(String id) {
        var clienteEntity = clienteRepository.findById(id);
        return clienteEntity.map(entity -> clienteEntityMapper.toCliente(entity));
    }
}
