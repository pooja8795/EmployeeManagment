package com.example.employee.service;

import java.util.HashSet;
import java.util.Set;
import org.springframework.stereotype.Service;
import com.example.employee.model.EmployeeDetails;
import com.example.employee.repository.EmployeeRepository;

@Service
public class EmployeeServiceImp implements EmployeeService{

	private final EmployeeRepository employeeRepository;

	public EmployeeServiceImp(EmployeeRepository employeeRepository) {
		
		this.employeeRepository = employeeRepository;
	}

	@Override
	public Set<EmployeeDetails> findAll() {
		Set<EmployeeDetails> empdetails= new HashSet<>();
		employeeRepository.findAll().forEach(empdetails::add);
		return empdetails;
	}

	@Override
	public EmployeeDetails findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeDetails save(EmployeeDetails object) {
		
		return employeeRepository.save(object);
	}

	@Override
	public void delete(EmployeeDetails object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

}
