package com.esiea.gestiondepenses.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import com.esiea.gestiondepenses.dao.IAccountHolderDAO;
import com.esiea.gestiondepenses.entity.AccountHolder;

//T =  la classe et donc la classe AccountHolder dans notre cas.
public class AccountHolderDAOImpl extends GenericDAOImpl<AccountHolder> implements IAccountHolderDAO {

	private static final String SELECT_ALL_ACCOUNT_HOLDERS = "Select ach from AccountHolder ach";

	@SuppressWarnings("unchecked")
	@Override
	public List<AccountHolder> getAllAccountHolders() {
		Query query = entityManager.createQuery(SELECT_ALL_ACCOUNT_HOLDERS);
		List<AccountHolder> accountHolderList = new ArrayList<AccountHolder>();
		if (query.getResultList() != null && !query.getResultList().isEmpty()) {
			accountHolderList.addAll((List<AccountHolder>) query.getResultList());
		}
		return accountHolderList;
	}
	
	
}
	

