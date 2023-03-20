package com.helloworld.ServicioRestScoring.controllers;

import com.helloworld.ServicioRestScoring.models.Persona;
import com.helloworld.ServicioRestScoring.service.PersonaService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/persona")
public class PersonaController {
    private PersonaService personaService;

    public PersonaController(PersonaService personaService){
        this.personaService = personaService;
    }

    @PostMapping("")
    public void alta(Persona persona){
        this.personaService.alta(persona);
    }

}
