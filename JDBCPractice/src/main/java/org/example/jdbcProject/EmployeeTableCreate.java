package org.example.jdbcProject;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class EmployeeTableCreate {

    public Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/sqldata";
        String user = "root";
        String password = "root";
        return DriverManager.getConnection(url, user, password);
    }

    public void createTable() {
        String sqlQuery = "create table if not exists employees(" +
                "id int primary key," +
                "empname varchar(50)," +
                "salary double," +
                "department varchar(50)," +
                "phone_No varchar(15)," +
                "email_id varchar(50)," +
                "address varchar(100)," +
                "gender varchar(10)," +
                "joining_date date)";

        try (Connection connection = getConnection();
             Statement statement = connection.createStatement()) {
            statement.executeUpdate(sqlQuery);
            System.out.println("Table created Successfully");
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }

    public void createEmployee(Employee employee) {
        String sqlQuery = "insert into employees(id, empname, salary, department, phone_No, email_id, address, gender, joining_date) values (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery)) {

            preparedStatement.setInt(1, employee.getId());
            preparedStatement.setString(2, employee.getEmpname());
            preparedStatement.setDouble(3, employee.getSalary());
            preparedStatement.setString(4, employee.getDepartment());
            preparedStatement.setString(5, employee.getPhone_No());
            preparedStatement.setString(6, employee.getEmail_id());
            preparedStatement.setString(7, employee.getAddress());
            preparedStatement.setString(8, employee.getGender());
            preparedStatement.setDate(9, new java.sql.Date(employee.getJoing_data().getTime()));

            preparedStatement.executeUpdate();
            System.out.println("Employee added successfully");

        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }

    public List<Employee> readEmployee() {
        List<Employee> employeeList = new ArrayList<>();
        String sqlQuery = "select * from employees";

        try (Connection connection = getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sqlQuery)) {
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String empname = resultSet.getString("empname");
                double salary = resultSet.getDouble("salary");
                String department = resultSet.getString("department");
                String phone_No = resultSet.getString("phone_No");
                String email_id = resultSet.getString("email_id");
                String address = resultSet.getString("address");
                String gender = resultSet.getString("gender");
                Date joing_data = resultSet.getDate("joining_date");

                Employee employee = new Employee(id, empname, salary, department, phone_No, email_id, address, gender, joing_data);
                employeeList.add(employee);
                System.out.println(employee);
            }

        } catch (SQLException exception) {
            exception.printStackTrace();
        }
        return employeeList;
    }
    public void updateEmployee(int id, double newSalary) {
        String sqlQuery = "UPDATE employees SET salary = ? WHERE id = ?";
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery)) {
            preparedStatement.setDouble(1, newSalary);
            preparedStatement.setInt(2, id);
            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Employee with ID " + id + " updated successfully");
            } else {
                System.out.println("No employee found with ID " + id);
            }
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }

    public void deleteEmployee(int id) {
        String sqlQuery = "DELETE FROM employees WHERE id = ?";
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery)) {
            preparedStatement.setInt(1, id);
            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Employee with ID " + id + " deleted successfully");
            } else {
                System.out.println("No employee found with ID " + id);
            }
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }
    public Map<String, Double> getDepartmentSalary() {
        Map<String, Double> departmentSalaryMap = new HashMap<>();
        String sqlQuery = "select department, sum(salary) as total_salary from employees group by department";

        try (Connection connection = getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sqlQuery)) {
            while (resultSet.next()) {
                String department = resultSet.getString("department");
                double totalSalary = resultSet.getDouble("total_salary");
                departmentSalaryMap.put(department, totalSalary);
                System.out.println("Department: " + department + ", Total Salary: " + totalSalary);
            }

        } catch (SQLException exception) {
            exception.printStackTrace();
        }
        return departmentSalaryMap;
    }
}
