package org.minorproject.controller;

import org.minorproject.entity.Employee;
import org.minorproject.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeDataController {

	@Autowired
	private EmployeeRepo employeeRepo;

	// to save employee information
	@PostMapping("/employee")
	public Employee saveEmployeeInfo(@RequestBody Employee employee) {
		return employeeRepo.save(employee);
	}

	// to get employees information
	@GetMapping("/employees")
	public List<Employee> getAllEmployeesInfo() {
		return employeeRepo.findAll();
	}

	// to delete employee information on the basis of employeeId
	@PostMapping("/employee/{empId}")
	public String getAllEmployeesInfo(@PathVariable("empId") Integer empId) {
		employeeRepo.deleteById(empId);
		return "Deleted";
	}

	// to get employee information on the basis of employee id
	@GetMapping("/employee/{empId}")
	public Employee getEmployee(@PathVariable("empId") Integer empId) {
		return employeeRepo.findById(empId).get();
	}

	// to update employee information on the basis of employee id
	@PostMapping("/updateEmployee/{empId}")
	public Employee updateEmployee(@RequestBody Employee employee, @PathVariable("empId") Integer empId) {

		Employee employeeFound = employeeRepo.findById(empId).get();
		employeeFound.setName(employee.getName());
		employeeFound.setSalary(employee.getSalary());
		employeeFound.setAge(employee.getAge());
		return employeeRepo.save(employeeFound);
	}

}
