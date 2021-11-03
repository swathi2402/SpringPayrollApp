package com.brigdelabz.springpayrollapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class SpringPayrollAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringPayrollAppApplication.class, args);
		log.info("Employee Payroll App Started");
	}

}
