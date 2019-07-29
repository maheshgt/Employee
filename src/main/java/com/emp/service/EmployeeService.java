package com.emp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.emp.entity.Employee;

@Service
public interface EmployeeService {

	public String createEmployee(Employee emp);

	public String updateEmployee(int id, String addr);

	public void deleteEmployee(int id);

	public Object getEmployeeById(int id);

	public List<Employee> getEmployeeList();

	public void deleteAllEmployee();
}
