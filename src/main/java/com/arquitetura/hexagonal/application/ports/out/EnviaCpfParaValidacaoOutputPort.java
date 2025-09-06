package com.arquitetura.hexagonal.application.ports.out;

public interface EnviaCpfParaValidacaoOutputPort {
    void enviar(String cpf);
}
