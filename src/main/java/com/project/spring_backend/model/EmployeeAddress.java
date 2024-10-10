package com.project.spring_backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Employee_Address")
public class EmployeeAddress {
@Id
@GeneratedValue
@Column(name = "Emp_add_id")
private int employeeaddId;

@OneToOne
@Column(name = "Emp_id")
private Employee employee;

@Column(name = "First_Name")
private String firstName;

@Column(name = "Last_Name")
private String lastName;

@Column(name = "Address")
private String address;

@Column(name = "City")
private String city;
public int getEmployeeaddId() {
    return employeeaddId;
}
public void setEmployeeaddId(int employeeaddId) {
    this.employeeaddId = employeeaddId;
}
public Employee getEmployee() {
    return employee;
}
public void setEmployee(Employee employee) {
    this.employee = employee;
}
public String getFirstName() {
    return firstName;
}
public void setFirstName(String firstName) {
    this.firstName = firstName;
}
public String getLastName() {
    return lastName;
}
public void setLastName(String lastName) {
    this.lastName = lastName;
}
public String getAddress() {
    return address;
}
public void setAddress(String address) {
    this.address = address;
}
public String getCity() {
    return city;
}
public void setCity(String city) {
    this.city = city;
}
public EmployeeAddress() {
}
public EmployeeAddress(int employeeaddId, Employee employee, String firstName, String lastName, String address,
        String city) {
    this.employeeaddId = employeeaddId;
    this.employee = employee;
    this.firstName = firstName;
    this.lastName = lastName;
    this.address = address;
    this.city = city;
}

}
