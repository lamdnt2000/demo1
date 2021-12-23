package com.example.employee.demo1.controller;

import com.example.employee.demo1.model.Employee;
import com.example.employee.demo1.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/findAll")
    public ResponseEntity<List<Employee>> findAllEmployee(){
        List<Employee> employees = employeeService.getAllEmployee();
        return ResponseEntity.ok(employees);
    }
}
