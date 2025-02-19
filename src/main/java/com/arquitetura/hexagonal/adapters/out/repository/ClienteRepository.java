package com.arquitetura.hexagonal.adapters.out.repository;

import com.arquitetura.hexagonal.adapters.out.repository.entity.ClienteEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClienteRepository extends MongoRepository<ClienteEntity, String> {
}
