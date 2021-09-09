package com.capgemeni.assignment2;
import java.util.Scanner;
public class AccountDetails{
	public static void main(String[] args) {
		Account a=new Account(10d);
		a=new Savings(a.balance, 20d);
		a=new Current(a.balance, 30d);
		System.out.println(a.balance);
	}
}
class Account {
	double balance;
	
	public Account(double balance) {
		super();
		this.balance = balance;
	}
}
class Current extends Account {
	double cashcredit;
	
	public Current(double balance, double cashcredit) {
		super(balance+cashcredit);
		this.cashcredit = cashcredit;
	}

}
class Savings extends Account {
	double fixedDeposit;

	public Savings(double balance, double fixedDeposit) {
		super(balance+fixedDeposit);
		this.fixedDeposit = fixedDeposit;
	}
	
}


