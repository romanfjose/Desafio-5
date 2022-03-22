package com.desafio.transacciones.config;

import java.util.Arrays;

import com.desafio.transacciones.entity.Persona;
import com.desafio.transacciones.repository.PersonaRepositorio;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDB {
	
	@Bean
	CommandLineRunner initDB(PersonaRepositorio personRepository) {
		Persona persona = new Persona("Gabriel",34,"Chichi");
		Persona persona1 = new Persona("Messi",44,"Pulga");
		Persona persona2 = new Persona("Michael",24,"MoonWalker");
		
		return args -> personRepository.saveAll(Arrays.asList(persona,persona1,persona2)) ;
	}

}
