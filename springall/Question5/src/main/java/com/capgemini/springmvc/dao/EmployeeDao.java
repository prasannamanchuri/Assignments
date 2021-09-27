package com.capgemini.springmvc.dao;

import java.util.List;

import com.capgemini.springmvc.entity.Employee;

public interface EmployeeDao {
	
	public String save(Employee employee);
	//public String update(Employee employee);
	//public String delete(Employee employee);

	public List<Employee> getemployeelist();

}
