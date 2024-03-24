package com.employeemanagement;

public class Employee extends Person {
    private final String employeeId;

    public Employee(String name, int age, Address address, String employeeId) {
        super(name, age, address);
        this.employeeId = employeeId;
    }

    public String getEmployeeId() {
        return employeeId;
    }
}
