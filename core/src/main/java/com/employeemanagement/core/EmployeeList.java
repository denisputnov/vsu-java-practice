package com.employeemanagement.core;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {
    private final List<Employee> employees;

    public EmployeeList() {
        employees = new ArrayList<>();
    }

    public List<Employee> getAllEmployees() {
        return employees;
    }

    public void hire(Employee employee) {
        employees.add(employee);
    }

    public void fire(String employeeId) {
        Employee employeeToRemove = null;
        for (Employee employee : employees) {
            if (employee.getEmployeeId().equals(employeeId)) {
                employeeToRemove = employee;
                break;
            }
        }
        if (employeeToRemove != null) {
            employees.remove(employeeToRemove);
        } else {
            System.out.println("Employee with ID " + employeeId + " not found.");
        }
    }
}