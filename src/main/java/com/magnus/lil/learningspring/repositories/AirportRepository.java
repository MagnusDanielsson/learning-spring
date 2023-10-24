package com.magnus.lil.learningspring.repositories;

import com.magnus.lil.learningspring.entities.Airport;
import org.springframework.data.repository.CrudRepository;

public interface AirportRepository extends CrudRepository<Airport, Long> {
}
