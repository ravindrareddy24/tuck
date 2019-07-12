package com.example.demo.servieimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repogitory.EmployeeRepository;
import com.example.demo.service.EmployeeService;

@Service
 public class EmployeeServiceImpl implements EmployeeService {
	
    @Autowired
	EmployeeRepository 	employeeRepository;
    
	@Override
	public void saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeRepository.save(employee);
		
	}

	@Override
	public List<Employee> getEmployee() {
		// TODO Auto-generated method stub
		return 	employeeRepository.findAll();

		
	}

	@Override
	public void deleteEmployee(int empId) {
		employeeRepository.deleteById(empId);	
		
	}

	@Override
	public Employee updateEmployee(int empId) {
		Optional<Employee> optional = employeeRepository.findById(empId);
		if(optional.isPresent() ) {
			Employee emp = optional.get();
			emp.setName("pramod");
			return employeeRepository.save(emp);
		}
		
		return null;
	}


}
