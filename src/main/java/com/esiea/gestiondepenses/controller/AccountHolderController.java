package com.esiea.gestiondepenses.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.esiea.gestiondepenses.entity.AccountHolder;


@Controller
public class AccountHolderController {
	
	@RequestMapping(value = "/accountHolder")
	public ModelAndView createAccountHolder() {
		return new ModelAndView("accountHolder", "accountHolderModel", new AccountHolder());
	}
	
	//Création d'un compte.
	@RequestMapping(value = "/createAccountholder")
	public ModelAndView createAccountHolder(@ModelAttribute("accountHolderModel") AccountHolder accountHolder, 
			BindingResult result) {
		// "accountCreated" = La vue , "accountHolderModel2" = , accountHolder = L'objet.
		return new ModelAndView("accountCreated", "accountHolderModel2", accountHolder);
	}
	
	//Récupération de tous les comptes.
	@RequestMapping(method = RequestMethod.GET)
	public String getAllAccountHolder() {
		return null;
		// GET ALL ACCOUNT HOLDER
	}

}
