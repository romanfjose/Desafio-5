package com.desafio.transacciones.service;


import com.desafio.transacciones.entity.Persona;
import com.desafio.transacciones.repository.PersonaRepositorio;
import org.hibernate.PropertyValueException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.List;

public class PersonaService {

    @Autowired
    private PersonaRepositorio personaRepository;

    public Persona createPersona(Persona persona) {
        return personaRepository.save(persona);
    }

    public List<Persona> personas(){
        return personaRepository.findAll();
    }

    @Transactional(rollbackFor = SQLException.class , propagation = Propagation.REQUIRES_NEW)
    public void createPersonaRollback(Persona persona) throws SQLException {
        personaRepository.save(persona);
        persona.setEdad(30);
        personaRepository.save(persona);
        throw new SQLException("Encontrada excepción, iniciando rollback");
    }


    @Transactional(rollbackFor = PropertyValueException.class , propagation = Propagation.REQUIRES_NEW)
    public void addListPersonaRollback(List<Persona> personas) {
        personaRepository.saveAll(personas);
    }
}
