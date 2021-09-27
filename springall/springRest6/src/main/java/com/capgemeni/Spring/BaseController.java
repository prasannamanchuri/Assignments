package com.capgemeni.Spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BaseController {
	@RequestMapping(value = "operation",method=RequestMethod.POST)
	public @ResponseBody String add(@RequestParam("num1") int num1,
			@RequestParam("num2") int num2,@RequestParam("type") String type){
		switch(type)
		{
		case "add":
			return Integer.toString(num1+num2);
		case "sub":
			return Integer.toString(num1-num2);
		case "multiply":
			return Integer.toString(num1*num2);
		case "division":
			return Integer.toString(num1/num2);
		default:
			return "Invalid Operation";
			
		}
	}
}
	