package com.santander.autosavings.middleware.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class TransactionGoal {
	
	@Id
	public String idTransactionGoal;
	public double value;
	
	@DBRef
	public Goal goal;	
	
	
	public TransactionGoal() {		
	}

	public TransactionGoal(String idTransaction, double value, Goal goal) {
		super();
		this.idTransactionGoal = idTransaction;
		this.value = value;
		this.goal = goal;
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

	public Goal getGoal() {
		return goal;
	}

	public void setGoal(Goal goal) {
		this.goal = goal;
	}

}
