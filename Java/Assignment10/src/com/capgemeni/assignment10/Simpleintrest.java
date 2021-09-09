package com.capgemeni.assignment10;
// Java program to demonstrate lambda expressions to implement

// a user defined functional interface.

@FunctionalInterface
interface Intrest {
	int calculate(int x, int y, int z);
}

class Simpleintrest {
	public static void main(String args[]) {
		int x = 5000;
		int y = 5;
		int z = 2;

		// lambda expression to define the calculate method
		Intrest i = (p, t, r) -> (p * t * r) / 100;

		// parameter passed and return type must be
		// same as defined in the prototype
		int ans = i.calculate(x, y, z);
		System.out.println(ans);
	}
}
