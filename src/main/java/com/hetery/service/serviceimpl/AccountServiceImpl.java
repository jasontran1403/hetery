package com.hetery.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hetery.dao.AccountDAO;
import com.hetery.entity.Account;
import com.hetery.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService{
	@Autowired
    AccountDAO accDAO;

	@Override
	public Account findByUsername(String username) {
		// TODO Auto-generated method stub
		return accDAO.getById(username);
	}

	@Override
	public List<Account> getAllAccount() {
		// TODO Auto-generated method stub
		return accDAO.findAll();
	}

	@Override
	public Account createAccount(Account acc) {
		// TODO Auto-generated method stub
		return accDAO.save(acc);
	}

	@Override
	public Account updateAccount(Account acc) {
		// TODO Auto-generated method stub
		return accDAO.save(acc);
	}

}
