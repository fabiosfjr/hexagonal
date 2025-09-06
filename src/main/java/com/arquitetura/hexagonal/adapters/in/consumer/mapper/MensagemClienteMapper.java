package com.arquitetura.hexagonal.adapters.in.consumer.mapper;

import com.arquitetura.hexagonal.adapters.in.consumer.mensagem.MensagemCliente;
import com.arquitetura.hexagonal.application.core.domain.Cliente;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface MensagemClienteMapper {

    @Mapping(target = "endereco", ignore = true)
    Cliente toCliente(MensagemCliente mensagemCliente);
}
