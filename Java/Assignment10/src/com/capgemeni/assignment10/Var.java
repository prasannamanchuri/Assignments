package com.capgemeni.assignment10;
/*
 * The var keyword was introduced in Java 10. 
 *Type inference is used in var keyword in which
 * it detects automatically the datatype of a variable 
 * based on the surrounding context. 
 * The below examples explain where var is used and also where you can’t use it.
 */
public class Var {

		  
	    public static void main(String[] args)
	    {
	  
	        // int
	        var x = 100;
	  
	        // double
	        var y = 1.90;
	  
	        // char
	        var z = 'a';
	  
	        // string
	        var p = "tanu";
	  
	        // boolean
	        var q = false;
	  
	        // type inference is used in var keyword in which it
	        // automatically detects the datatype of a variable
	        System.out.println(x);
	        System.out.println(y);
	        System.out.println(z);
	        System.out.println(p);
	        System.out.println(q);
	    }
	}


