package com.arquitetura.hexagonal.adapters.out.client.mapper;

import com.arquitetura.hexagonal.adapters.out.client.response.EnderecoResponse;
import com.arquitetura.hexagonal.application.core.domain.Endereco;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EnderecoResponseMapper {

    Endereco toEndereco(EnderecoResponse enderecoResponse);
}
