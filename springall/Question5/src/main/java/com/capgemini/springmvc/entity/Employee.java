package com.capgemini.springmvc.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "employee")
public class Employee {
	@Id
	private String employeeid;
	private String employeename;
	private String employeedisgnation;
	private int employeesalary;
	public String getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(String employeeid) {
		this.employeeid = employeeid;
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public String getEmployeedisgnation() {
		return employeedisgnation;
	}
	public void setEmployeedisgnation(String employeedisgnation) {
		this.employeedisgnation = employeedisgnation;
	}
	public int getEmployeesalary() {
		return employeesalary;
	}
	public void setEmployeesalary(int employeesalary) {
		this.employeesalary = employeesalary;
	}
	
	
}
