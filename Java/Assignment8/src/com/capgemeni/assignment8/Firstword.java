package com.capgemeni.assignment8;

public class Firstword {
	 
    public static void main(String[] args) {
    	System.out.println("consumer---------------");
    	StringBuilder sb=new StringBuilder();
    	Consumer<String> consumer = (String name)->sb.append(name.charAt(0));
        consumer.accept("C++");
        consumer.accept("Java");
        consumer.accept("Python");
        consumer.accept("Ruby On Rails");
        System.out.println(sb.toString());
    }
 
    private static void consumerPrintNames(String name) {       
        System.out.println(name);
    }
}