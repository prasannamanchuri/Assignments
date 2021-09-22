package com.capgemini.springmvc.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.capgemini.springmvc.daoImpl.BankAccountDaoImpl;
import com.capgemini.springmvc.entity.BankAccount;
import com.capgemini.springmvc.service.BankAccountService;

@Component
public class BankAccountServiceImpl implements BankAccountService {

	@Autowired
	BankAccountDaoImpl bankAccountDaoImpl;
	
	@Override
	public double withdraw(String accountId, double withdrawAmount) {
		BankAccount bankAccountDetails=bankAccountDaoImpl.withdraw(accountId,withdrawAmount);
		if(bankAccountDetails!=null) {
			return bankAccountDetails.getAccountBalance();
		}
		return 0.0;
	}

	@Override
	public double deposit(String accountId, double depositBalance) {
		BankAccount bankAccountDetails=bankAccountDaoImpl.deposit(accountId,depositBalance);
		if(bankAccountDetails!=null) {
			return bankAccountDetails.getAccountBalance();
		}
		return 0.0;
	}

	@Override
	public double getBalance(String accountId) {
		BankAccount bankAccountDetails=bankAccountDaoImpl.getBalance(accountId);
		if(bankAccountDetails!=null) {
			return bankAccountDetails.getAccountBalance();
		}
		return 0.0;
	}

	@Override
	public boolean fundTransfer(String fromaccountId, String toaccountId, double amount) {
		return bankAccountDaoImpl.fundTransfer(fromaccountId, toaccountId, amount);
	}

	@Override
	public String insertBankDetails(BankAccount bnkAccount) {
		BankAccount bankAccount=bankAccountDaoImpl.insertBankDetails(bnkAccount);
		if(bankAccount!=null)
			return "Inserted Successfully";
		else
			return "Failed Inserting";
	}

}
