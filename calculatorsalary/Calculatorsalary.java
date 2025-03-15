import java.util.Scanner;
class Employee {
    String name;
    double baseSalary;
    Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }
    public double calculateSalary() {
        return baseSalary;
    }
}
class Manager extends Employee {

    Manager(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return baseSalary + (baseSalary * 0.2); 
    }
}
class Developer extends Employee {
    Developer(String name, double baseSalary) {
        super(name, baseSalary);
    }
    @Override
    public double calculateSalary() {
        return baseSalary + (baseSalary * 0.1); 
    }
}
public class Salarycalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int numEmployees = scanner.nextInt();
        scanner.nextLine(); 
        for (int i = 1; i <= numEmployees; i++) {
            System.out.print("Enter employee name: ");
            String name = scanner.nextLine();
            System.out.print("Enter base salary: ");
            double baseSalary = scanner.nextDouble();
            scanner.nextLine(); 
            System.out.print("Enter job role (Manager/Developer): ");
            String role = scanner.nextLine();
            Employee employee;
            if (role.equalsIgnoreCase("Manager")) {
                employee = new Manager(name, baseSalary);
            } else if (role.equalsIgnoreCase("Developer")) {
                employee = new Developer(name, baseSalary);
            } else {
                System.out.println("Invalid role entered. Skipping employee.");
                continue;
            }
            double finalSalary = employee.calculateSalary();
            System.out.println("Final salary for " + employee.name + " (" + role + "): " + finalSalary);
        }

        scanner.close();
    }
}
