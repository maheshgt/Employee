package com.emp.service;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.emp.entity.Employee;
import com.emp.repo.EmployeeRepo;

@RunWith(MockitoJUnitRunner.class)
public class EmpServiceTest {
	
	
	@Mock
	EmployeeRepo employeeRepo;

	@InjectMocks
	EmployeeServiceImpl employeeService;

	@Test
	public void testCreateEmployee() {
		Employee emp = new Employee(1, "mahesh", "gowtham", "enggineer", "Bangalore");
		Mockito.when(employeeRepo.save(emp)).thenReturn(emp);
		String actualValue = employeeService.createEmployee(emp);
		assertEquals("Saved successfully... ", actualValue);
	}
	
	
	
	@Test
	public void testGetEmployeeById() {
		
		  Employee emp = new Employee();
		  
		  emp.setEmpId(1); emp.setEmpFirstName("Mahesh");
		  emp.setEmpLastName("Gowtham"); emp.setEmpDesignation("Enggineer");
		  emp.setEmpAddress("Bangalore");
		  
		  Mockito.when(employeeRepo.findEmpById(Mockito.anyInt())).thenReturn(emp);
		  Employee emp1 = (Employee) employeeService.getEmployeeById(1);
		 assertEquals(emp1, emp);
	}
	 
	
	@Test
	public void testGetAllEmployees() {
		
		List<Employee> list = new ArrayList<Employee>();
		Employee emp1 = new Employee(1,"mahesh", "gowtham","bangalore","engineer");
		Employee emp2 = new Employee(2,"shiva", "kumar","bangalore","engineer");
		Employee emp3 = new Employee(3,"venkat", "reddy","bangalore","engineer");
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		Mockito.when(employeeRepo.findAll()).thenReturn(list);
		List<Employee> emplist = employeeService.getEmployeeList();
		int actualSize = emplist.size();
		assertEquals(3, actualSize);
	}
	
	@Test
	public void testDeleteEmployee() {
		
		
	}
	
	@Test
	public void testUpdateEmployee() {
		
		 Employee emp = new Employee();
		  
		  emp.setEmpId(1); emp.setEmpFirstName("Mahesh");
		  emp.setEmpLastName("Gowtham"); emp.setEmpDesignation("Enggineer");
		  emp.setEmpAddress("Bangalore");
		  
		  Mockito.when(employeeRepo.findEmpById(1)).thenReturn(emp);

		  Mockito.when(employeeRepo.save(emp)).thenReturn(emp);
		  
		  String emp1 = employeeService.updateEmployee(1,"addr");
		  assertEquals("updated successfully", emp1);
	}
	
}
