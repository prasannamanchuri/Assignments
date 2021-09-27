package com.capgemini.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.capgemini.springmvc.dao.UserDao;
import com.capgemini.springmvc.entity.User;

@Controller
public class BaseController {
	
	@Autowired
	UserDao userDao;
	
	@RequestMapping(value = "registration")
	public @ResponseBody String registration(@ModelAttribute("user") User user) {
		return userDao.save(user);
	}
	
	@RequestMapping(value = "register")
	public String register() {
		return "register";
	}
	
	@RequestMapping(value = "success")
	public String success() {
		return "success";
	}
	
	@RequestMapping(value = "error")
	public String failure() {
		return "error";
	}
	
	@RequestMapping(value = "login")
	public String login() {
		return "login";
	}

	@RequestMapping(value = "check_login")
	public @ResponseBody String check_login(@ModelAttribute("user") User user) {
		User getUser=userDao.getUsername(user.getUsername());
		if(user.getUsername().equalsIgnoreCase(getUser.getUsername())&&user.getPassword().equalsIgnoreCase(getUser.getPassword()))
			return "success";
		else return "failure";
	}
	
}
