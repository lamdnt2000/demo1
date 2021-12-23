package com.example.employee.demo1.service;

import com.example.employee.demo1.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployee();
    Employee findEmployeeById(Long employeeId);
    List<Employee> findByName(String employeeName);
}
