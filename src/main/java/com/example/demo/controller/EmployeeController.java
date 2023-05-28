package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.Employeeservice;

@RestController //define class as controller class for Restful web
public class EmployeeController {
	@Autowired
	Employeeservice es;
	
	@PostMapping(value="/postdata")///adddata to db
	public void postemp(@RequestBody Employee emp) {
		es.postdata(emp);
	}

}
