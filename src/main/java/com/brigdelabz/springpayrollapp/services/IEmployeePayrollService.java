package com.brigdelabz.springpayrollapp.services;

import java.util.List;

import com.brigdelabz.springpayrollapp.dto.EmployeePayrollDTO;
import com.brigdelabz.springpayrollapp.model.EmployeePayrollData;

public interface IEmployeePayrollService {

	List<EmployeePayrollData> getEmployeePayrollData();

	EmployeePayrollData getEmployeePayrollDataById(int empId);

	EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO);

	EmployeePayrollData updateEmployeePayrollData(int empId, EmployeePayrollDTO employeePayrollDTO);

	void deleteEmployeePayrollData(int empId);

	List<EmployeePayrollData> findEmployeeByDepartment(String department);
}
