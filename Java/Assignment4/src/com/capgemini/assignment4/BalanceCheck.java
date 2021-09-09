package com.capgemini.assignment4;

import com.capgemini.Exceptions.IllegalBankTransactionException;
import com.capgemini.Exceptions.Illegalandinsufficient;
import com.capgemini.Model.SavingsAccount;

public class BalanceCheck {
	public static void main(String args[]) {
		SavingsAccount savings = new SavingsAccount(0, 0, -10, 0);
		if (savings.getBalance() >= savings.getWithdraw() && savings.getWithdraw() >= 1)
			System.out.println("you can withdraw");
		else {
			try {
				if (savings.getBalance() == 0 || savings.getWithdraw() > savings.getBalance())
					throw new Illegalandinsufficient("balace should be greater than zero or withdraw lessthan balance");
				if (savings.getWithdraw() < 0)
					throw new IllegalBankTransactionException("minimun one rupee should be withdrawn");
			} catch (Illegalandinsufficient e) {
				e.printStackTrace();
			} catch (IllegalBankTransactionException e1) {
				e1.printStackTrace();
			}
		}
	}
}
