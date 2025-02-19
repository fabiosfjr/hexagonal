package com.arquitetura.hexagonal.application.ports.out;

import com.arquitetura.hexagonal.application.core.domain.Cliente;

public interface AtualizarClienteOutputPort {

    void atualizar(Cliente cliente);
}
