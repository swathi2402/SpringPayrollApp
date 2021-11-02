package com.brigdelabz.springpayrollapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payrollservice")
public class EmployeePayrollController {

	@RequestMapping(value = { "", "/", "/get" })
	public ResponseEntity<String> getEmployeePayrollData() {
		return new ResponseEntity<String>("Get Call Success", HttpStatus.OK);
	}

	@RequestMapping("/get/{empId}")
	public ResponseEntity<String> getEmployeePayrollData(@PathVariable("empId") int empId) {
		return new ResponseEntity<String>("Get Call Success for id: " + empId, HttpStatus.OK);
	}
}
