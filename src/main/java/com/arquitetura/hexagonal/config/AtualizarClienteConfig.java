package com.arquitetura.hexagonal.config;

import com.arquitetura.hexagonal.adapters.out.AtualizarClienteAdapter;
import com.arquitetura.hexagonal.adapters.out.BuscarEnderecoPeloCepAdapter;
import com.arquitetura.hexagonal.application.core.usecase.AtualizarClienteUseCase;
import com.arquitetura.hexagonal.application.core.usecase.BuscarClientePeloIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AtualizarClienteConfig {

    @Bean
    public AtualizarClienteUseCase atualizarClienteUseCase(BuscarClientePeloIdUseCase buscarClientePeloIdUseCase,
                                                           BuscarEnderecoPeloCepAdapter buscarEnderecoPeloCepAdapter,
                                                           AtualizarClienteAdapter atualizarClienteAdapter) {
        return new AtualizarClienteUseCase(buscarClientePeloIdUseCase, buscarEnderecoPeloCepAdapter, atualizarClienteAdapter);
    }
}
