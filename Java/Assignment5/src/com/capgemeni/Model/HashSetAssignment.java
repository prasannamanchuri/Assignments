package com.capgemeni.Model;
import java.util.*;

import com.capgemini.assignment5.Employee;
public class HashSetAssignment {
	public static void main(String a[]) {
		HashSet<Employee> hSet=new HashSet<>() {{
			add(new Employee(1, "Empl1", 10000, "Dept1"));
			add(new Employee(2, "Empl2", 20000, "Dept2"));
			add(new Employee(3, "Empl3", 30000, "Dept1"));
		}};
		System.out.println(hSet);
	}

}
