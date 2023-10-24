package com.magnus.lil.learningspring.repositories;

import com.magnus.lil.learningspring.entities.Passenger;
import org.springframework.data.repository.CrudRepository;

public interface PassengerRepository extends CrudRepository<Passenger, Long> {
}
