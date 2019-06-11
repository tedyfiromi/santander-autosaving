package com.santander.autosavings.middleware.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongodb.connection.Stream;
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
			
			List<TransactionGoal> listTransactions;
			TransactionGoal transact = new TransactionGoal();
			
			listTransactions = listTransactionsNeverNull(goal.getTransactionGoals());	
			
			transact.setAccount(account);
			transact.setValue(addValue);
			
			TransactionGoal transaction = transactGoalRepository.save(transact);			
			listTransactions.add(transaction);			
			goal.setTransactionGoal(listTransactions);			
			
			goalService.updateGoal(goal);
			
			return transaction;
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
	
	public List<TransactionGoal> listTransactionsNeverNull(List<TransactionGoal> listTransactions) {
		return listTransactions == null?new ArrayList<>():listTransactions;
	}

}
