package com.arquitetura.hexagonal.adapters.out;

import com.arquitetura.hexagonal.adapters.out.repository.ClienteRepository;
import com.arquitetura.hexagonal.application.ports.out.ExcluirClientePeloIdOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ExcluirClientePeloIdAdapter implements ExcluirClientePeloIdOutputPort {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public void excluir(String id) {
        clienteRepository.deleteById(id);
    }
}
