package com.example.employee.demo1.service.impl;

import com.example.employee.demo1.model.Employee;
import com.example.employee.demo1.repository.EmployeeRepository;
import com.example.employee.demo1.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployee() {
        List<Employee> employees = employeeRepository.findAll();
        return employees;
    }

    @Override
    public Employee findEmployeeById(Long employeeId) {
        Employee employee = employeeRepository.findById(employeeId).get();
        return  employee;
    }

    @Override
    public List<Employee> findByName(String employeeName) {
        return null;
    }
}
