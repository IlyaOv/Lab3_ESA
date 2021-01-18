package org.addresses.repositories;

import org.addresses.models.House;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HouseRepository extends CrudRepository<House, Long> {
}
