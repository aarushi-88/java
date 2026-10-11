import java.util.Scanner;

class Employee {
    private String name;
    private String id;
    private double basicSalary;

    // Default constructor
    public Employee() {
    }

    // Parameterized constructor
    public Employee(String name, String id, double basicSalary) {
        this.name = name;
        this.id = id;
        this.basicSalary = basicSalary;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    // Calculate salary
    public double calculateSalary() {
        return basicSalary;
    }

    // toString()
    @Override
    public String toString() {
        return "Name: " + name
                + ", ID: " + id
                + ", Salary: " + calculateSalary();
    }
}


// Manager class
class Manager extends Employee {
    private double bonus;

    // Constructor chaining using super()
    public Manager(String name, String id, double basicSalary, double bonus) {
        super(name, id, basicSalary);
        this.bonus = bonus;
    }

    // Override calculateSalary()
    @Override
    public double calculateSalary() {
        return getBasicSalary() + bonus;
    }
}


public class EmployeePayroll {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Employee details
        System.out.println("Enter Employee details (name,id,basicSalary)");
        String employeeInput = sc.nextLine();

        String[] employeeData = employeeInput.split(",");

        String employeeName = employeeData[0].trim();
        String employeeId = employeeData[1].trim();
        double basicSalary = Double.parseDouble(employeeData[2].trim());

        Employee employee = new Employee(
                employeeName,
                employeeId,
                basicSalary
        );

        System.out.println(employee);

        // Manager details
        System.out.println("Enter Manager details (name,id,basicSalary,bonus)");
        String managerInput = sc.nextLine();

        String[] managerData = managerInput.split(",");

        String managerName = managerData[0].trim();
        String managerId = managerData[1].trim();
        double managerSalary = Double.parseDouble(managerData[2].trim());
        double bonus = Double.parseDouble(managerData[3].trim());

        Manager manager = new Manager(
                managerName,
                managerId,
                managerSalary,
                bonus
        );

        System.out.println(manager);

        sc.close();
    }
}