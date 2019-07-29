package com.emp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.emp.entity.Employee;

@ControllerAdvice
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

	private static final long serialVersionUID = 1L;

	@ExceptionHandler(EmployeeNotFoundException.class)
	public final ResponseEntity<Employee> handleAllExceptions(Exception ex, WebRequest request) {
		Employee emp = new Employee(0, ex.getMessage(), request.getDescription(false), null, null);
		return new ResponseEntity<>(emp, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
