package com.prasant.employee_management.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prasant.employee_management.models.Employee;
import com.prasant.employee_management.services.EmployeeService;

@RestController
@RequestMapping("employee")
public class EmployeeContoller {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable Integer id){
        return employeeService.getEmployeeById(id);
    }

    @PutMapping("/{id}")
    public String updateEmployee(@PathVariable Integer id, Employee employee){
        return employeeService.updateEmployeeById(id, employee);
    }
}
