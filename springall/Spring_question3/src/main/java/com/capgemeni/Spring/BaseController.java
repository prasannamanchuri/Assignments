package com.capgemeni.Spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.capgemeni.Spring.Model.User;

@Controller
public class BaseController {
	@RequestMapping(value = "submit")
	public @ResponseBody String add(@ModelAttribute("user") User user) {
		String result;
		if(user.getUsername().equalsIgnoreCase("admin")&&user.getPassword().equalsIgnoreCase("admin"))
		{
			 result="success";
		}
		else
		{
			  result="fail";
		}
		return result;
	}

	
}
