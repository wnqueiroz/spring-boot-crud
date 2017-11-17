package com.wnqueiroz.crud.api.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.wnqueiroz.crud.api.documents.Cliente;

public interface ClienteRepository extends MongoRepository<Cliente, String> {
	
}