package com.esiea.gestiondepenses.service;

import java.util.List;
import com.esiea.gestiondepenses.entity.Account;

public interface IAccountService {

	public Account createAccount(Account account);

	public List<Account> getAllAccount();
}
