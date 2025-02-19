package com.arquitetura.hexagonal.adapters.out.repository.mapper;

import com.arquitetura.hexagonal.adapters.out.repository.entity.ClienteEntity;
import com.arquitetura.hexagonal.application.core.domain.Cliente;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClienteEntityMapper {

    ClienteEntity toClienteEntity(Cliente cliente);
}
