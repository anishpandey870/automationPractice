package org.example.jdbcProject;

import java.util.Date;
import java.util.Map;

public class EmployeeMain {
    public static void main(String[] args) {
        EmployeeTableCreate em = new EmployeeTableCreate();
        // Create a table if not exists
        em.createTable();

        // Create some sample employee objects
        Employee employee1 = new Employee(1, "John Doe", 50000, "IT", "1234567890", "john@example.com", "123 Street, City", "Male", new Date());
        Employee employee2 = new Employee(2, "Jane Smith", 60000, "HR", "0987654321", "jane@example.com", "456 Avenue, Town", "Female", new Date());
        //  em.createEmployee( new Employee(4, "David Lee", 55000.0, "IT", "1357902468", "david@example.com", "789 Road, Village", "Male", new Date()));

        // Insert employees into the database
        //  em.createEmployee(employee1);
        //em.createEmployee(employee2);

        // Read employees from the database
        System.out.println("Employees in the database:");
        em.readEmployee();

        // Update employee salary
        int employeeIdToUpdate = 1;
        double newSalary = 80000.0;
        // em.updateEmployee(employeeIdToUpdate, newSalary);

        // Read updated employees
        System.out.println("Updated Employees:");
        em.readEmployee();

        // Delete employee
        int employeeIdToDelete = 3;
        em.deleteEmployee(employeeIdToDelete);

        // Read employees after deletion
        System.out.println("Employees after deletion:");
        em.readEmployee();

// Get department wise total salary
        Map<String, Double> departmentSalaryMap = em.getDepartmentSalary();

        // Display department wise total salary
        System.out.println("Department-wise Total Salary:");
        for (Map.Entry<String, Double> entry : departmentSalaryMap.entrySet()) {
            System.out.println("Department: " + entry.getKey() + ", Total Salary: " + entry.getValue());
        }
    }
}
