import java.util.Arrays;

class Employee {
    int empId;
    String name;
    double salary;

    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }
}

public class EmployeeSearch {

    public static Employee searchById(Employee[] employees, int empId) {
        for (Employee employee : employees) {
            if (employee.empId == empId) {
                return employee;
            }
        }
        return null; // Employee not found
    }

    public static Employee searchByName(Employee[] employees, String name) {
        for (Employee employee : employees) {
            if (employee.name.equals(name)) {
                return employee;
            }
        }
        return null; // Employee not found
    }

    public static Employee searchBySalary(Employee[] employees, double salary) {
        for (Employee employee : employees) {
            if (employee.salary == salary) {
                return employee;
            }
        }
        return null; // Employee not found
    }

    public static void main(String[] args) {
        Employee[] employees = {
            new Employee(101, "anil", 50000),
            new Employee(102, "amit", 60000),
            new Employee(103, "ram", 55000)
        };

        int searchEmpId = 102;
        String searchName = "anil";
        double searchSalary = 55000;

        // Search by Employee ID
        Employee empById = searchById(employees, searchEmpId);
        System.out.println("Employee with ID " + searchEmpId + ": " + (empById != null ? empById.name : "Not found"));

        // Search by Name
        Employee empByName = searchByName(employees, searchName);
        System.out.println("Employee with Name " + searchName + ": " + (empByName != null ? empByName.empId : "Not found"));

        // Search by Salary
        Employee empBySalary = searchBySalary(employees, searchSalary);
        System.out.println("Employee with Salary " + searchSalary + ": " + (empBySalary != null ? empBySalary.name : "Not found"));
    }
}
