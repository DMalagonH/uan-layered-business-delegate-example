package com.layered.uan.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.layered.uan.entity.Employee;
import com.layered.uan.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository repo;

	public Employee addEmployee(Employee emp) {
		emp = repo.save(emp);
		return emp;
	}
	
	public Optional<Employee> findEmployeeById(Long empId) {
		return repo.findById(empId);
	}
	
	public Iterable<Employee> findAllEmployee() {
		return repo.findAll();
	}

	public void deleteEmployeeById(Employee emp) {
		repo.delete(emp);
	}
}
