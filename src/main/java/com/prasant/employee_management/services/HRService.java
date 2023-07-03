package com.prasant.employee_management.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prasant.employee_management.models.Employee;

@Service
public class HRService {
    @Autowired
    private EmployeeService employeeService;

    public List<Employee> getAllEmployee() {
        return employeeService.getAllEmployee();
    }

    public String addEmployee(Employee employee) {
        return employeeService.addEmployee(employee);
    }

    public String deleteEmployee(Integer id) {
        return employeeService.deleteEmployee(id);
    }

    public String updateSalary(Integer id, Integer salary) {
        return employeeService.updateSalary(id, salary);
    }

    public String updateJobRole(Integer id, String jobrole) {
        return employeeService.updateJobRole(id, jobrole);
    }


}
