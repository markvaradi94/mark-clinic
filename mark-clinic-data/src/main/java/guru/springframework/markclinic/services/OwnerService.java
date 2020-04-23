package guru.springframework.markclinic.services;

import guru.springframework.markclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
