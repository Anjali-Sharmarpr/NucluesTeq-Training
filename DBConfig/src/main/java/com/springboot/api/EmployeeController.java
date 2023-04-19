package com.springboot.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//@CrossOrigin(origins = "http://localhost:")

@RestController
public class EmployeeController {


	@Autowired
	private EmployeeRepository employeeRepository;
	

	// get all employees
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		
		return (List<Employee>) employeeRepository.findAll();
	}		
	
	// create employee 
	
	@PostMapping("/employees")
	public Employee createEmployee(@RequestBody Employee employee) {
		
		return employeeRepository.save(employee);
	}
	
	// get employee  by id
	
	@GetMapping("/employees/{id}")
	public Employee getbyID(@PathVariable int id) {
		
		Employee employee = null;
		employee= this.employeeRepository.findById(id);
		
		return employee;
	}
	
	//delete by id 
	
	@DeleteMapping("/employees/{id}")
	public String deleteEmployee(@PathVariable int id) {
		
		employeeRepository.deleteById(id);
		return "Employee Deleted";
	}
	
	//update by id

	@PutMapping("/employees/{empid}")
	public Employee updateEmployeeById(@PathVariable int empid, @RequestBody Employee employee) {
		
		employee.setId(empid);
		employeeRepository.save(employee);
		return employee;
 }
}
	

