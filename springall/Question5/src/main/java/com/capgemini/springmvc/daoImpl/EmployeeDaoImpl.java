package com.capgemini.springmvc.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import com.capgemini.springmvc.dao.EmployeeDao;
import com.capgemini.springmvc.entity.Employee;

@Component
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	MongoTemplate mongoTemplate;

	@Override
	public String save(Employee employee) {
		try {
			if(getEmployeename(employee.getEmployeename())==null) {
				mongoTemplate.save(employee);
			}
			else
				return "User Exists already";
			return "success";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "failure";
	}

	


	public Employee getEmployeename(String employeename) {
		Query query = new Query(Criteria.where("employeename").is(employeename));
	    Employee employee= mongoTemplate.findOne(query, Employee.class);
		return employee;
	}




	@Override
	public List<Employee> getemployeelist() {
		List<Employee> list= mongoTemplate.findAll(Employee.class);
		return list;
	}

	/*
	@Override
	public String update(Employee employee) {
		Query query = new Query(Criteria.where("employeeid").is(employeeid));
		User user = mongoTemplate.findOne(query, User.class);
		return user;
		
		return null;
	}

	@Override
	public String delete(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}*/

}
