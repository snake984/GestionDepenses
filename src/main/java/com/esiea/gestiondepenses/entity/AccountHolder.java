package com.esiea.gestiondepenses.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * @author Mourad
 *
 */
@Entity
@Table(name="ACCOUNT_HOLDER")
public class AccountHolder {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ACCOUNT_HOLDER_ID", nullable = false)
    private int accountHolderId;
	
	@Column(name="ACCOUNT_HOLDER_USERNAME", nullable = false)
	private String accountHolderUsername;
	
	@Column(name="ACCOUNT_HOLDER_LASTNAME", nullable = false)
	private String accountHolderLastname;
	
	@Column(name="ACCOUNT_HOLDER_ADRESS")
	private String accountHolderAdress;
	
	@Column(name="ACCOUNT_HOLDER_CITY")
	private String accountHolderCity;
	
	@Column(name="ACCOUNT_HOLDER_ZIPCODE")
	private int accountHolderZipCode;
	
	public int getAccountHolderId() {
		return accountHolderId;
	}

	public void setAccountHolderId(int accountHolderId) {
		this.accountHolderId = accountHolderId;
	}

	public String getAccountHolderUsername() {
		return accountHolderUsername;
	}

	public void setAccountHolderUsername(String accountHolderUsername) {
		this.accountHolderUsername = accountHolderUsername;
	}

	public String getAccountHolderLastname() {
		return accountHolderLastname;
	}

	public void setAccountHolderLastname(String accountHolderLastname) {
		this.accountHolderLastname = accountHolderLastname;
	}

	public String getAccountHolderAdress() {
		return accountHolderAdress;
	}

	public void setAccountHolderAdress(String accountHolderAdress) {
		this.accountHolderAdress = accountHolderAdress;
	}

	public String getAccountHolderCity() {
		return accountHolderCity;
	}

	public void setAccountHolderCity(String accountHolderCity) {
		this.accountHolderCity = accountHolderCity;
	}

	public int getAccountHolderZipCode() {
		return accountHolderZipCode;
	}

	public void setAccountHolderZipCode(int accountHolderZipCode) {
		this.accountHolderZipCode = accountHolderZipCode;
	}

		
}
