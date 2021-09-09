package com.capgemeni.assignment10;
// Java program to demonstrate that
// var cannot be used as a Generic
// type

import java.util.*;
class Var4 {
	public static void main(String[] args)
	{
		// Generic list using var
		var<var> al = new ArrayList<>();
			
		// add elements
		al.add(10);
		al.add(20);
		al.add(30);
		
		// print the list
		System.out.println(al);
	}
}
