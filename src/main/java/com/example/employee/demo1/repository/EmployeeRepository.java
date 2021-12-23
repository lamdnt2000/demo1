package com.example.employee.demo1.repository;

import com.example.employee.demo1.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    List<Employee> findByEmployeeNameContaining(String employeeName);
    List<Employee> findByEmployeeNameContainingAndDepartment(String employeeName, DepartmentRepository department);
}
