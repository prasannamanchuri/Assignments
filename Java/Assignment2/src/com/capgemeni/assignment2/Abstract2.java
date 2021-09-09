package com.capgemeni.assignment2;
import java.util.Scanner;

public class Abstract2 extends Abstract 
{
	public void details()
	{
		System.out.println("provide address");
		Scanner sc=new Scanner(System.in);
		String b1=sc.next();
		System.out.println("your address is:"+b1);
	}
	public static void main(String args[])
	   {
		Abstract a ;
		a= new Abstract1();
		a.display();
		a.details();
	    a = new Abstract2();
		a.details();
			   
		}
}
