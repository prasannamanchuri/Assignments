package com.capgemeni;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController
{
 @RequestMapping(value="add")
 public String add()
 {
	 return "helloworld.jsp";
 }
}
