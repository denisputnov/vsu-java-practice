import java.util.ArrayList;
import java.util.List;

class Address {
    private final String street;
    private final String city;
    private final String country;

    public Address(String street, String city, String country) {
        this.street = street;
        this.city = city;
        this.country = country;
    }

    public String getAddressDetails() {
        return street + ", " + city + ", " + country;
    }
}

class Person {
    private final String name;
    private final int age;
    private final Address address;

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getAddress() {
        return address.getAddressDetails();
    }
}

class Employee extends Person {
    private final String employeeId;

    public Employee(String name, int age, Address address, String employeeId) {
        super(name, age, address);
        this.employeeId = employeeId;
    }

    public String getEmployeeId() {
        return employeeId;
    }
}

// Класс для представления списка работников организации
class EmployeeList {
    private final List<Employee> employees;

    // Конструктор класса EmployeeList
    public EmployeeList() {
        employees = new ArrayList<>();
    }

    // Метод для добавления нового сотрудника в список
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Метод для получения списка всех сотрудников
    public List<Employee> getAllEmployees() {
        return employees;
    }
}

public class Main {
    public static void main(String[] args) {
        // Постановка задачи:
        // Создать систему, в которой можно было бы регистрировать сотрудников организации X
        EmployeeList organizationEmployeeList = getOrganizationEmployeeList();

        List<Employee> allEmployees = organizationEmployeeList.getAllEmployees();

        printEmployeeList(allEmployees);
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

    private static void printEmployeeList(List<Employee> employeeList) {
        for (Employee employee : employeeList) {
            System.out.println("Имя: " + employee.getName());
            System.out.println("Возраст: " + employee.getAge());
            System.out.println("Адрес: " + employee.getAddress());
            System.out.println("Идентификатор сотрудника: " + employee.getEmployeeId());
            System.out.println();
        }
    }
}