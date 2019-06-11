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
	
	@Autowired
	private GoalService goalService;

	@Override
	public TransactionGoal addMoney(String account, String idGoal, double addValue) {
		
		if (amountIsAvailable(addValue, account)) {	
			
			Goal goal = goalService.getGoalById(idGoal);
			
			TransactionGoal transact = transactGoalRepository.save(new TransactionGoal(account, addValue, goal));
			
			goal.setTransactionGoal(transact);
			
			goalService.updateGoal(goal);
			
			return transact;
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
