package com.esiea.gestiondepenses.entity;

import java.util.Calendar;

public class Profile {
	
	String fName, lName, email, phoneNbr;
	Calendar dateOfBirth;
	Account account;
	
	public Profile() {
	}
	
	public Profile(String fName, String lName, String email, String phoneNbr,
			Calendar dateOfBirth, Account account) {
		this.account=account;
		this.dateOfBirth=dateOfBirth;
		this.email=email;
		this.fName=fName;
		this.lName=lName;
		this.phoneNbr=phoneNbr;
	}
	
	public String getfName() {
		String name = new String(fName);
		return name;
	}
	
	public void setfName(String fName) {
		this.fName = fName;
	}
	
	public String getlName() {
		String name = new String(lName);
		return name;
	}
	
	public void setlName(String lName) {
		this.lName = lName;
	}
	
	public String getEmail() {
		String email = new String(this.email);
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPhoneNbr() {
		String phoneNbr = new String(this.phoneNbr);
		return phoneNbr;
	}
	
	public void setPhoneNbr(String phoneNbr) {
		this.phoneNbr = phoneNbr;
	}
	
	public Calendar getDateOfBirth(){
		return dateOfBirth;
	}
	
	public void setDateOfBirth(Calendar dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public Account getAccount() {
		Account account = new Account(this.account);
		return account;
	}

}
