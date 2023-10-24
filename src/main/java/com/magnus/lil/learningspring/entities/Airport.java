package com.magnus.lil.learningspring.entities;

import javax.persistence.*;

@Entity
@Table(name = "AIRPORT")
public class Airport {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "AIRPORT_ID", nullable = false)
    private Long id;

    @Column(name = "AIRPORT_NAME")
    private String airportName;

    @Column(name = "AIRPORT_CITY")
    private String airportCity;

    @Column(name = "AIRPORT_COUNTRY")
    private String airportCountry;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    public String getAirportCity() {
        return airportCity;
    }

    public void setAirportCity(String airportCity) {
        this.airportCity = airportCity;
    }

    public String getAirportCountry() {
        return airportCountry;
    }

    public void setAirportCountry(String airportCountry) {
        this.airportCountry = airportCountry;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "id=" + id +
                ", airportName='" + airportName + '\'' +
                ", airportCity='" + airportCity + '\'' +
                ", airportCountry='" + airportCountry + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Airport)) return false;

        Airport airport = (Airport) o;

        return getId() != null ? getId().equals(airport.getId()) : airport.getId() == null;
    }

    @Override
    public int hashCode() {
        return getId() != null ? getId().hashCode() : 0;
    }

}
