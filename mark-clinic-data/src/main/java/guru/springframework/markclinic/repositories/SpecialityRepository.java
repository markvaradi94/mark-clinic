package guru.springframework.markclinic.repositories;

import guru.springframework.markclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}
