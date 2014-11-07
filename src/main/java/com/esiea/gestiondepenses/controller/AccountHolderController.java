package com.esiea.gestiondepenses.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.esiea.gestiondepenses.entity.AccountHolder;
import com.esiea.gestiondepenses.service.IAccountHolderService;
	

@Controller
public class AccountHolderController {

	IAccountHolderService accountHolderService;
	
	@RequestMapping(value = "/createAccountHolder", 
			method=RequestMethod.GET)
	public ModelAndView createAccountHolder() {
		return new ModelAndView("createAccountHolder", "accountHolderModel", new AccountHolder());
	}
	
	//Création d'un compte.
	@RequestMapping(value = "/createAccountHolder", 
			method=RequestMethod.POST)
	public ModelAndView createAccountHolder(@ModelAttribute("accountHolderModel") @Valid AccountHolder accountHolder, 
			BindingResult result) {
		//System.out.println("Adress :" + accountHolder.getAccountHolderAdress());
		//BindingResult contient les erreurs, on lui donne au préalable @Valid.
		
		if (result.hasErrors()) {
			      return new ModelAndView("createAccountHolder");
		} else {
			accountHolderService.createAccountHolder(accountHolder);
			// "accountCreated" = La vue , "accountHolderModel2" = , accountHolder = L'objet.
			return new ModelAndView("accountHolderCreated", "accountHolderModel", accountHolder);
		}
		
	}
	
	//Récupération de tous les comptes.
	@RequestMapping(value = "/accountHolders", 
	method=RequestMethod.GET)
	public ModelAndView getAllAccountHolder() {
		List<AccountHolder> accountHolderList = accountHolderService.getAllAccountHolder();
		return new ModelAndView("accountHolder", "accountHolders", accountHolderList);
	}
	
	public void setAccountHolderService(IAccountHolderService ahc) {
		this.accountHolderService = ahc;
	}

}
