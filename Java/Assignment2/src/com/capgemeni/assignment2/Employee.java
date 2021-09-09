package com.capgemeni.assignment2;
import java.util.Scanner;

 class Employee {
	double basic;
	double totalsalary;

      void calculate()
	{
		totalsalary=basic;
		System.out.println("manager salary is:"+totalsalary);
	}
      public static void main(String[] args) {
  		// TODO Auto-generated method stub
  				
  		Employee e;
  		e=new Manager();
  		e.calculate();
  		e=new Labour();
  		e.calculate();
  	

  	}

}
class Labour extends Employee {
	void calculate()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter basic");
		double basic=sc.nextFloat();
		System.out.println("enter over time");
		 double overtime=sc.nextFloat();
		totalsalary=basic+overtime;
		System.out.println("manager salary is:"+totalsalary);
	}

}
class Manager extends Employee {
	void calculate()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter basic");
		double basic=sc.nextFloat();
		System.out.println("enter Incentives");
		 double intensive=sc.nextFloat();
		totalsalary=basic+intensive;
		System.out.println("manager salary is:"+totalsalary);
	}

}

