package com.capgemeni.assignment10;
// Java program to demonstrate that
// var cannot be used with Lambda
// Expression

import java.util.*;

interface myInt {
	
	int add(int a, int b);
}
class Var7 {
	public static void main(String[] args)
	{
		
		// var cannot be used since they
		// require explicit target type
		var obj = (a, b) -> (a + b);

		// calling add method
		System.out.println(obj.add(2, 3));
	}
}
