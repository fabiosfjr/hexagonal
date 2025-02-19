package com.arquitetura.hexagonal.adapters.in.controller;

import com.arquitetura.hexagonal.adapters.in.controller.mapper.ClienteMapper;
import com.arquitetura.hexagonal.adapters.in.controller.request.ClienteRequest;
import com.arquitetura.hexagonal.adapters.in.controller.response.ClienteResponse;
import com.arquitetura.hexagonal.application.ports.in.BuscarClientePeloIdInputPort;
import com.arquitetura.hexagonal.application.ports.in.InserirClienteInputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/clientes")
public class ClienteController {

    @Autowired
    private InserirClienteInputPort inserirClienteInputPort;

    @Autowired
    private ClienteMapper clienteMapper;

    @Autowired
    private BuscarClientePeloIdInputPort buscarClientePeloIdInputPort;

    @PostMapping
    public ResponseEntity<Void> inserir(@Valid @RequestBody ClienteRequest clienteRequest) {
        var cliente = clienteMapper.toCliente(clienteRequest);
        inserirClienteInputPort.inserir(cliente, clienteRequest.getCep());
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClienteResponse> buscarPeloId(@PathVariable final String id) {
        var cliente = buscarClientePeloIdInputPort.buscar(id);
        var clienteResponse = clienteMapper.toClienteResponse(cliente);
        return ResponseEntity.ok().body(clienteResponse);
    }
}
