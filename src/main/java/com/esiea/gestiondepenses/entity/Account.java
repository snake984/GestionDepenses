package com.esiea.gestiondepenses.entity;

import java.util.Date;

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
@Table(name="ACCOUNT") //Nom de la table dans la base de données.

public class Account {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ACC_ID", nullable = false) // Première colonne dans la BDD.
	private int accountId;
	
	@Column(name="ACC_LABEL", nullable = false)// nullable = false = champs obligatoire !
	private String accountLabel;
	
	@Column(name="ACC_CREATION_DATE", nullable = false)
	private Date accountCreationDate;
	
	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getAccountLabel() {
		return accountLabel;
	}

	public void setAccountLabel(String accountLabel) {
		this.accountLabel = accountLabel;
	}

	public Date getAccountCreationDate() {
		return accountCreationDate;
	}

	public void setAccountCreationDate(Date accountCreationDate) {
		this.accountCreationDate = accountCreationDate;
	}

	public Account() {}

	
	
	
	
	

}


