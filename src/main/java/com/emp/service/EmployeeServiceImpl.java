package com.emp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.entity.Employee;
import com.emp.exception.EmployeeNotFoundException;
import com.emp.repo.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepo empRepo;

	@Override
	public String createEmployee(Employee emp) {
		if(empRepo.save(emp) != null)
			return "Saved successfully... ";
		else
			return "Plz try again..";
	}

	@Override
	public String updateEmployee(int id) {
		Employee emp = (Employee) empRepo.findEmpById(id);
		emp.setEmpAddress("Jigani");
		if(empRepo.save(emp)!=null)
			return "updated successfully";
		else
			return "not updated";
	}

	@Override
	public String deleteEmployee(int id) {
		empRepo.deleteById(id);
		return "delete successfully";
	}

	@Override
	public Object getEmployeeById(int id) {
		Employee emp =  (Employee) empRepo.findEmpById(id);
		
		 if(emp !=null) 
			 return emp; 
		 else
			 return "Employee is not exist with the given id : "+id;
	}

	@Override
	public List<Employee> getEmployeeList() {
		return empRepo.findAll();
	}

	@Override
	public void deleteAllEmployee() {
		empRepo.deleteAll();
	}

}
