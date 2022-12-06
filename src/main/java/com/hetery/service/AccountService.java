package com.hetery.service;

import java.util.List;

import com.hetery.entity.Account;

public interface AccountService {
	public Account findByUsername(String username);
	public List<Account> getAllAccount();
	public Account createAccount(Account acc);
	public Account updateAccount(Account acc);
	
}
