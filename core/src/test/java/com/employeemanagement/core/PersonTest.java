package com.employeemanagement.core;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {

    @Test
    public void testGetName() {
        String name = "John Doe";
        int age = 30;
        Address address = new Address("123 Main St", "Anytown", "USA");
        Person person = new Person(name, age, address);

        String retrievedName = person.getName();

        assertEquals(name, retrievedName);
    }

    @Test
    public void testGetAge() {
        String name = "John Doe";
        int age = 30;
        Address address = new Address("123 Main St", "Anytown", "USA");
        Person person = new Person(name, age, address);

        int retrievedAge = person.getAge();

        assertEquals(age, retrievedAge);
    }

    @Test
    public void testGetAddress() {
        String name = "John Doe";
        int age = 30;
        Address address = new Address("123 Main St", "Anytown", "USA");
        Person person = new Person(name, age, address);

        String retrievedAddress = person.getAddress();

        String expectedAddress = "123 Main St, Anytown, USA";
        assertEquals(expectedAddress, retrievedAddress);
    }
}
