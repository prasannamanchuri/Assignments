package com.capgemini.springmvc.service;

import java.util.List;

import com.capgemini.springmvc.entity.BankAccount;

public interface BankAccountService {
	public double withdraw(String accountId,double balance);
	public double deposit(String accountId,double balance);
	public double getBalance(String accountId);
	public boolean fundTransfer(String fromaccountId,String toaccountId,double amount);
	String insertBankDetails(BankAccount bnkAccount);
}
