package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	
	
    @PostMapping(path = "/save", consumes = "application/json", produces = "application/json")
    public void saveEmployee(@RequestBody Employee employee)  {
	System.out.println(employee.getAge());	
	System.out.println(employee.getName());
		employeeService.saveEmployee(employee);
		
	}
	
    @GetMapping(path = "/getEmployee", consumes = "application/json", produces = "application/json")
    public List<Employee> getEmployee()  {
	
		return employeeService.getEmployee();
		
	}
    
    @DeleteMapping(path = "/deleteEmployee/{empId}", consumes = "application/json", produces = "application/json")
    public void deleteEmployee(@PathVariable("empId") int empId) {
    	  
        System.out.println("(Service Side) Deleting employee with Id: " + empId);
  
        employeeService.deleteEmployee(empId);
    }
    
    @PutMapping(path = "/updateEmployee/{empId}", consumes = "application/json", produces = "application/json")
    public Employee updateEmployee(@PathVariable("empId") int empId) {
    	  
        System.out.println("(Service Side) Deleting employee with Id: " + empId);
  
        return employeeService.updateEmployee(empId);
    }



}
