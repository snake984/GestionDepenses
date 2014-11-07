package com.esiea.gestiondepenses.dao;

import java.util.List;

import com.esiea.gestiondepenses.entity.AccountHolder;

public interface IAccountHolderDAO extends IGenericDAO<AccountHolder> {
	
	public List<AccountHolder> getAllAccountHolders();
		
	

}
