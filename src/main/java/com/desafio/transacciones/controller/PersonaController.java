package com.desafio.transacciones.controller;


import com.desafio.transacciones.entity.Persona;
import com.desafio.transacciones.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@RestController
public class PersonaController {
    @Autowired
    private PersonaService personaService;

    @GetMapping("/personas")
    public List<Persona> personas(){
        return personaService.personas();
    }

    @PostMapping("/personas")
    public Persona createPersona(@RequestBody Persona persona) {
        return personaService.createPersona(persona);
    }

    @PostMapping("/personaRollback")
    public void createPersonaRollback(@RequestBody Persona persona) throws SQLException {
        personaService.createPersonaRollback(persona);
    }

    @PostMapping("/listaConCampoNull")
    public void addListPersonaRollback(@RequestBody List<Persona> personas) {
        personaService.addListPersonaRollback(personas);
    }
}
