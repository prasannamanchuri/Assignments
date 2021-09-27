package com.capgemeni.Spring;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
	public class BaseController {
		@RequestMapping(value = "validatecard")
		public @ResponseBody String validatecard(@RequestParam("cardNo")String card,@RequestParam("cardType")String cardType)
		{
			//String card=Double.toString(cardNo);
			switch(cardType) {
			case "Master":if(card.matches("^(5[1-5][0-9]{14}|2(22[1-9][0-9]{12}|2[3-9][0-9]{13}|[3-6][0-9]{14}|7[0-1][0-9]{13}|720[0-9]{12}))$"))
					return "valid";
			else return "In valid Master card";
			case "Visa":if(card.matches("^4[0-9]{12}(?:[0-9]{3})?$"))
				return "valid";
				else
					return "Invalid";
			case "Discover":if(card.matches("^65[4-9][0-9]{13}|64[4-9][0-9]{13}|6011[0-9]{12}|(622(?:12[6-9]|1[3-9][0-9]|[2-8][0-9][0-9]|9[01][0-9]|92[0-5])[0-9]{10})$"))
				return "valid";
			else
				return "Invalid";
						
			case "default":return "Invalid";				
			}
			return "Invalid";
		}


	
}
