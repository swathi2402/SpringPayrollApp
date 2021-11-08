package com.brigdelabz.springpayrollapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.brigdelabz.springpayrollapp.model.EmployeePayrollData;

public interface EmployeePayrollRepository extends JpaRepository<EmployeePayrollData, Integer> {

	@Query(value = "SELECT * FROM employee_payroll, employee_department WHERE employee_id = id and department = :department", nativeQuery = true)
	List<EmployeePayrollData> findEmployeeByDepartment(String department);
}
