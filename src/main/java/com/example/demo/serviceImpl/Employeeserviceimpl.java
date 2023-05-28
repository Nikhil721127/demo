package com.example.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.Repository.EmployeeRepository;
import com.example.demo.model.Employee;
import com.example.demo.service.Employeeservice;

public class Employeeserviceimpl implements Employeeservice{
	@Autowired
	EmployeeRepository er;

	@Override
	public void postdata(Employee emp) {
		er.save(emp);
		
	}

}
