package com.magnus.lil.learningspring.entities;

import javax.persistence.*;

@Entity
@Table(name = "PASSENGER")
public class Passenger {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "PASSENGER_ID", nullable = false)
    private Long id;
    @Column(name = "PASSENGER_FIRSTNAME")
    private String passengerFirstName;
    @Column(name = "PASSENGER_LASTNAME")
    private String passengerLastName;
    @Column(name = "PASSENGER_EMAIL")
    private String passengerEmail;
    @Column(name = "PASSENGER_ADDRESS")
    private String passengerAddress;
    @Column(name = "PASSENGER_ZIPCODE")
    private String passengerZipCode;
    @Column(name = "PASSENGER_CITY")
    private String passengerCity;
    @Column(name = "PASSENGER_COUNTRY")
    private String passengerCountry;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassengerFirstName() {
        return passengerFirstName;
    }

    public void setPassengerFirstName(String passengerFirstName) {
        this.passengerFirstName = passengerFirstName;
    }

    public String getPassengerLastName() {
        return passengerLastName;
    }

    public void setPassengerLastName(String passengerLastName) {
        this.passengerLastName = passengerLastName;
    }

    public String getPassengerEmail() {
        return passengerEmail;
    }

    public void setPassengerEmail(String passengerEmail) {
        this.passengerEmail = passengerEmail;
    }

    public String getPassengerAddress() {
        return passengerAddress;
    }

    public void setPassengerAddress(String passengerAddress) {
        this.passengerAddress = passengerAddress;
    }

    public String getPassengerZipCode() {
        return passengerZipCode;
    }

    public void setPassengerZipCode(String passengerZipCode) {
        this.passengerZipCode = passengerZipCode;
    }

    public String getPassengerCity() {
        return passengerCity;
    }

    public void setPassengerCity(String passengerCity) {
        this.passengerCity = passengerCity;
    }

    public String getPassengerCountry() {
        return passengerCountry;
    }

    public void setPassengerCountry(String passengerCountry) {
        this.passengerCountry = passengerCountry;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "id=" + id +
                ", passengerFirstName='" + passengerFirstName + '\'' +
                ", passengerLastName='" + passengerLastName + '\'' +
                ", passengerEmail='" + passengerEmail + '\'' +
                ", passengerAddress='" + passengerAddress + '\'' +
                ", passengerZipCode='" + passengerZipCode + '\'' +
                ", passengerCity='" + passengerCity + '\'' +
                ", passengerCountry='" + passengerCountry + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Passenger)) return false;

        Passenger passenger = (Passenger) o;

        return getId() != null ? getId().equals(passenger.getId()) : passenger.getId() == null;
    }

    @Override
    public int hashCode() {
        return getId() != null ? getId().hashCode() : 0;
    }

}

