package com.capgemini.springmvc.repository;

import org.bson.types.ObjectId;
import org.springframework.data.repository.CrudRepository;

import com.capgemini.springmvc.entity.BankAccount;

public interface BankAccountRepository extends CrudRepository<BankAccount, ObjectId>
{
	BankAccount findById(String id);
}
