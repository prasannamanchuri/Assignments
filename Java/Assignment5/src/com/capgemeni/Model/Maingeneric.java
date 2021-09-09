package com.capgemeni.Model;

public class Maingeneric {

	public static void main(String[] args) {
		// instance of Integer type
		Generic<Integer> iObj = new Generic<Integer>(15);
		System.out.println(iObj.getObject());

		// instance of String type
		Generic<String> sObj = new Generic<String>("GeeksForGeeks");
		System.out.println(sObj.getObject());

	}

}
