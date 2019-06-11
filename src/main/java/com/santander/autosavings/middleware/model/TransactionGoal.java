package com.santander.autosavings.middleware.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class TransactionGoal {
	
	@Id
	public String idTransactionGoal;
	public String account;
	public double value;
		
	
	public TransactionGoal() {		
	}

	public TransactionGoal(String idTransaction, String account, double value) {
		super();
		this.idTransactionGoal = idTransaction;
		this.value = value;
		this.account = account;

	}
	
	public String getIdTransactionGoal() {
		return idTransactionGoal;
	}

	public void setIdTransactionGoal(String idTransactionGoal) {
		this.idTransactionGoal = idTransactionGoal;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}
	
	

}
