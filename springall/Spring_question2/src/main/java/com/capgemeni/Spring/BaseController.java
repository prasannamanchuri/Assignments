package com.capgemeni.Spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BaseController {
	@RequestMapping(value = "calculate")
	public @ResponseBody String add(@RequestParam("principal") String principal,
			@RequestParam("timeperiod") String timeperiod, @RequestParam("roi") String roi) {

		return Integer.toString(Integer.parseInt(principal) * Integer.parseInt(timeperiod) * Integer.parseInt(roi));
	}
}
