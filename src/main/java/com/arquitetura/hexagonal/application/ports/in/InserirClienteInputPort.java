package com.arquitetura.hexagonal.application.ports.in;

import com.arquitetura.hexagonal.application.core.domain.Cliente;

public interface InserirClienteInputPort {

    void inserir(Cliente cliente, String cep);
}
