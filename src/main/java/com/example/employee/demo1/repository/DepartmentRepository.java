package com.example.employee.demo1.repository;

import com.example.employee.demo1.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long> {

}
