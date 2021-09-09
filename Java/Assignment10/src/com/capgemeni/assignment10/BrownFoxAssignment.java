package com.capgemeni.assignment10;

import java.util.Arrays;
import java.util.List;

public class BrownFoxAssignment {

	public static void main(String[] args) {
		String s="A quick brown fox jumps over the lazy dog";
		List<String> list=Arrays.asList(s.split(" "));
		String[] result=list.toArray(String[]::new);
		for(String s1:result)
			System.out.println(s1);
	}

}
