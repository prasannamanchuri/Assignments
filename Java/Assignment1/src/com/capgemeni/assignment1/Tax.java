package com.capgemeni.assignment1;
import java.util.*;
public class Tax {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println("Enter ctc");
		Scanner sc=new Scanner(System.in);
		double s1=sc.nextDouble();
		double taxamount=tax(s1);
		

	}
	public static double tax(double s) 
	{
		double tax=0;
		if(s>0&&s<180000)
		{
			System.out.println("nil");
		}
		else if(s>181001&&s<300000)
		{
			tax=(s*10)/100;
			System.out.println("tax:"+tax);
			
		}
		else if(s>300001&&s<500000)
		{
			tax=(s*20)/100;
			System.out.println("tax:"+tax);
			
		}
		else
		{
			tax=(s*30)/100;
			System.out.println("tax:"+tax);
			
		}
		return tax;
	}

}
