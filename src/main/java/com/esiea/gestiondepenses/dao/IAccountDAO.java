package com.esiea.gestiondepenses.dao;

import java.util.List;

import com.esiea.gestiondepenses.entity.Account;

public interface IAccountDAO extends IGenericDAO<Account> {
	
	List<Account> getAllAccount();

}
