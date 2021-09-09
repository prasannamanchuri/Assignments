package com.capgemini.assignment4;

import java.util.*;

public class unSupportedExceptions {
	public static void main(String[] args) {
		div();
		sort();
	}

	public static void div() {
		try {
			int a = 2,b = 0,rem;
			rem = a / b;
			System.out.println(rem);
		} catch (ArithmeticException ae) {
			System.out.println(ae.getMessage());
		}

	}

	public static void sort() {
		String str[] = { "apple", "mango" };
		List<String> l = Arrays.asList(str);
		try {
			l.add("banana");
		} catch (UnsupportedOperationException ue) {
			System.out.println(ue.toString());
		}
	}

}
