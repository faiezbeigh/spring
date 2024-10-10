package com.project.spring_backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name= "Employee")
public class Employee {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name= "Emp_id")
private int employeeId;

@Column(name = "Emp_name")
private String employeeName;


@ManyToOne
@Column(name = "Dept_id")
private Department department;

@Column(name = "Salary")
private float salary;

public int getEmployeeId() {
    return employeeId;
}
public void setEmployeeId(int employeeId) {
    this.employeeId = employeeId;
}
public String getEmployeeName() {
    return employeeName;
}
public void setEmployeeName(String employeeName) {
    this.employeeName = employeeName;
}
public Department getDepartment() {
    return department;
}
public void setDepartmentId(Department department) {
    this.department = department;
}
public float getSalary() {
    return salary;
}
public void setSalary(float salary) {
    this.salary = salary;
}
public Employee() {
}
public Employee(int employeeId, String employeeName, Department department, float salary) {
    this.employeeId = employeeId;
    this.employeeName = employeeName;
    this.department = department;
    this.salary = salary;
}

}
