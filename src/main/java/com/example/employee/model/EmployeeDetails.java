package com.example.employee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



import lombok.Data;

//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="Employee")

public class EmployeeDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long emp_id;
	
	@Column(name = "Employee_Name")
	String emp_name;
	@Column(name = "Salary")
	int salary;
	

	
	public EmployeeDetails() {
		super();
		// TODO Auto-generated constructor stub
	}



	public long getEmp_id() {
		return emp_id;
	}



	public void setEmp_id(long emp_id) {
		this.emp_id = emp_id;
	}



	public String getEmp_name() {
		return emp_name;
	}



	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}



	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}



	public EmployeeDetails(long emp_id, String emp_name, int salary) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.salary = salary;
	}



	@Override
	public String toString() {
		return "EmployeeDetails [emp_id=" + emp_id + ", emp_name=" + emp_name + ", salary=" + salary + "]";
	}
}