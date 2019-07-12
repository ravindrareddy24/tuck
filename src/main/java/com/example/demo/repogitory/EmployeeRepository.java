package com.example.demo.repogitory;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employee;
@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> { // long: Type of Employee ID. {
	@Override
    List<Employee> findAll();

}
