package com.capgemeni.Generics;

import java.util.TreeSet;

import com.capgemeni.Model.Product;

public class ProductTreeSetAssignment {

	public static void main(String[] args) {
		TreeSet<Product> set=new TreeSet<Product>();
		set.add(new Product(1, "P1"));
		set.add(new Product(2, "P2"));
		set.add(new Product(3, "P3"));
		set.add(new Product(1, "P1"));
		System.out.println(set);
	}

}
