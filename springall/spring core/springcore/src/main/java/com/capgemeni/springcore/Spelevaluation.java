package com.capgemeni.springcore;
import org.springframework.expression.spel.standard.SpelExpression;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;


public class Spelevaluation
{
private int id;

public  void setId(int id)
{
	this.id = id;
}

public String getMessage()
{
	return("Welcome ID " + id);
}


	public static void main(String[] args) 
	{
		Spelevaluation  ob = new Spelevaluation();
		
		//Passing the object of Employee class to StandardEvaluationContext, which is going to evaluate the expressions in the context of this object.
		StandardEvaluationContext stContext = new StandardEvaluationContext(ob);
		
		//Creating an object of SpelExpressionParser class, used to parse the SpEL expression
		SpelExpressionParser parser = new SpelExpressionParser();
		
		//Calling parseRaw() method of SpelExpressionParser, which parses the expression and returns an SpelEpression object
		SpelExpression expression = parser.parseRaw("id");
		
		//Calling setValue() method sets the value of "id" with the value 1 in the context of object of Employee.
		expression.setValue(stContext,"1");
		
		System.out.println("Message : " + ob.getMessage());
	
	}
}