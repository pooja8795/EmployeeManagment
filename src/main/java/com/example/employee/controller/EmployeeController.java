package com.example.employee.controller;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee.model.EmployeeDetails;
import com.example.employee.service.EmployeeService;
import com.example.employee.service.EmployeeServiceImp;


@Controller
public class EmployeeController {
	
	
	private final EmployeeService empservice;
	
	
	public EmployeeController(EmployeeService empservice) {
		
		this.empservice = empservice;
	}
	
	@PostMapping("/employee/new")
	
	public String saveDetails(EmployeeDetails empdetails)
	{
		EmployeeDetails savedemp= empservice.save(empdetails);
		
		return "New Row Added "+savedemp.getEmp_id();
	}
	

//	public List<EmployeeDetails> getDetails()
//	{
//		List<EmployeeDetails> empdetails = empserviceimp;
//		System.out.println("Controller Called");
//		return empdetails;
//	}
	
//	@GetMapping("/employee/{id}")
//	public Optional<Stream<EmployeeDetails>> getEmployeeId(@PathVariable ("id") int emp_id )
//	{
//		
//		Optional<Stream<EmployeeDetails>> matchingObject = Optional.of(empservice.ed().stream().
//			    filter(p -> p.getEmp_id()==(emp_id)));
//			   
//		return matchingObject;
//	}

	
//	@RequestMapping("/myname/{id}/{Enter}")
//	//public String getEmpid(@PathVariable String id)
//    //public String getEmpid(@PathVariable ("id") String name)
//	//Variables declared as path variable are required by default and hence here http://localhost:8080/myname will not provide any output
//	public String getEmpid(@PathVariable (value="id") String name,@PathVariable (value="Enter") String name1)
//	{
//		return name+" " +name1;
//	}
}

