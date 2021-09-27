package com.capgemini.springmvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.capgemini.springmvc.dao.EmployeeDao;
import com.capgemini.springmvc.entity.Employee;

@Controller
public class BaseController {
	
	@Autowired
	EmployeeDao employeedao;
	
	@RequestMapping(value = "add_employee",method=RequestMethod.POST)
	public @ResponseBody String registration(@ModelAttribute("employee") Employee employee) {
		return employeedao.save(employee);
	}
	
	@RequestMapping(value = "home")
	public String register() {
		return "home";
	}
	
	@RequestMapping(value = "list_employee")
	public @ResponseBody List<Employee> list_employee() {
		return employeedao.getemployeelist();
	}
	
}
