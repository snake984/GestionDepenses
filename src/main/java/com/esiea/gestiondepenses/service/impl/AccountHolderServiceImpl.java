package com.esiea.gestiondepenses.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.esiea.gestiondepenses.dao.IAccountHolderDAO;
import com.esiea.gestiondepenses.entity.AccountHolder;
import com.esiea.gestiondepenses.service.IAccountHolderService;

@Transactional
public class AccountHolderServiceImpl implements IAccountHolderService {
	
	IAccountHolderDAO accountHolderDao;

	@Override
	public void createAccountHolder(AccountHolder accountHolder) {
		accountHolderDao.create(accountHolder);	
	}

	@Override
	public List<AccountHolder> getAllAccountHolder() {
		return accountHolderDao.getAllAccountHolders();
	}
	
	//Le set permet d'affecter ahd crée par Spring au préalable à la variable de classe accountHolderDao.
	public void setAccountHolderDao(IAccountHolderDAO ahd) {
		this.accountHolderDao = ahd;
	}

	@Override
	public AccountHolder getAccountHolderById(int id) {
		return accountHolderDao.find(id);
	}

}
