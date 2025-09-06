package com.arquitetura.hexagonal.adapters.out;

import com.arquitetura.hexagonal.application.ports.out.EnviaCpfParaValidacaoOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class EnviaCpfParaValidacaoAdapter implements EnviaCpfParaValidacaoOutputPort {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Override
    public void enviar(String cpf) {
        kafkaTemplate.send("topic-validar-cpf", cpf);
    }
}
