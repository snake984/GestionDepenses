package com.esiea.gestiondepenses.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.esiea.gestiondepenses.dao.IAccountDAO;
import com.esiea.gestiondepenses.entity.Account;
import com.esiea.gestiondepenses.service.IAccountService;

@Transactional
public class AccountServiceImpl implements IAccountService {
	
	IAccountDAO accountDao;
	
	@Override
	public Account createAccount(Account account) {
		return accountDao.create(account);
	}
	
	public void setAccountDao(IAccountDAO ad) {
		this.accountDao = ad;
	}

	@Override
	public List<Account> getAllAccount() {
		return accountDao.getAllAccount();
	}

}
