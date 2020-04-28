package guru.springframework.markclinic.repositories;

import guru.springframework.markclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
