package com.esiea.gestiondepenses.service;

import java.util.List;

import com.esiea.gestiondepenses.entity.AccountHolder;

public interface IAccountHolderService {
    
	public void createAccountHolder(AccountHolder accountHolder);
	public List<AccountHolder> getAllAccountHolder();
	
}
