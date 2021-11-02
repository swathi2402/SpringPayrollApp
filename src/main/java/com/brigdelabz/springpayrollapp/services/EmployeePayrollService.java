package com.brigdelabz.springpayrollapp.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.brigdelabz.springpayrollapp.dto.EmployeePayrollDTO;
import com.brigdelabz.springpayrollapp.model.EmployeePayrollData;

@Service
public class EmployeePayrollService implements IEmployeePayrollService {

	@Override
	public List<EmployeePayrollData> getEmployeePayrollData() {
		List<EmployeePayrollData> employeeDataList = new ArrayList<>();
		employeeDataList.add(new EmployeePayrollData(1, new EmployeePayrollDTO("Lisa", 2000)));
		return employeeDataList;
	}

	@Override
	public EmployeePayrollData getEmployeePayrollDataById(int empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeePayrollData updateEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEmployeePayrollData(int empId) {
		// TODO Auto-generated method stub

	}

}
