package com.example.employee.demo1.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long uid;
    private String employeeName;
    private Float salary;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="id")
    private Department department;

    public Employee() {
    }

    public Employee(Long uid, String employeeName, Float salary, Department department) {
        this.uid = uid;
        this.employeeName = employeeName;
        this.salary = salary;
        this.department = department;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
