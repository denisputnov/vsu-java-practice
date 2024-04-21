package com.employeemanagement.core;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {

    @Test
    public void testGetEmployeeId() {
        String name = "John Doe";
        int age = 30;
        String employeeId = "EMP123";
        Address address = new Address("123 Main St", "Anytown", "USA");
        Employee employee = new Employee(name, age, address, employeeId);

        String retrievedEmployeeId = employee.getEmployeeId();

        assertEquals(employeeId, retrievedEmployeeId);
    }
}