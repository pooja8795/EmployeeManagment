package com.example.employee.controller;

import com.example.employee.model.EmployeeDetails;
import com.example.employee.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.Set;


@RestController
public class EmployeeController {


	private final EmployeeService empservice;


	public EmployeeController(EmployeeService empservice) {

		this.empservice = empservice;
	}


	@PostMapping("/employee/new")
	public String saveDetails(@RequestBody EmployeeDetails empdetails) {
		EmployeeDetails savedemp = empservice.save(empdetails);

		return "New Row Added " + savedemp.getEmp_id();
	}


	@GetMapping("/employee/{id}")
	@ResponseBody
	public EmployeeDetails getEmployeeId(@PathVariable("id") Long emp_id) {
		return empservice.findById(emp_id);

	}

	@GetMapping("/employee")
	public @ResponseBody
	Set<EmployeeDetails> getEmployees()  {
		return empservice.findAll();

	}



	@RequestMapping(value = "/employee/name/{name}", method = RequestMethod.GET)
	public EmployeeDetails getEmployeeByName(@PathVariable String name) {
		return empservice.findByName(name);

	}

	@DeleteMapping("/delete")
	public void deleteEmployees() {
		empservice.delete();

	}


	@DeleteMapping("/delete/{id}")
	public void deleteEmployeeById(@PathVariable("id") Long emp_id) {
		empservice.deleteById(emp_id);

	}


}


