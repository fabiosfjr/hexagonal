package com.arquitetura.hexagonal.config;

import com.arquitetura.hexagonal.adapters.out.ExcluirClientePeloIdAdapter;
import com.arquitetura.hexagonal.application.core.usecase.BuscarClientePeloIdUseCase;
import com.arquitetura.hexagonal.application.core.usecase.ExcluirClientePeloIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExcluirClientePeloIdConfig {

    @Bean
    public ExcluirClientePeloIdUseCase excluirClientePeloIdUseCase(BuscarClientePeloIdUseCase buscarClientePeloIdUseCase,
                                                                   ExcluirClientePeloIdAdapter excluirClientePeloIdAdapter) {
        return new ExcluirClientePeloIdUseCase(buscarClientePeloIdUseCase, excluirClientePeloIdAdapter);
    }
}
