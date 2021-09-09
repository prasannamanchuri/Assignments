package com.capgemeni.assignment8;

import java.util.ArrayList;
import java.util.List;

public class ThreadAssignment {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>() {{
			add(10);
			add(20);
			add(30);
			add(40);
		}};
		Thread t1=new Thread(()->{
			for(int i:list) {
				System.out.println(i);
			}
		});
		t1.start();
	}
}
