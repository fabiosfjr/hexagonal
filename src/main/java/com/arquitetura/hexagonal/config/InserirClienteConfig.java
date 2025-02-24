package com.arquitetura.hexagonal.config;

import com.arquitetura.hexagonal.adapters.out.BuscarEnderecoPeloCepAdapter;
import com.arquitetura.hexagonal.adapters.out.InserirClienteAdapter;
import com.arquitetura.hexagonal.application.core.usecase.InserirClienteUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InserirClienteConfig {

    @Bean
    public InserirClienteUseCase inserirClienteUseCase(BuscarEnderecoPeloCepAdapter buscarEnderecoPeloCepAdapter,
                                                       InserirClienteAdapter inserirClienteAdapter) {
        return new InserirClienteUseCase(buscarEnderecoPeloCepAdapter, inserirClienteAdapter);
    }
}
