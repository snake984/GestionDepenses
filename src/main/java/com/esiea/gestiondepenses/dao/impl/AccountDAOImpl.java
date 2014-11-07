package com.esiea.gestiondepenses.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import com.esiea.gestiondepenses.dao.IAccountDAO;
import com.esiea.gestiondepenses.entity.Account;
import com.esiea.gestiondepenses.entity.AccountHolder;

public class AccountDAOImpl extends GenericDAOImpl<Account> implements IAccountDAO {

	private static final String SELECT_ALL_ACCOUNT = "Select ac from Account ac";
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Account> getAllAccount() {
		Query query = entityManager.createQuery(SELECT_ALL_ACCOUNT);
		List<Account> accountList = new ArrayList<Account>();
		if (query.getResultList() != null && !query.getResultList().isEmpty()) {
			accountList.addAll((List<Account>) query.getResultList());
		}
		return accountList;

   }

}