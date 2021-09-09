package com.capgemeni.Model;
import java.util.*;
public class HashmapAssignment {

	public static void main(String[] args) {
		Map<Integer,Double> map=new HashMap<>();
		map.put(1, 10.5);
		map.put(2, 1.65);
		map.put(3, 1.57);
		map.put(4, 1.56);
		map.put(5, 1.55);
		map.put(6, 1.45);
		map.put(7, 13.5);
		map.put(8, 12.5);
		map.put(9, 11.5);
		map.put(10, 20.5);	
		for (Map.Entry<Integer,Double> entry : map.entrySet())
		{
	       System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}
		
	
		  

	}

}
