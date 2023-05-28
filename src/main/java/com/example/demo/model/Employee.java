package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
@Data   //auto genrate setter and getter
@Entity  //automatic table creation in db

public class Employee {
	@Id  //defining feild as primary key
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empid;
	private String empname;
	private String address;

}
