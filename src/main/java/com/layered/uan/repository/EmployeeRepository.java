package com.layered.uan.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.layered.uan.entity.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}