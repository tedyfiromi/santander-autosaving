package com.santander.autosavings.middleware.model;

public class AddMoneyObject {
	
	public String account;
	public String idGoal;
	public double addValue;
	
	
	public AddMoneyObject(String account, String idGoal, double addValue) {
		super();
		this.account = account;
		this.idGoal = idGoal;
		this.addValue = addValue;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getIdGoal() {
		return idGoal;
	}
	public void setIdGoal(String idGoal) {
		this.idGoal = idGoal;
	}
	public double getAddValue() {
		return addValue;
	}
	public void setAddValue(double addValue) {
		this.addValue = addValue;
	}	

}
