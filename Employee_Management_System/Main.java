package Employee_Management_System;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Employee Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. Update Employee");
            System.out.println("3. Delete Employee");
            System.out.println("4. Display All Employees");
            System.out.println("5. Search Employee");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter Employee ID: ");
                        int addId = scanner.nextInt();
                        System.out.print("Enter Name: ");
                        String addName = scanner.next();
                        System.out.print("Enter Department: ");
                        String addDepartment = scanner.next();
                        System.out.print("Enter Salary: ");
                        double addSalary = scanner.nextDouble();
                        ems.addEmployee(addId, addName, addDepartment, addSalary);
                        System.out.println("Employee added successfully.");
                        break;

                    case 2:
                        System.out.print("Enter Employee ID to update: ");
                        int updateId = scanner.nextInt();
                        System.out.print("Enter new Name: ");
                        String updateName = scanner.next();
                        System.out.print("Enter new Department: ");
                        String updateDepartment = scanner.next();
                        System.out.print("Enter new Salary: ");
                        double updateSalary = scanner.nextDouble();
                        ems.updateEmployee(updateId, updateName, updateDepartment, updateSalary);
                        System.out.println("Employee updated successfully.");
                        break;

                    case 3:
                        System.out.print("Enter Employee ID to delete: ");
                        int deleteId = scanner.nextInt();
                        ems.deleteEmployee(deleteId);
                        System.out.println("Employee deleted successfully.");
                        break;

                    case 4:
                        ems.displayAllEmployees();
                        break;

                    case 5:
                        System.out.print("Enter Employee ID to search: ");
                        int searchId = scanner.nextInt();
                        Employee employee = ems.searchEmployee(searchId);
                        System.out.println(employee);
                        break;

                    case 6:
                        System.out.println("Exiting...");
                        scanner.close();
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
