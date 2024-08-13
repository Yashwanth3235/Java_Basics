package Employee_Management_System;

import java.util.HashMap;
import java.util.Map;

public class EmployeeManagementSystem {
    private Map<Integer, Employee> employeeMap;

    public EmployeeManagementSystem() {
        employeeMap = new HashMap<>();
    }

    public void addEmployee(int employeeId, String name, String department, double salary) {
        if (employeeMap.containsKey(employeeId)) {
            throw new IllegalArgumentException("Employee ID already exists.");
        }
        Employee employee = new Employee(employeeId, name, department, salary);
        employeeMap.put(employeeId, employee);
    }

    public void updateEmployee(int employeeId, String name, String department, double salary) {
        Employee employee = employeeMap.get(employeeId);
        if (employee == null) {
            throw new IllegalArgumentException("Employee not found.");
        }
        employee.setName(name);
        employee.setDepartment(department);
        employee.setSalary(salary);
    }

    public void deleteEmployee(int employeeId) {
        if (!employeeMap.containsKey(employeeId)) {
            throw new IllegalArgumentException("Employee not found.");
        }
        employeeMap.remove(employeeId);
    }

    public void displayAllEmployees() {
        if (employeeMap.isEmpty()) {
            System.out.println("No employees to display.");
        } else {
            for (Employee employee : employeeMap.values()) {
                System.out.println(employee);
            }
        }
    }

    public Employee searchEmployee(int employeeId) {
        Employee employee = employeeMap.get(employeeId);
        if (employee == null) {
            throw new IllegalArgumentException("Employee not found.");
        }
        return employee;
    }
}
