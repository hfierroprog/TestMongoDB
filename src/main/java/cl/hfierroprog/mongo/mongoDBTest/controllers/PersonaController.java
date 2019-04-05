package cl.hfierroprog.mongo.mongoDBTest.controllers;

import cl.hfierroprog.mongo.mongoDBTest.model.Persona;
import cl.hfierroprog.mongo.mongoDBTest.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonaController {

    @Autowired
    private PersonaRepository personaRepository;

    @GetMapping("/persona")
    public List<Persona> getPersonas() {
        return personaRepository.findAll();
    }

    @PostMapping("/persona")
    public Persona guardarPersona(@RequestBody Persona persona) {
        return personaRepository.save(persona);
    }

}
