package com.esiea.gestiondepenses.dao.impl;

import com.esiea.gestiondepenses.dao.IAccountHolderDAO;
import com.esiea.gestiondepenses.entity.AccountHolder;

//T =  la classe et donc la classe AccountHolder dans notre cas.
public class AccountHolderDAOImpl extends GenericDAOImpl<AccountHolder> implements IAccountHolderDAO {

	@Override
	//persister l'objet = insérer l'obj en BDD.
	public AccountHolder createAccountHolderModel(AccountHolder accountHolder) {
		return create(accountHolder);
	}

}
