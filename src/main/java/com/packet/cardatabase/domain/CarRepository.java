package com.packet.cardatabase.domain;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CarRepository extends CrudRepository<Car, Long> {
    @Query("select c from Car c where c.brand like %?1")
    List<Car> findByBrand(String brand);

    List<Car> findByColor(String model);

    List<Car> findByYear(int year);
}
