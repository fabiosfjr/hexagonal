package com.arquitetura.hexagonal.adapters.out;

import com.arquitetura.hexagonal.adapters.out.client.BuscarEnderecoPeloCepClient;
import com.arquitetura.hexagonal.adapters.out.client.mapper.EnderecoResponseMapper;
import com.arquitetura.hexagonal.application.core.domain.Endereco;
import com.arquitetura.hexagonal.application.ports.out.BuscarEnderecoPeloCepOutputPort;
import org.springframework.beans.factory.annotation.Autowired;

public class BuscarEnderecoPeloCepAdapter implements BuscarEnderecoPeloCepOutputPort {

    @Autowired
    private BuscarEnderecoPeloCepClient buscarEnderecoPeloCepClient;

    @Autowired
    private EnderecoResponseMapper enderecoResponseMapper;

    @Override
    public Endereco buscar(String cep) {
        var enderecoResponse = buscarEnderecoPeloCepClient.buscar(cep);
        return enderecoResponseMapper.toEndereco(enderecoResponse);
    }
}
