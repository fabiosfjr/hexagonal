package com.arquitetura.hexagonal.application.ports.out;

import com.arquitetura.hexagonal.application.core.domain.Endereco;

public interface BuscarEnderecoPeloCepOutputPort {

    Endereco buscar(String cep);

}
