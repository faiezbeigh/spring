package com.project.spring_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.spring_backend.exception.ResourceNotFoundException;
import com.project.spring_backend.model.Employee;
import com.project.spring_backend.repository.EmployeeRepo;

@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {
    
    @Autowired
    private EmployeeRepo employeeRepo;
    
    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return employeeRepo.findAll();
    }  
    
    @PostMapping("/employees")
	public Employee createEmployee(@RequestBody Employee employee) {
		return employeeRepo.save(employee);
    }
     
    @GetMapping("/employees/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable int id) {
		Employee employee = employeeRepo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));
		return ResponseEntity.ok(employee);
    }
}