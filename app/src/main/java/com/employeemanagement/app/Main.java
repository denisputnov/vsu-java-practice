package com.employeemanagement.app;

import java.util.List;

import com.employeemanagement.core.Address;
import com.employeemanagement.core.Employee;
import com.employeemanagement.core.EmployeeList;

public class Main {
    public static void main(String[] args) {
        // Постановка задачи:
        // Создать систему, в которой можно было бы регистрировать сотрудников организации X
        EmployeeList organizationEmployeeList = getOrganizationEmployeeList();

        List<Employee> allEmployees = organizationEmployeeList.getAllEmployees();

        PrintUtil.printEmployeeList(allEmployees);
    }

    private static EmployeeList getOrganizationEmployeeList() {
        Address address1 = new Address("улица Пушкина", "Воронеж", "Россия");
        Address address2 = new Address("проспект Революции", "Воронеж", "Россия");

        Employee employee1 = new Employee("Денис Путнов", 22, address1, "EMP1");
        Employee employee2 = new Employee("Иван Иванов", 30, address2, "EMP2");

        EmployeeList employeeList = new EmployeeList();

        employeeList.addEmployee(employee1);
        employeeList.addEmployee(employee2);
        return employeeList;
    }
}

