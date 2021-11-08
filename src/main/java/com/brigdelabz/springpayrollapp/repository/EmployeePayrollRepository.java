package com.brigdelabz.springpayrollapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brigdelabz.springpayrollapp.model.EmployeePayrollData;

public interface EmployeePayrollRepository extends JpaRepository<EmployeePayrollData, Integer>{

}
