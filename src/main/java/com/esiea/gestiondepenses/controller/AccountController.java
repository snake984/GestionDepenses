package com.esiea.gestiondepenses.controller;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.esiea.gestiondepenses.entity.Account;
import com.esiea.gestiondepenses.entity.AccountHolder;
import com.esiea.gestiondepenses.service.IAccountHolderService;
import com.esiea.gestiondepenses.service.IAccountService;

@Controller
public class AccountController {

	IAccountHolderService accountHolderService;
	
	IAccountService accountService;

	@RequestMapping(value = "/accountHolder/{ahid}/createAccount", method = RequestMethod.GET)
	public ModelAndView createAccount() {
        return new ModelAndView("createAccount", "accountModel", new Account());
	}
	
	@RequestMapping(value = "/accountHolder/{ahid}/createAccount", method = RequestMethod.POST)
	public ModelAndView createAccount(@PathVariable("ahid") int accountHolderId, @ModelAttribute("accountModel") @Valid Account account, 
			BindingResult result) {
		if (result.hasErrors()) {
			return new ModelAndView("createAccount");
		} else {
			AccountHolder accountHolder = accountHolderService.getAccountHolderById(accountHolderId);
	        account.setAccountHolder(accountHolder);
	        account.setAccountCreationDate(new Date());
	        accountService.createAccount(account);
			return new ModelAndView("accountCreated", "accountModel", account);
		}
	}
	
	//Récupération de tous les comptes.
	@RequestMapping(value = "/budget", 
	method=RequestMethod.GET)
		public ModelAndView createAccountBud() {
			List<Account> accountList = accountService.getAllAccount();
			ModelAndView model = new ModelAndView("budget");
			model.addObject("Account", accountList);
			return model;
		}
	
	public void setAccountHolderService(IAccountHolderService ahs) {
		this.accountHolderService = ahs;
	}
	
	public void setAccountService(IAccountService as) {
		this.accountService = as;
	}
}
