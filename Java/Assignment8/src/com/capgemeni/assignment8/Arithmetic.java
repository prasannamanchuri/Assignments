package com.capgemeni.assignment8;

@FunctionalInterface
interface Arithmeticoperations {

	int operation(int n1, int n2);

}

public class Arithmetic {

	public static void main(String[] args) {

		// Lambda expression for addition
		Arithmeticoperations addition = (int n1, int n2) -> n1 + n2;

		// Lambda expression for subtract
		Arithmeticoperations subtraction = (int n1, int n2) -> n1 - n2;

		// Lambda expression for multiply
		Arithmeticoperations multiplication = (int n1, int n2) -> n1 * n2;

		// Lambda expression for division
		Arithmeticoperations division = (int n1, int n2) -> n1 / n2;

		// Lambda expression for division
		Arithmeticoperations modulo = (int n1, int n2) -> n1 % n2;

		System.out.println("Addition of 10 and 5: " + addition.operation(10, 5));

		System.out.println("Subtraction of 10 and 5: " + subtraction.operation(10, 5));

		System.out.println("Multiplication of 10 and 5: " + multiplication.operation(10, 5));

		System.out.println("Division of 10 and 5: " + division.operation(10, 5));

		System.out.println("Modulo of 10 and 5: " + modulo.operation(10, 5));

	}

}
