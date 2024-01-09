import java.util.Arrays;
import java.util.Comparator;

class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class EmployeeSort {

    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("anil", 50000),
                new Employee("ram", 60000),
                new Employee("mahesh", 45000),
                new Employee("rohit", 70000)
        };

        System.out.println("Original Employee Array: " + Arrays.toString(employees));

        // Sort employees by salary
        sortEmployeesBySalary(employees);

        System.out.println("Sorted Employee Array by Salary: " + Arrays.toString(employees));
    }

    static void sortEmployeesBySalary(Employee[] employees) {
        Arrays.sort(employees, Comparator.comparingDouble(employee -> employee.salary));
    }
}
