package com.esiea.gestiondepenses.service.impl;

import java.util.List;

import com.esiea.gestiondepenses.dao.IAccountHolderDAO;
import com.esiea.gestiondepenses.entity.AccountHolder;
import com.esiea.gestiondepenses.service.IAccountHolderService;

public class AccountHolderServiceImpl implements IAccountHolderService {
	
	IAccountHolderDAO accountHolderDao;

	@Override
	public void createAccountHolder(AccountHolder accountHolder) {
		accountHolderDao.createAccountHolderModel(accountHolder);	
	}

	@Override
	public List<AccountHolder> getAllAccountHolder() {
		// TODO Auto-generated method stub
		return null;
	}
	
	//Le set permet d'affecter ahd crée par Spring au préalable à la variable de classe accountHolderDao.
	public void setAccountHolderDao(IAccountHolderDAO ahd) {
		this.accountHolderDao = ahd;
	}

}
