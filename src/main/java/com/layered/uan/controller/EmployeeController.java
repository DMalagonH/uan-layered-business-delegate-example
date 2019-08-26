package com.layered.uan.controller;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.layered.uan.entity.Employee;
import com.layered.uan.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService service;

	@RequestMapping("/TCS/employees")
	public Iterable<Employee> findAllEmployee() {
		return service.findAllEmployee();
	}
	
	@RequestMapping("/TCS/employee/{id}")
	public Employee findbyId(@PathVariable Long id) {
		Optional<Employee> emplyoeeContainer = service.findEmployeeById(id);
		return emplyoeeContainer.isPresent()?emplyoeeContainer.get():null;
	}
	
	@RequestMapping("/TCS/employee/addDemoEmployee")
	public Employee addEmployee() {
		Employee emp = new Employee();
		emp.setName("Demo Demo");
		emp.setSex("M");
		emp.setAddress("Demo");
		return service.addEmployee(emp);
	}
	
	@RequestMapping("/TCS/employee/delete/{id}")
	public String delete(@PathVariable Long id) {
		Optional<Employee> emp = service.findEmployeeById(id);
		if(emp.isPresent()) {
			service.deleteEmployeeById(emp.get());
			return "deleted Successfully";
		}
		return "Employee Not Exists, Not able to delete";
	}

}
