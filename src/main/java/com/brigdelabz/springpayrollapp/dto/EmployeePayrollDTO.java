package com.brigdelabz.springpayrollapp.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

public class EmployeePayrollDTO {

	@Pattern(regexp = "^[A-Z]{1}[a-zA_Z\\s]{2,}$", message = "Employee name Invalid")
	public String name;
	
	@Min(value = 500, message = "Minimum wage should be more than 500")
	public long salary;

	public EmployeePayrollDTO(String name, long salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "name=" + name + ", salary=" + salary;
	}
}
