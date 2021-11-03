package com.brigdelabz.springpayrollapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class SpringPayrollAppApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringPayrollAppApplication.class, args);
		log.info("Employee Payroll App Started in {} Environment", context.getEnvironment().getProperty("environment"));
		log.info("Employee Payroll DB User is {} ", context.getEnvironment().getProperty("spring.datasource.username"));
	}

}
