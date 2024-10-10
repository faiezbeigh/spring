package com.project.spring_backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Department")
public class Department {
@Id
@GeneratedValue
@Column(name = "Dept_id")
private int departmentId;

@Column(name = "Dept_name")
private String departmentName;

@Column(name = "Dept_address")
private String departmentAdress;

@Column(name = "Supervisor")
private String supervisor;

public int getDepartmentId() {
    return departmentId;
}
public void setDepartmentId(int departmentId) {
    this.departmentId = departmentId;
}
public String getDepartmentName() {
    return departmentName;
}
public void setDepartmentName(String departmentName) {
    this.departmentName = departmentName;
}
public String getDepartmentAdress() {
    return departmentAdress;
}
public void setDepartmentAdress(String departmentAdress) {
    this.departmentAdress = departmentAdress;
}
public String getSupervisor() {
    return supervisor;
}
public void setSupervisor(String supervisor) {
    this.supervisor = supervisor;
}
public Department() {
}
public Department(int departmentId, String departmentName, String departmentAdress, String supervisor) {
    this.departmentId = departmentId;
    this.departmentName = departmentName;
    this.departmentAdress = departmentAdress;
    this.supervisor = supervisor;
}

}
