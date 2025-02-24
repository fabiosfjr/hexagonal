package com.arquitetura.hexagonal.adapters.in.consumer.mensagem;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MensagemCliente {

    private String id;
    private String nome;
    private String cep;
    private String cpf;
    private Boolean cpfValido;
}
