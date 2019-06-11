package com.santander.autosavings.middleware.repository;

import org.springframework.stereotype.Repository;

import com.santander.autosavings.middleware.model.Goal;
import com.santander.autosavings.middleware.model.TransactionGoal;


@Repository
public class MoneyManagerRepositoryImpl implements MoneyManagerRepository{
	

	private TransactionGoalRepository transactGoalRepository;
	
	private TransactionGoal transactionGoal;
	


	@Override
	public void withDrawMoney() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addMoney(Goal goal, double value, String account) {	
		
		transactGoalRepository.insert(transactionGoal);			
		
	}
	
	public double availableMoney(String acount) {
		
		double available = 5000.00;
		
		return available;
	}
	
	
}
