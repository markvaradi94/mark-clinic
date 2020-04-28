package guru.springframework.markclinic.repositories;

import guru.springframework.markclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
