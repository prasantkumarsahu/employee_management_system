package com.prasant.employee_management.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prasant.employee_management.models.Employee;
import com.prasant.employee_management.services.HRService;

@RestController
@RequestMapping("hr")
public class HRController {
    
    @Autowired
    private HRService hrService;

    @GetMapping("/all")
    public List<Employee> getAllEmployee(){
        return hrService.getAllEmployee();
    }

    @PostMapping("/")
    public String addEmployee(Employee employee){
        return hrService.addEmployee(employee);
    }

    @DeleteMapping("/{id}")
    public String removeEmployee(@PathVariable Integer id){
        return hrService.deleteEmployee(id);
    }

    @PutMapping("/jobrole/{id}/{jobrole}")
    public String updateJobRole(@PathVariable Integer id, @PathVariable String jobrole){
        return hrService.updateJobRole(id, jobrole);
    }

    @PutMapping("/salary/{id}/{salary}")
    public String updateSalary(@PathVariable Integer id, @PathVariable Integer salary){
        return hrService.updateSalary(id, salary);
    }
}
