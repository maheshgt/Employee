package com.emp.controller;

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

import com.emp.entity.Employee;
import com.emp.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService empService;

	@PostMapping("/createEmployee")
	public String createEmployee(@RequestBody Employee emp) {
		return empService.createEmployee(emp);
		
	}

	@DeleteMapping("/deleteEmployee/{id}")
	public String deleteEmployee(@PathVariable int id) {
		return empService.deleteEmployee(id);
		
	}

	@GetMapping("/getEmployee/{id}")
	public Object getEmployee(@PathVariable int id) {
		return empService.getEmployeeById(id);
	}

	@GetMapping("/getEmployeeList")
	public List<Employee> getEmpList() {
		return empService.getEmployeeList();
	}

	@PutMapping("/updateEmployee/{id}")
	public String updateEmployee(@PathVariable int id) {
		return empService.updateEmployee(id);
	}

	@DeleteMapping("/deleteAllEmp")
	public String deletaAllEmployee() {
		empService.deleteAllEmployee();
		return "deleted all Employees";
	}
}
