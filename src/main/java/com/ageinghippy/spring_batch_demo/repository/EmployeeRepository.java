package com.ageinghippy.spring_batch_demo.repository;

import com.ageinghippy.spring_batch_demo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}

