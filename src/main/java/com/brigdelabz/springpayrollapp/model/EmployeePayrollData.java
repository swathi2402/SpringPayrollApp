package com.brigdelabz.springpayrollapp.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import com.brigdelabz.springpayrollapp.dto.EmployeePayrollDTO;

import lombok.Data;

@Entity
@Table(name="employee_payroll")
public @Data class EmployeePayrollData {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="employee_id")
	private int employeeId;
	
	@Column(name="name")
	private String name;
	private long salary;
	public String gender;
	
	@Column(name="start_date")
	public LocalDate startDate;
	public String note;
	
	@Column(name="profile_pic")
	public String profilePic;
	
	@ElementCollection
	@CollectionTable(name="employee_department",joinColumns = @JoinColumn(name="id"))
	@Column(name="department")
	public List<String> department;

	public EmployeePayrollData() {
	}

	public EmployeePayrollData(int employeeId, EmployeePayrollDTO employeePayrollDTO) {
		this.employeeId = employeeId;
		this.name = employeePayrollDTO.name;
		this.salary = employeePayrollDTO.salary;
		this.gender = employeePayrollDTO.gender;
		this.startDate = employeePayrollDTO.startDate;
		this.note = employeePayrollDTO.note;
		this.profilePic = employeePayrollDTO.profilePic;
		this.department = employeePayrollDTO.department;
	}
}
