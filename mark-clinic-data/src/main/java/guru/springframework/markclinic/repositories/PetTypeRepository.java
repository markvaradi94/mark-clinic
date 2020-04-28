package guru.springframework.markclinic.repositories;

import guru.springframework.markclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
