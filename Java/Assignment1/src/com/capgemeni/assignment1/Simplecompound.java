package com.capgemeni.assignment1;
import java.util.Scanner;
public class Simplecompound 
{
	  public static void main(String[] args) 
	  {
	     Scanner input = new Scanner(System.in);
	     System.out.print("Enter the principal: ");
	     double principal = input.nextDouble();
         System.out.print("Enter the rate: ");
	     double rate = input.nextDouble();
	     System.out.print("Enter the time: ");
	     double time = input.nextDouble();
	     System.out.print("Enter number of times interest is compounded: ");
	     int number = input.nextInt();
         double simple=intrest(principal,rate,time);
	     double compound=cintrest(principal,rate,time,number);


	  }
	  public static double intrest(double a,double b,double c)
	  {
		  double si = (a*b*c)/100;
		     System.out.println("Simple Interest: " +si);
		     return si;
	  }
	  public static double cintrest(double a,double b,double c,double d)
	  {
		  double ci=a * (Math.pow((1 + b/100), (c * d))) - a;
		     System.out.println("compound Interest: " +ci);
		     return ci;
	  }
	  
	}


