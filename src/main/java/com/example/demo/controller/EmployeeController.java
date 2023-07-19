package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@PostMapping("/createEmp")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return service.addEmployee(employee);
	}
	
	@GetMapping("/readEmp")
	public List<Employee> getAll(){
		return service.getAllEMployees();
	}
	
	@GetMapping("/readOne/{id}")
	public Employee getEmployee(@PathVariable int id)
	{
		return service.getEmployeeById(id);
	}
	
	@PutMapping("/updateEmp")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return service.editEmployee(employee);
	}
	
	@DeleteMapping("/deleteEmp")
	public String deleteEMployee(@RequestParam int id) {
		return service.deleteEMp(id);
	}
	

}
