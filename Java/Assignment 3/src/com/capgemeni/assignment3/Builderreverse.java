package com.capgemeni.assignment3;
public class Builderreverse
{

	public static void main(String args[])
	{
		StringBuffer sbf = new StringBuffer("have a great day!");
		System.out.println("String buffer = " + sbf);
		sbf.reverse();
		System.out.println("String buffer after reversing = " + sbf);
	}
}
