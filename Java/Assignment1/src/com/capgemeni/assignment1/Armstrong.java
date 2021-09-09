package com.capgemeni.assignment1;
import java.util.*;
import java.lang.*;
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int arm=find(A);
		if(arm==A)
		System.out.println("armstrong");
		else
			System.out.println(" Not an armstrong");
			

	}
	static int find(int num)
	{
		int x,a=0;
		while(num!=0)
		{
			x=num%10;
			a=a+(x*x*x);
			num/=10 ;
		}
		return a;
	}

}
