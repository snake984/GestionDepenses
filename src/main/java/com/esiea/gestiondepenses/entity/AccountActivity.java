package com.esiea.gestiondepenses.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.esiea.gestiondepenses.commons.ActivityType;

/**
 * @author Mourad
 *
 */
@Entity
@Table(name="ACCOUNT_ACTIVITY")
public class AccountActivity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ACCOUNT_ACTIVITY_ID", nullable = false)
	private int activityID;
	
	@Column(name="ACTIVITY_LABEL", nullable = false)
	private String activityLabel;
	
	@Enumerated(EnumType.STRING) // Dépense ou Revenu = positive ou negative dans le compte.
	private ActivityType activityType;
	
	@Column(name="ACTIVITY_AMOUNT", nullable = false) // positive si on est dans le + etc ... crédit débité ou inséré.
	private int activityAmount;
	
	@Column(name="ACTIVITY_FREQUENCY")// mois , année.
	private int activityFrequency;
	
	@Column(name="ACTIVITY_CREATION_DATE", nullable = false)
	private Date activityCreationDate;
	
	@Column(name="ACTIVITY_PAYMENT_NUMBER", nullable = false) //Combien de fois on ajoute retire dans le mois ou année en fonction de ACTIVITY_AMOUNT. 
	private int activityPaymentNumber;

	public int getActivityID() {
		return activityID;
	}

	public void setActivityID(int activityID) {
		this.activityID = activityID;
	}

	public String getActivityLabel() {
		return activityLabel;
	}

	public void setActivityLabel(String activityLabel) {
		this.activityLabel = activityLabel;
	}

	public ActivityType getActivityType() {
		return activityType;
	}

	public void setActivityType(ActivityType activityType) {
		this.activityType = activityType;
	}

	public int getActivityAmount() {
		return activityAmount;
	}

	public void setActivityAmount(int activityAmount) {
		this.activityAmount = activityAmount;
	}

	public int getActivityFrequency() {
		return activityFrequency;
	}

	public void setActivityFrequency(int activityFrequency) {
		this.activityFrequency = activityFrequency;
	}

	public Date getActivityCreationDate() {
		return activityCreationDate;
	}

	public void setActivityCreationDate(Date activityCreationDate) {
		this.activityCreationDate = activityCreationDate;
	}

	public int getActivityPaymentNumber() {
		return activityPaymentNumber;
	}

	public void setActivityPaymentNumber(int activityPaymentNumber) {
		this.activityPaymentNumber = activityPaymentNumber;
	}
	
	
	
	
	
	
	
	

}
