package com.magnus.lil.learningspring.util;

import com.magnus.lil.learningspring.entities.Airport;
import com.magnus.lil.learningspring.entities.Passenger;
import com.magnus.lil.learningspring.repositories.AirportRepository;
import com.magnus.lil.learningspring.repositories.PassengerRepository;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class AppStartup implements ApplicationListener<ApplicationReadyEvent> {
    private final AirportRepository airportRepository;

    private final PassengerRepository passengerRepository;

    public AppStartup(AirportRepository airportRepository, PassengerRepository passengerRepository) {
        this.airportRepository = airportRepository;
        this.passengerRepository = passengerRepository;
    }

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        Iterable<Airport> airports = this.airportRepository.findAll();
        airports.forEach(System.out::println);

        Iterable<Passenger> passengers = this.passengerRepository.findAll();
        passengers.forEach(System.out::println);

    }

}

