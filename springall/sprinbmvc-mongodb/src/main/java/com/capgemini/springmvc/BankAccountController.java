package com.capgemini.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.springmvc.entity.BankAccount;
import com.capgemini.springmvc.serviceImpl.BankAccountServiceImpl;

@RestController
public class BankAccountController {
	
	@Autowired
	BankAccountServiceImpl bankAccountService;
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public @ResponseBody String check() {
		return "BankAccount Application started";
	}
	
	@RequestMapping(value="/withdraw",method=RequestMethod.POST)
	public @ResponseBody double withdraw(@RequestParam("accountId") String accountId, @RequestParam("accountBalance") String accountBalance) {
		return bankAccountService.withdraw(accountId, Double.parseDouble(accountBalance));
	}

	@RequestMapping(value="/deposit",method=RequestMethod.POST)
	public @ResponseBody double deposit(@RequestParam("accountId") String accountId, @RequestParam("accountBalance") String accountBalance) {
		return bankAccountService.deposit(accountId, Double.parseDouble(accountBalance));
	}

	@RequestMapping(value="/getBalance",method=RequestMethod.POST)
	public @ResponseBody double getBalance(@RequestParam("accountId") String accountId) {
		return bankAccountService.getBalance(accountId);
	}

	@RequestMapping(value="/fundTransfer",method=RequestMethod.POST)
	public @ResponseBody boolean fundTransfer(@RequestParam("fromaccountId") String fromaccountId, @RequestParam("toaccountId") String toaccountId,@RequestParam("amount") String amount) {
		return bankAccountService.fundTransfer(fromaccountId, toaccountId,Double.parseDouble(amount));
	}
	
	@RequestMapping(value="/insertBankDetails",method=RequestMethod.POST)
	public @ResponseBody String insertBankDetails(@RequestBody BankAccount bean) {
		return bankAccountService.insertBankDetails(bean);
	}
}
