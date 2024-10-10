package com.project.spring_backend.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.spring_backend.model.Department;
import com.project.spring_backend.model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
public List<Employee> FindByDepartment(Department department);
}
