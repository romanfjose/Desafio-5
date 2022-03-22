package com.desafio.transacciones.repository;

import com.desafio.transacciones.entity.Persona;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonaRepositorio extends CrudRepository<Persona, Integer> {

    List<Persona> findAll();

}
