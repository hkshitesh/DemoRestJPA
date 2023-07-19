package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository repository;
	public Employee addEmployee(Employee employee) {
		return repository.save(employee);
	}
	public List<Employee> getAllEMployees() {

		return repository.findAll();
	}
	public Employee getEmployeeById(int id) {

		Optional<Employee> optionalEmployee = repository.findById(id);
		Employee emp = null;
		if(optionalEmployee.isPresent()) {
			emp=optionalEmployee.get();
		}
		else {
			throw new RuntimeException(" Employee not found for id : "+id);
		}
		return emp;
	}
	public Employee editEmployee(Employee employee) {
		Employee existingEmployee = repository.getReferenceById(employee.getId());
		existingEmployee.setName(employee.getName());
		return repository.save(existingEmployee);
	}
	public String deleteEMp(int id) {
		repository.deleteById(id);		
		return "Employee "+id+" Deleted";
	}
	
	public void show()
	{
		System.out.println("Hello Jenkins!");
	}
	
	

}
