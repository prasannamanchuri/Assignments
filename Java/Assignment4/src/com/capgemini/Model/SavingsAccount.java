package com.capgemini.Model;

public class SavingsAccount {
	private long id;
	private double balance;
	private double withdraw;
	private double deposit;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getWithdraw() {
		return withdraw;
	}
	public void setWithdraw(double withdraw) {
		this.withdraw = withdraw;
	}
	public double getDeposit() {
		return deposit;
	}
	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}
	public SavingsAccount(long id, double balance, double withdraw, double deposit) {
		super();
		this.id = id;
		this.balance = balance;
		this.withdraw = withdraw;
		this.deposit = deposit;
	}
	@Override
	public String toString() {
		return "SavingsAccount [id=" + id + ", balance=" + balance + ", withdraw=" + withdraw + ", deposit=" + deposit
				+ "]";
	}
	
	

}
