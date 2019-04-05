package cl.hfierroprog.mongo.mongoDBTest.repositories;

import cl.hfierroprog.mongo.mongoDBTest.model.Persona;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonaRepository extends MongoRepository<Persona, String> {
}
