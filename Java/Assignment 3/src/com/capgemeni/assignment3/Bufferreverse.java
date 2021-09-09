package com.capgemeni.assignment3;
import java.lang.*;

public class Bufferreverse
{

	public static void main(String args[])
	{
		StringBuffer sbf = new StringBuffer("Geeksforgeeks!");
		System.out.println("String buffer = " + sbf);
		sbf.reverse();
		System.out.println("String buffer after reversing = " + sbf);
	}
}
