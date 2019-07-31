package com.emp.controller;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.emp.repo.EmployeeRepo;
import com.emp.service.EmployeeServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeControllerTest {
	
	@Mock
	EmployeeRepo employeeRepo;
	
	@InjectMocks
	EmployeeServiceImpl employeeService;
	
	
	
	@Test
	public void testCreateEmployee() {

	
	}

	@Test
	public void testDeleteEmployee() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetEmployee() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetEmpList() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateEmployee() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeletaAllEmployee() {
		fail("Not yet implemented");
	}

}
