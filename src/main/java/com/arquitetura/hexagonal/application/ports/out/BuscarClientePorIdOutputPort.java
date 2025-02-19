package com.arquitetura.hexagonal.application.ports.out;

import com.arquitetura.hexagonal.application.core.domain.Cliente;

import java.util.Optional;

public interface BuscarClientePorIdOutputPort {

    Optional<Cliente> buscar(String id);
}
