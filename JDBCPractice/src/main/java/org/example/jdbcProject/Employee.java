package org.example.jdbcProject;

import java.util.Date;

public class Employee {
    private int id;
    private String empname;
    private double salary;
    private String department;
    private String phone_No;
    private String email_id;
    private String address;
    private String gender;
    private Date joing_data;

    public Employee() {
    }

    public Employee(int id, String empname, double salary, String department, String phone_No, String email_id, String address, String gender, Date joing_data) {
        this.id = id;
        this.empname = empname;
        this.salary = salary;
        this.department = department;
        this.phone_No = phone_No;
        this.email_id = email_id;
        this.address = address;
        this.gender = gender;
        this.joing_data = joing_data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPhone_No() {
        return phone_No;
    }

    public void setPhone_No(String phone_No) {
        this.phone_No = phone_No;
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getJoing_data() {
        return joing_data;
    }

    public void setJoing_data(Date joing_data) {
        this.joing_data = joing_data;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", empname='" + empname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", phone_No='" + phone_No + '\'' +
                ", email_id='" + email_id + '\'' +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                ", joing_data='" + joing_data + '\'' +
                '}';
    }
}
