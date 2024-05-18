package com.employeemanagement.core;

public class Address {
    private final String street;
    private final String city;
    private final String country;

    public Address(String street, String city, String country) {
        this.street = street;
        this.city = city;
        this.country = country;
    }

    public String getAddressDetails() {
        return street + "; " + city + ", " + country;
    }
}
