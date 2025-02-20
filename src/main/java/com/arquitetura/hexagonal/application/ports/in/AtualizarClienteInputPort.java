package com.arquitetura.hexagonal.application.ports.in;

import com.arquitetura.hexagonal.application.core.domain.Cliente;

public interface AtualizarClienteInputPort {

    void atualizar(Cliente cliente, String cep);
}
