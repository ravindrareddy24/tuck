package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Employee;

public interface EmployeeService {
	
	public void saveEmployee(Employee employee);
	
	public List<Employee> getEmployee();
	public void deleteEmployee(int empId);

	public Employee updateEmployee(int empId);
	


}
