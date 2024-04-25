package com.packet.cardatabase.domain;

import org.springframework.data.repository.CrudRepository;

/*@RepositoryRestResource(path = "vehicles")*/
public interface CarRepository extends CrudRepository<Car, Long> {
}
