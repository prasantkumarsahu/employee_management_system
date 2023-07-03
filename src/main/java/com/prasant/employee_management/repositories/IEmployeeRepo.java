package com.prasant.employee_management.repositories;

import org.springframework.data.repository.ListCrudRepository;

import com.prasant.employee_management.models.Employee;

public interface IEmployeeRepo extends ListCrudRepository<Employee, Integer>{
}
