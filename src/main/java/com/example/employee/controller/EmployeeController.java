package com.example.employee.controller;

import com.example.employee.Configuration.BasicConfiguration;
import com.example.employee.model.EmployeeDetails;
import com.example.employee.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import java.util.*;


@RestController
public class EmployeeController {

	private final EmployeeService empservice;

	public EmployeeController(EmployeeService empservice) {

		this.empservice = empservice;
	}
	@Autowired
	private Environment env;

	@Autowired
	BasicConfiguration configuration;

	@RequestMapping("/welcome")
	public String getwelcomeString()
	{
		return empservice.retrieveMessage();

	}
	@PostMapping("/employee/new")
	public String saveDetails(@RequestBody EmployeeDetails empdetails) {
		EmployeeDetails savedemp = empservice.save(empdetails);

		return "New Row Added " + savedemp.getEmp_id();
	}

	@GetMapping("/employees")
	public @ResponseBody
	Set<EmployeeDetails> getDetails() {
		return empservice.findAll();
	}

	@GetMapping("/employees/{id}")
	@ResponseBody
	public EmployeeDetails getDetailsByID(@PathVariable("id") Long emp_id) {
		return empservice.findById(emp_id);
	}

	@DeleteMapping("/deleteAll")
	public void deleteAll() {
		empservice.deleteAll();
	}

	@DeleteMapping("/delete/{id}")
	public void deleteByID(@PathVariable("id") Long emp_id) {
		empservice.deleteById(emp_id);
	}

	@GetMapping("/Environment/Configuration")
	public String method()
	{
		String path=env.getProperty("NewEmployee");
		return path;
	}

	@RequestMapping("/Configuration Class")
	public StringBuilder getBasicDetails() {
		ArrayList<Object> list = new ArrayList<>();
		list.add(configuration.getMsg());
		list.add(configuration.getNo());
		list.add(configuration.getApp_name());
		StringBuilder sb=new StringBuilder();

		for (Object obj : list) {
			sb.append(obj);
			sb.append("\t");
		}
		return sb;
	}
}
