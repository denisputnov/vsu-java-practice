package com.employeemanagement.core;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeListTest {

    @Test
    public void testHire() {
        EmployeeList employeeList = new EmployeeList();
        Employee employee = new Employee("John Doe", 30, new Address("123 Main St", "Anytown", "USA"), "EMP123");

        employeeList.hire(employee);

        assertTrue(employeeList.getAllEmployees().contains(employee));
    }

    @Test
    public void testFire() {
        EmployeeList employeeList = new EmployeeList();
        Employee employee = new Employee("Jane Smith", 25, new Address("456 Elm St", "Othertown", "USA"), "EMP456");
        employeeList.hire(employee);

        employeeList.fire("EMP456");

        assertFalse(employeeList.getAllEmployees().contains(employee));
    }

    @Test
    public void testFireNonexistentEmployee() {
        EmployeeList employeeList = new EmployeeList();
        Employee employee = new Employee("Jane Smith", 25, new Address("456 Elm St", "Othertown", "USA"), "EMP456");
        employeeList.hire(employee);

        employeeList.fire("EMP789");

        assertTrue(employeeList.getAllEmployees().contains(employee));
    }
}
