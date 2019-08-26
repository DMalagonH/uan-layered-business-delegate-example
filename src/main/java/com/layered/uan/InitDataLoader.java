package com.layered.uan;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.layered.uan.entity.Employee;
import com.layered.uan.repository.EmployeeRepository;

@Component
public class InitDataLoader {
	
	@Autowired
	private EmployeeRepository rep;
	
	public void loadData() {
		createData().forEach(
			emp->{
				rep.save(emp);
				System.out.println("Successfully saved ::" + emp);
			}
		);
	}
	
	private List<Employee> createData() {
		List<Employee> employees = new ArrayList<Employee>();
		
		Employee emp = new Employee();
		emp.setName("Bill Gates");
		emp.setSex("M");
		emp.setAddress("Mountaview");
		
		Employee emp1 = new Employee();
		emp1.setName("Donal Trump");
		emp1.setSex("M");
		emp1.setAddress("Washington");
		
		Employee emp2 = new Employee();
		emp2.setName("Marie Curie");
		emp2.setSex("F");
		emp2.setAddress("Haute-Savoie");
		
		employees.add(emp);
		employees.add(emp1);
		employees.add(emp2);
		
		return employees;
	}

}
