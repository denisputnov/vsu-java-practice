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

public class Main {
    public static void main(String[] args) {
        // Постановка задачи:
        // Создать систему, в которой можно было бы регистрировать сотрудников организации X
        Address address = new Address("улица Пушкина", "Воронеж", "Россия");

        Employee employee = new Employee("Денис Путнов", 22, address, "EMP1");

        // Вывод информации о сотруднике
        System.out.println("Имя: " + employee.getName());
        System.out.println("Возраст: " + employee.getAge());
        System.out.println("Адрес: " + employee.getAddress());
        System.out.println("Идентификатор сотрудника: " + employee.getEmployeeId());
    }
}