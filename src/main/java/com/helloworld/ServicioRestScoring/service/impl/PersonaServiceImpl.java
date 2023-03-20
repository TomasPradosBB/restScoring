package com.helloworld.ServicioRestScoring.service.impl;

import com.helloworld.ServicioRestScoring.models.Persona;
import com.helloworld.ServicioRestScoring.repository.PersonaRepository;
import com.helloworld.ServicioRestScoring.service.PersonaService;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl implements PersonaService {

    private PersonaRepository personaRepository;

    public PersonaServiceImpl(PersonaRepository personaRepository){
        this.personaRepository = personaRepository;
    }

    @Override
    public void alta(Persona persona) {
        this.personaRepository.alta(persona);
    }
}
