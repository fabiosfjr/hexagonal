package com.arquitetura.hexagonal.config;

import com.arquitetura.hexagonal.adapters.out.BuscarClientePeloIdAdapter;
import com.arquitetura.hexagonal.application.core.usecase.BuscarClientePeloIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BuscarClientePeloIdConfig {

    @Bean
    BuscarClientePeloIdUseCase buscarClientePeloIdUseCase(BuscarClientePeloIdAdapter buscarClientePeloIdAdapter) {
        return new BuscarClientePeloIdUseCase(buscarClientePeloIdAdapter);
    }
}
