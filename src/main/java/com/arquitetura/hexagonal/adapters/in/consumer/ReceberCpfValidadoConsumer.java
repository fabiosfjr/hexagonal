package com.arquitetura.hexagonal.adapters.in.consumer;

import com.arquitetura.hexagonal.adapters.in.consumer.mapper.MensagemClienteMapper;
import com.arquitetura.hexagonal.adapters.in.consumer.mensagem.MensagemCliente;
import com.arquitetura.hexagonal.application.ports.in.AtualizarClienteInputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ReceberCpfValidadoConsumer {

    @Autowired
    private AtualizarClienteInputPort atualizarClienteInputPort;

    @Autowired
    private MensagemClienteMapper mensagemClienteMapper;

    @KafkaListener(topics = "topic-cpf-validado", groupId = "fabio-ferreira")
    public void receber(MensagemCliente mensagemCliente) {
        var cliente = mensagemClienteMapper.toCliente(mensagemCliente);
        atualizarClienteInputPort.atualizar(cliente, mensagemCliente.getCep());
    }
}
