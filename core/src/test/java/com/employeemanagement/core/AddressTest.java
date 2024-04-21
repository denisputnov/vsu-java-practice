package com.employeemanagement.core;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddressTest {

    @Test
    public void testGetAddressDetails() {
        String street = "123 Main St";
        String city = "Anytown";
        String country = "USA";
        Address address = new Address(street, city, country);

        String addressDetails = address.getAddressDetails();

        String expectedAddressDetails = street + ", " + city + ", " + country;
        assertEquals(expectedAddressDetails, addressDetails);
    }
}
