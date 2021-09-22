package com.capgemeni.springcore;
import org.springframework.expression.spel.standard.SpelExpression;
import org.springframework.expression.spel.standard.SpelExpressionParser;


public class spel 
{
int id;
	public static void main(String[] args) 
	{
		SpelExpressionParser parser = new SpelExpressionParser();
		SpelExpression expression = parser.parseRaw("12*4");
		System.out.println("Value of first expression : " + expression.getValue());
		
		
		expression = parser.parseRaw("100<40");
		System.out.println("Value of second expression : " + expression.getValue());
		
		
		expression = parser.parseRaw("'Hello' matches 'he'");
		System.out.println("Value of third expression : " + expression.getValue());
		
		expression = parser.parseRaw("'BlueSky'");
		System.out.println("Value of fourth expression : " + expression.getValue());
		
		expression = parser.parseRaw("1000");
		System.out.println("Value of fifth expression : " + expression.getValue());
				
		
		expression = parser.parseRaw("19.999");
		System.out.println("Value of sixth expression : " + expression.getValue());
		
		
		expression = parser.parseRaw("99.9f");
		System.out.println("Value of sixth expression : " + expression.getValue());
		
		expression = parser.parseRaw("'Welcome' matches 'Wel.*'");
		System.out.println("Value of seventh expression : " + expression.getValue());
		
	
	}
}