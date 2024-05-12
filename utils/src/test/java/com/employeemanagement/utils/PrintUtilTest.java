package com.employeemanagement.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.employeemanagement.core.Address;
import com.employeemanagement.core.Employee;

public class PrintUtilTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testPrintEmployeeList() {
        // Arrange
        Address address1 = new Address("улица Пушкина", "Воронеж", "Россия");
        Employee employee1 = new Employee("Денис Путнов", 22, address1, "EMP1");
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);

        // Act
        PrintUtil.printEmployeeList(employeeList);
        String test = outContent.toString();
        // Assert
        String expectedOutput = "Имя: Денис Путнов\n" +
                                "Возраст: 22\n" +
                                "Адрес: улица Пушкина, Воронеж, Россия\n" +
                                "Идентификатор сотрудника: EMP1\n\n";

        assertEquals(expectedOutput, test);
    }
}
