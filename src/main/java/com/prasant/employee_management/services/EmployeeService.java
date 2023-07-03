package com.prasant.employee_management.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prasant.employee_management.models.Employee;
import com.prasant.employee_management.repositories.IEmployeeRepo;

@Service
public class EmployeeService {

    @Autowired
    private IEmployeeRepo employeeRepo;

    public Employee getEmployeeById(Integer id) {
        return employeeRepo.findById(id).orElse(null);
    }

    public String updateEmployeeById(Integer id, Employee employee) {
        Employee emp = employeeRepo.findById(id).orElse(null);

        if(emp == null){
            return "Invalid Employee Id : " + id;
        }

        if(employee.getFirstName() != null){
            emp.setFirstName(employee.getFirstName());
        }
        if(employee.getLastName() != null){
            emp.setLastName(employee.getLastName());
        }

        employeeRepo.save(emp);
        
        return "Employee details updated!";
    }

    public List<Employee> getAllEmployee() {
        return employeeRepo.findAll();
    }

    public String addEmployee(Employee employee) {
        employeeRepo.save(employee);
        return "Employee added successfully!";
    }

    public String deleteEmployee(Integer id) {
        if(!employeeRepo.existsById(id)){
            return "Invalid Id : "+id;
        }

        employeeRepo.deleteById(id);
        return "Employee deleted successfully!";
    }

    public String updateSalary(Integer id, Integer salary) {
        Employee employee = employeeRepo.findById(id).orElse(null);
        if(employee == null){
            return "Invalid Id : "+id;
        }

        employee.setSalary(salary);
        employeeRepo.save(employee);
        return "Salary updated successfully!";
    }

    public String updateJobRole(Integer id, String jobrole) {
        Employee employee = employeeRepo.findById(id).orElse(null);
        if(employee == null){
            return "Invalid Id : "+id;
        }

        employee.setJobRole(jobrole);
        employeeRepo.save(employee);
        return "JobRole updated successfully!";
    }
    
}
