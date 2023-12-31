--Create Airport table
CREATE TABLE AIRPORT
(
    AIRPORT_ID BIGSERIAL PRIMARY KEY,
    AIRPORT_NAME varchar(100),
    AIRPORT_CITY varchar(100),
    AIRPORT_COUNTRY varchar(100)
);

CREATE TABLE PASSENGER
(
    PASSENGER_ID BIGSERIAL PRIMARY KEY,
    PASSENGER_FIRSTNAME VARCHAR(25),
    PASSENGER_LASTNAME VARCHAR(25),
    PASSENGER_EMAIL VARCHAR(25),
    PASSENGER_ADDRESS VARCHAR(25),
    PASSENGER_ZIPCODE VARCHAR(25),
    PASSENGER_CITY VARCHAR(25),
    PASSENGER_COUNTRY VARCHAR(25)
);

CREATE TABLE PAYMENT (
    PAYMENT_ID BIGSERIAL PRIMARY KEY,
    PAYMENT_AMOUNT BIGSERIAL,
    PAYMENT_DUE_DATE DATE
)