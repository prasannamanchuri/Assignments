package com.capgemeni.assignment8;

import java.util.*;
import java.util.stream.Collectors;

import com.capgemeni.Model.Order;

public class OrderAssignment {

	public static void main(String[] args) {
		List<Order> list=new ArrayList<Order>();
		list.add(new Order(10, "ACCEPTED"));
		list.add(new Order(20000, "COMPLETED"));
		list.add(new Order(40, "COMPLETED"));
		list.add(new Order(50, "CLOSE"));
		System.out.println(list.stream().filter(e->e.getPrice()>10000).collect(Collectors.toList()));
		System.out.println(list.stream().filter(e->e.getStatus().equalsIgnoreCase("ACCEPTED")||e.getStatus().equalsIgnoreCase("COMPLETED")).collect(Collectors.toList()));
	}
}
