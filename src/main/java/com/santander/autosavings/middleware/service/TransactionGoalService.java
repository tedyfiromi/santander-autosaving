package com.santander.autosavings.middleware.service;

import com.santander.autosavings.middleware.model.TransactionGoal;

public interface TransactionGoalService {
	
	public TransactionGoal addMoney(String account, String idGoal, double addValue);

}
