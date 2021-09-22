package com.capgemini.springmvc.daoImpl;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.capgemini.springmvc.dao.BankAccountDao;
import com.capgemini.springmvc.entity.BankAccount;
import com.capgemini.springmvc.repository.BankAccountRepository;
@Component
public class BankAccountDaoImpl implements BankAccountDao {

	@Autowired
	BankAccountRepository bankAccountRepo;
	
	@Override
	public BankAccount withdraw(String accountId, double withdrawAmount) {
		BankAccount bankAccountValues = bankAccountRepo.findById(accountId);
		if(bankAccountValues!=null) {
			if(bankAccountValues.getAccountBalance()>withdrawAmount) {
				bankAccountValues.setAccountBalance(bankAccountValues.getAccountBalance()-withdrawAmount);
				return bankAccountRepo.save(bankAccountValues);
			}
			else return null;
		}
		else
			return null;
	}

	@Override
	public BankAccount deposit(String accountId, double depositBalance) {
		BankAccount bankDetails = bankAccountRepo.findById(accountId);;
		if(bankDetails!=null) {
			bankDetails.setAccountBalance(depositBalance+bankDetails.getAccountBalance());
			return bankAccountRepo.save(bankDetails);
		}
		else
			return null;
	}

	@Override
	public BankAccount getBalance(String accountId) {
		return bankAccountRepo.findById(accountId);
	}

	@Override
	public boolean fundTransfer(String fromaccountId, String toaccountId, double transferAmount) {
		BankAccount from_bankAccountValues = bankAccountRepo.findById(fromaccountId);
		if(from_bankAccountValues!=null) {
			if(from_bankAccountValues.getAccountBalance()>transferAmount) {
				BankAccount fromBankAccount=withdraw(fromaccountId, transferAmount);
				if(fromBankAccount!=null) {
					BankAccount toBankAccount=deposit(toaccountId, transferAmount);
					if(toBankAccount!=null)
						return true;
					else
						return false;
				} else return false;
			}
			else return false;
		}
		else
			return false;
	}

	@Override
	public BankAccount insertBankDetails(BankAccount bankAccount) {
		return bankAccountRepo.save(bankAccount);
	}

}
