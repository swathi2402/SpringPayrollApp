package com.brigdelabz.springpayrollapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brigdelabz.springpayrollapp.dto.EmployeePayrollDTO;
import com.brigdelabz.springpayrollapp.exceptions.EmployeePayrollException;
import com.brigdelabz.springpayrollapp.model.EmployeePayrollData;
import com.brigdelabz.springpayrollapp.repository.EmployeePayrollRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class EmployeePayrollService implements IEmployeePayrollService {

	@Autowired
	private EmployeePayrollRepository employeeRepository;

	@Override
	public List<EmployeePayrollData> getEmployeePayrollData() {
		return employeeRepository.findAll();
	}

	@Override
	public EmployeePayrollData getEmployeePayrollDataById(int empId) {
		return employeeRepository.findById(empId).orElseThrow(
				() -> new EmployeePayrollException("Employee with employee Id " + empId + " does not exists...!"));
	}

	@Override
	public List<EmployeePayrollData> findEmployeeByDepartment(String department) {
		return employeeRepository.findEmployeeByDepartment(department);
	}

	@Override
	public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) {
		EmployeePayrollData employeePayrollData = null;
		employeePayrollData = new EmployeePayrollData(employeePayrollDTO);
		log.debug("Employee Data: " + employeePayrollData.toString());
		return employeeRepository.save(employeePayrollData);
	}

	@Override
	public EmployeePayrollData updateEmployeePayrollData(int empId, EmployeePayrollDTO employeePayrollDTO) {
		EmployeePayrollData employeePayrollData = this.getEmployeePayrollDataById(empId);
		employeePayrollData.updateEmployeePayrollData(employeePayrollDTO);
		return employeeRepository.save(employeePayrollData);
	}

	@Override
	public void deleteEmployeePayrollData(int empId) {
		EmployeePayrollData employeePayrollData = this.getEmployeePayrollDataById(empId);
		employeeRepository.delete(employeePayrollData);
	}
}
