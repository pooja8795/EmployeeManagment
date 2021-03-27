package com.example.employee.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.employee.model.EmployeeDetails;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<EmployeeDetails, Long>{

    EmployeeDetails findByName (String name);


}
