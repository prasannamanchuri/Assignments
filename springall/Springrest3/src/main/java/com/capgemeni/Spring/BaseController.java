package com.capgemeni.Spring;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BaseController {
	@RequestMapping(value = "getUserDetails/{zipcode}",method=RequestMethod.POST,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody Map<String,String> getUserDetails(@PathVariable("zipcode") String zipcode) {
		Map<String,Map<String,String>> map=new HashMap<>();
		Map<String,String> inputs=new HashMap<>();
		inputs.put("State", "AK");
		inputs.put("City", "ANCHORAGE");
		inputs.put("Country", "US");
		map.put("99501", inputs);
		Map<String,String> inputs1=new HashMap<>();
		inputs.put("State", "AK1");
		inputs.put("City", "ANCHORAGE1");
		inputs.put("Country", "US1");
		map.put("99502", inputs1);
		
		if(map.containsKey(zipcode))
			return map.get(zipcode);
		else
			return null;
	}

	
}
