package com.capgemeni.assignment8;

import java.util.HashMap;
import java.util.Map;

public class HashMapAssignment {

	public static void main(String[] args) {
		HashMap<String,String> map=new HashMap<String,String>() {{
			put("A","B");
			put("A1","B1");
			put("A2","B2");
			put("A3","B3");
		}};
		StringBuilder mapAsString=new StringBuilder();
		for(Map.Entry<String, String> entry:map.entrySet()) {
			if(mapAsString.isEmpty())
				mapAsString.append(entry.getKey()+"->"+entry.getValue());
			else
				mapAsString.append(","+entry.getKey()+"->"+entry.getValue());
		}
		System.out.println(mapAsString);
	}

}
