package com.pruebas.demoandres.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.pruebas.demoandres.app.entity.Coordinador;

public interface CoordinadorRepository extends MongoRepository<Coordinador, String> {

}
