package com.emp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "Employee")
@Setter
@Getter
@NoArgsConstructor
@ToString
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Emp_Id")
	private int empId;

	@Column(name = "Emp_FName")
	private String empFirstName;

	@Column(name = "Emp_LName")
	private String empLastName;

	@Column(name = "Emp_Desig")
	private String empDesignation;

	@Column(name = "Emp_Addr")
	private String empAddress;

	public Employee(int empId, String empFirstName, String empLastName, String empDesignation, String empAddress) {
		super();
		this.empId = empId;
		this.empFirstName = empFirstName;
		this.empLastName = empLastName;
		this.empDesignation = empDesignation;
		this.empAddress = empAddress;
	}

}
