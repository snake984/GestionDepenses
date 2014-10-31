package com.esiea.gestiondepenses.entity;

public class AccountHolder {
	
	int totalAmount,
		income,
		monthlyExpenses,
		lastMonthExpenses,
		currentMonthExpenses,
		nextMonthExpenses;

	public AccountHolder(int totalAmount) {
		this.totalAmount=totalAmount;
	}
	
	public AccountHolder(AccountHolder accountHolder) {
		this.currentMonthExpenses=accountHolder.currentMonthExpenses;
		this.income=accountHolder.income;
		this.lastMonthExpenses=accountHolder.lastMonthExpenses;
		this.monthlyExpenses=accountHolder.monthlyExpenses;
		this.nextMonthExpenses=accountHolder.nextMonthExpenses;
		this.totalAmount=accountHolder.totalAmount;
	}
	
	public int getIncome() {
		int income = this.income;
		return income;
	}


	public void setIncome(int income) {
		this.income = income;
	}


	public int getMonthlyExpenses() {
		int expenses = monthlyExpenses;
		return expenses;
	}


	public void setMonthlyExpenses(int monthlyExpenses) {
		this.monthlyExpenses = monthlyExpenses;
	}


	public int getLastMonthExpenses() {
		int expenses = lastMonthExpenses;
		return expenses;
	}


	public void setLastMonthExpenses(int lastMonthExpenses) {
		this.lastMonthExpenses = lastMonthExpenses;
	}


	public int getCurrentMonthExpenses() {
		return currentMonthExpenses;
	}


	public void setCurrentMonthExpenses(int currentMonthExpenses) {
		this.currentMonthExpenses = currentMonthExpenses;
	}


	public int getNextMonthExpenses() {
		return nextMonthExpenses;
	}


	public void setNextMonthExpenses(int nextMonthExpenses) {
		this.nextMonthExpenses = nextMonthExpenses;
	}


	public int getTotalAmount() {
		int amount = totalAmount;
		return amount;
	}
}
