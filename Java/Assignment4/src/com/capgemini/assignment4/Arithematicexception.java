package com.capgemini.assignment4;
import java.util.*;
public class Arithematicexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5,b=0,rem;
		try
		{
			rem=a/b;
			System.out.println(rem);
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae.getMessage());
		}
		catch(UnsupportedOperationException ue)
		{
			System.out.println(ue.getMessage());
		}
		
		

	}

}
