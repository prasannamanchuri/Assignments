package com.capgemeni.assignment10;
// Java program to convert String to ArrayList

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stringlist {

	public static void main(String[] args)
	{

		String str = "Geeks";

		// split string by no space
		String[] strSplit = str.split("");

		// Now convert string into ArrayList
		ArrayList<String> strList = new ArrayList<String>(
			Arrays.asList(strSplit));

		// Now print the ArrayList
		System.out.println("arraylist");
		for (String s : strList)
			System.out.println(s);
		List<ArrayList<String>> target = Arrays.asList(strList);
		System.out.println("list");
		target.forEach(i->System.out.println(i));
	}
}
