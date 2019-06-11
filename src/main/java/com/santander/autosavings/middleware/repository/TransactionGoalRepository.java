package com.santander.autosavings.middleware.repository;

import com.santander.autosavings.middleware.model.TransactionGoal;

public interface TransactionGoalRepository {
	
	public TransactionGoal save(TransactionGoal transaction);

}
