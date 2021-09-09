package com.capgemeni.Model;
import java.util.HashMap;
import java.util.Map;
import java.util.Date;

public class Datehash
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Map<String,String> map=new HashMap<>();
		map.put("Name","pras");
		map.put("Gender","female");
		map.put("City","MPL");
		map.put("State","Andhra");
			
		for (Map.Entry<String,String> entry :map.entrySet())
		{
	       System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}
		Map<String,Date> date=new HashMap<>();
		date.put("date",new java.util.Date());
		System.out.println(date);
	}
		

}
