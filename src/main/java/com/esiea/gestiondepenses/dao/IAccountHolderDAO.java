package com.esiea.gestiondepenses.dao;

import com.esiea.gestiondepenses.entity.AccountHolder;

public interface IAccountHolderDAO extends IGenericDAO<AccountHolder> {
	
	public AccountHolder createAccountHolderModel(AccountHolder accountHolder);

}
