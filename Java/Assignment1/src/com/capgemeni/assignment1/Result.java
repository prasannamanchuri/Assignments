package com.capgemeni.assignment1;
import java.util.*;
public class Result {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int a[]=new int[3];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter marks of student:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int d=find(a);
		System.out.println(d);
		
		
	}
	public static int find(int a[])
	{
		int count=0;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]>60)
		{
			count=count+1;
		}
	}
	if(count==3)
	{
		System.out.println("passed");
	}
	else if(count==2)
	{
		System.out.println("promoted");
	}
	else
	{
		System.out.println("failed");
	}
	
	return count;
	}
	
	
	

}
