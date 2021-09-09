package com.capgemeni.assignment8;

import java.util.ArrayList;
import java.util.function.UnaryOperator;

class Op implements UnaryOperator<String> {
	public String apply(String str) {
		return str.toUpperCase();
	}
}

public class ReplaceAssignment {
	public static void main(String[] args) throws CloneNotSupportedException {
		ArrayList<String> list = new ArrayList<>();
		list.add("java");
		list.add("javaScript");
		list.add("coffeeScript");
		list.add("HBase");
		list.add("OpenNLP");
		System.out.println("Contents of the list: " + list);
		list.replaceAll(new Op());
		System.out.println("Contents of the list after replace operation: \n" + list);
	}
}
