package com.capgemini.springmvc.dao;

import java.util.List;

import com.capgemini.springmvc.entity.BankAccount;

public interface BankAccountDao {
	
	public BankAccount withdraw(String accountId,double balance);
	public BankAccount deposit(String accountId,double balance);
	public BankAccount getBalance(String accountId);
	public boolean fundTransfer(String fromaccountId,String toaccountId,double amount);
	BankAccount insertBankDetails(BankAccount bankAccount);

}
