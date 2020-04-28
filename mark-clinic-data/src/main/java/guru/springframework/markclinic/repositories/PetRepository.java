package guru.springframework.markclinic.repositories;

import guru.springframework.markclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
