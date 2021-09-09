package com.capgemeni.assignment3;

public class Stroperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s1="Java String pool refers to collection of Strings which are stored in heap memory";
        String s="java string pool refers to collection of Strings which are stored in heap memory";
        String s2=s1.toLowerCase();
        System.out.println(s2);
        String s3=s1.toUpperCase();
        System.out.println(s3);
        String s4=s1.replace('a','$');
        System.out.println(s4);
        boolean b=s1.contains(s1);
        System.out.println(b);
        boolean b1=s1.equals(s);
        System.out.println(b1);
        boolean b2=s1.equalsIgnoreCase(s);
        System.out.println(b2);
        
        
	}
}
