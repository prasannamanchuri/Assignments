package com.capgemeni.Generics;

import java.util.Map;
import java.util.TreeMap;

import com.capgemeni.Model.Contact;
import com.capgemeni.Model.Gender;

public class TreeMapAssignment {
	
	public static void main(String a[]) {
		Map<Long,Contact> map=new TreeMap<>() {{
			put(9999999999L,new Contact(9999999999L, "Person1", "Person1Email", Gender.FEMALE));
			put(8888888888L,new Contact(8888888888L, "Person2", "Person2Email", Gender.MALE));
			put(7777777777L,new Contact(7777777777L, "Person3", "Person3Email", Gender.FEMALE));
			put(6666666666L,new Contact(6666666666L, "Person4", "Person4Email", Gender.FEMALE));
		}};
		System.out.println(map.keySet());
		System.out.println(map.values());
		for(Map.Entry<Long, Contact> entry:map.entrySet()) {
			System.out.println("Key->"+entry.getKey()+",value-->"+entry.getValue());
		}
	}

}
