package com.arquitetura.hexagonal.adapters.out.client;

import com.arquitetura.hexagonal.adapters.out.client.response.EnderecoResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
        name = "BuscarEnderecoPeloCepClient",
        url = "${client.endereco.url}"
)
public interface BuscarEnderecoPeloCepClient {

    @GetMapping("/{cep}")
    EnderecoResponse buscar(@PathVariable("cep") String cep);
}
