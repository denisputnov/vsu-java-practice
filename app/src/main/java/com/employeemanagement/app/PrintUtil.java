package com.employeemanagement.app;

import java.util.List;

import com.employeemanagement.core.Employee;

public class PrintUtil {
    static void printEmployeeList(List<Employee> employeeList) {
        for (Employee employee : employeeList) {
            System.out.println("Имя: " + employee.getName());
            System.out.println("Возраст: " + employee.getAge());
            System.out.println("Адрес: " + employee.getAddress());
            System.out.println("Идентификатор сотрудника: " + employee.getEmployeeId());
            System.out.println();
        }
    }
}
