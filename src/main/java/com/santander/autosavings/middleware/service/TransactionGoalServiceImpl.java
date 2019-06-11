package com.santander.autosavings.middleware.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.santander.autosavings.middleware.model.Goal;
import com.santander.autosavings.middleware.model.TransactionGoal;
import com.santander.autosavings.middleware.repository.TransactionGoalRepository;

@Service
public class TransactionGoalServiceImpl implements TransactionGoalService {

	@Autowired
	private TransactionGoalRepository transactGoalRepository;

	@Override
	public TransactionGoal save(TransactionGoal transactionGoal) {
		return transactGoalRepository.save(transactionGoal);
	}

	public TransactionGoal addMoney(String account, Goal goal, double addValue) {
		
		if (amountIsAvailable(addValue, account)) {			
			return transactGoalRepository.save(new TransactionGoal(goal.getId(), addValue, goal));
		}
		return null;
	}

	public double totalAmount(String acount) {

		double available = 5000.00;

		return available;
	}
	
	public boolean amountIsAvailable(double addValue, String account) {		
		return totalAmount(account) > addValue;
	}

}
