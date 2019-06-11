package com.santander.autosavings.middleware.repository;

import com.santander.autosavings.middleware.model.Goal;

public interface MoneyManagerRepository {
	
	public void addMoney(Goal goal, double value, String account);
	
	public void withDrawMoney();

}
